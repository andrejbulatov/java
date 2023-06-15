package Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Task_3 {
  public static void findMaxMinMediumElementsOfList() {
    Random rnd = new Random();
    // создаем список
    List<Integer> iList = new ArrayList<>();
    // заполняем список
    for (int i = 0; i < 10; i ++) {
        iList.add(rnd.nextInt());
    }
    // печатаем список
    System.out.println("Исходный список");
    System.out.println(iList);
    System.out.println("Максимальное значение из списка");
    System.out.println(Collections.max(iList));
    System.out.println("Минимальное значение из списка");
    System.out.println(Collections.min(iList));
    // Среднее арифметическое элементов списка
    double sumElements = 0;
    for (Integer number : iList) {
      sumElements +=number;
    }
    double averageValue = sumElements/ iList.size();
    System.out.println("Среднее арифметическое элементов списка");
    System.out.printf("%.1f\n", averageValue);

  }
}
