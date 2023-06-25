import java.util.HashSet;

import NotebookShop.Notebook;

public class App {
    public static void main(String[] args) throws Exception {
        // Создаю ноутбуки с конкретными характеристиками
        Notebook firstLaptop = new Notebook(1, "ASUS M1502IA-BQ093", 47_999, 1.7, 15.6, 
                                            190, "не установлена", "16 Гб", "China");
        Notebook secondLaptop = new Notebook(2, "Thunderobot 911 Air Wave D", 59_999, 2.15, 15.6, 
                                            000, "DOS", "8 Гб", "China");
        Notebook thirdLaptop = new Notebook(3, "Apple MacBook Air 15 M2", 164_999, 1.51, 15.3, 
                                            190, "macOS", "8 Гб", "China");
        Notebook fourthLaptop = new Notebook(4, "Apple MacBook Air 15 M2", 166_999, 1.51, 15.3, 
                                            251, "macOS", "8 Гб", "China");
        // Создаю множество ноутбуков и добавляю их в сет
        HashSet<Notebook> laptopSet = new HashSet<Notebook>();
        laptopSet.add(firstLaptop);
        laptopSet.add(secondLaptop);
        laptopSet.add(thirdLaptop);
        laptopSet.add(fourthLaptop);
        // Печатаю информацию по двум ноутбукам
        System.out.println("Информация по ноутбукам:");
        System.out.println(firstLaptop);
        System.out.println(secondLaptop);
        System.out.println((thirdLaptop));
        System.out.println(fourthLaptop);
        // Сравниваю ноутбуки
        System.out.println("Сравнение ноутбуков:");
        System.out.println("1 и 3 "+firstLaptop.equals(thirdLaptop));
        System.out.println("3 и 4 "+fourthLaptop.equals(thirdLaptop));
        // Есть ли ноутбук в множестве
        System.out.println("Ноутбук 2 есть ли у нас "+laptopSet.contains(secondLaptop));
    }
}
