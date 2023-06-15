package Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_2 {
  // Метод создания нового списка и удаления из него четных чисел
  public static void fillListAndDeleteEvenNumbers() {
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
      // создаем список для четных значений
      List<Integer> delList = new ArrayList<>();
      // записываю в список четные значения
      for (Integer number : iList) {
        if (number % 2 == 0) delList.add(number);
      }
      // удаляю из исходного списка список с четными значениями
      iList.removeAll(delList);
      // печатаю полученный список
      System.out.println("Список без четных чисел");
      System.out.println(iList);
    }

}


