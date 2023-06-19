import java.util.ArrayDeque;
import java.util.LinkedList;

import Solution.Task1;
import Solution.Task2;

public class App {
    public static void main(String[] args) throws Exception {
        // Вызываем метод по первой задаче
        System.out.println("Task1");
        Task1.run();

        System.out.println();   
        System.out.println("Task2");
        // Создаем список, с которым будем работать
        LinkedList<String> list = new LinkedList<>();;
        list.add("Germany");
        list.addFirst("France"); // добавляем элемент в самое начало
        list.push("Great Britain"); // добавляем элемент в самое начало
        list.addLast("Spain"); // добавляем элемент в конец коллекции
        list.add("Italy");
        System.out.println("Исходный список");
        System.out.println(list);
        Task2.workWithList(list);

    }
}
