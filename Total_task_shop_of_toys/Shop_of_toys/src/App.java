import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import general.ProgrammFileWriter;
import model.Toys;

import static general.Vars.allToys;
import static general.Vars.winsToys;

public class App {

    public static void main(String[] args) {
        // Создаем игрушки
        Toys constructorToys = new Toys(1, "lego", 5, 25);
        Toys car = new Toys(2, "car", 4, 30);
        Toys doll = new Toys(3, "doll", 3, 35);
        Toys ball = new Toys(4, "ball", 4, 20);
        Toys robot = new Toys(5, "robot", 5, 20);
        Toys telephon = new Toys(6, "telephone", 3, 40);
        Toys softToy = new Toys(7, "softToy", 5, 50);

        // Добавляем игрушки в список и изменяем вес
        addToListWithNewWeight(constructorToys, 15);
        addToListWithNewWeight(car, 10);
        addToListWithNewWeight(doll, 25);
        addToListWithNewWeight(ball, 5);
        addToListWithNewWeight(robot, 15);
        addToListWithNewWeight(telephon, 7);
        addToListWithNewWeight(softToy, 30);

        // Выводим общий список игрушек
        System.out.println("all toys: ");
        showNewList(allToys);

        // Составляем список призовых игрушек (с весом от 15)
        List<Toys> addedWinners = selectToyByMinWeight(allToys, 15);
        winsToys.addAll(addedWinners);

        // Выводим призовые игрушки
        System.out.println("winners list: ");
        showNewList(winsToys);

        // Выбираем призовую игрушку на выдачу из призового списка рандомно
        Toys givedWinner = selectRandomToy(winsToys);

        // Удаляем выданную игрушку из списка
        winsToys.remove(givedWinner);

        // Выводим информацию о выданной игрушке
        System.out.println("победная игрушка: " + givedWinner.info());

        // Записываем информацию в файл
        ProgrammFileWriter.writeToy(givedWinner);

    }

    private static List<Toys> selectToyByMinWeight(ArrayList<Toys> allToys, int minWeight) {
        List<Toys> result = new ArrayList<>();
        for (Toys currenToy : allToys) {
            if (currenToy.getWeight() <= minWeight) {
                result.add(currenToy);
            }
        }
        return result;

    }

    private static Toys selectRandomToy(ArrayList<Toys> winsToys) {
        Random rand = new Random();
        int winnerElement = rand.nextInt(winsToys.size());
        return winsToys.get(winnerElement);
    }

    private static void addToListWithNewWeight(Toys newToy, int newWeight) {
        newToy.setWeight(newWeight);
        allToys.add(newToy);
    }

    private static void showNewList(ArrayList<Toys> myList) {
        int winListSize = myList.size();
        for (int i = 0; i < winListSize; i++) {
            System.out.println("toy [" + i + "]: " + myList.get(i).getName() + ", ");
        }
        System.out.println("");
    }

}