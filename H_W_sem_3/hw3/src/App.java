import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Solution.Task_1;
import Solution.Task_2;
import Solution.Task_3;

public class App {
    public static void main(String[] args) throws Exception {
    
    // Задание 1
    // Реализовать алгоритм сортировки слиянием
    // Задаю исходный массив
    
    int[] inputArray = new int[] { 1, 6, 15, 3, 4, 5, 10, 7, 16, 3, 9 };
    // Вызываю метод
    int [] result = Task_1.sortArray(inputArray);
    System.out.println("Task1");
    // Печатаю итоговый массив
    System.out.println("Отсортированный массив");
    for (int i = 0; i < result.length ; i++) {
        System.out.print(result[i] + " ");
    }
    
    System.out.println();

    // Задание 2
    // Пусть дан произвольный список целых чисел, удалить из него четные числа
    System.out.println("Task2");
    // Вызываем метод, который создаст новый список и удалит из него четные значения
    Task_2.fillListAndDeleteEvenNumbers();
    
    System.out.println();

    // Задание 3
    // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
    System.out.println("Task3");
    // Вызываю метод
    Task_3.findMaxMinMediumElementsOfList();





    }
}
