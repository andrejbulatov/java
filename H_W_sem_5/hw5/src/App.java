import java.util.HashMap;
import java.util.List;

import Solution.Task1;

public class App {
    public static void main(String[] args) throws Exception {
        // Задание 1
        System.out.println("Task1");
        // Задаем исходные данные для телефонной книги
        String[] dataPhones = new String[] {"Иванов 890256789565", "Петров 8888", "Иванов 99999", "Сидоров 888333", "Петров 883333"};
        // Вызываем метод по первой задаче для добавления данных в hashmap
        HashMap<String, List<String>> contacts = Phonebook.Task1.PhoneFill(dataPhones);
        System.out.println();
        // Печатаем телефонную книгу - наш hashmap
        Phonebook.Task1.printPhonebook(contacts);
        System.out.println();   

        // Задание 2
        System.out.println("Task2");
        // Задаем исходный массив
        int[] inputArray = new int[] { 1, 6, 15, 3, 4, 5, 10, 7, 16, 3, 9 };
        // Напечатаем исходный массив для сравнения
        System.out.println("Not sorted array is");
        HeapSort.Task2.printArray(inputArray);
        // Вызываем метод сортировки по второй задаче
        // HeapSort ob = new HeapSort();
        HeapSort.Task2.sort(inputArray);
        // Печатаем отсортированный массив
        System.out.println("Sorted array is");
        HeapSort.Task2.printArray(inputArray);
    }
}
