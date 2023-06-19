package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Task1 {
// Объявляем список как переменную внутри класса
  private static LinkedList<String> list = new LinkedList<>();
// Выводится сообщение пользователю и считывается значение, которое он ввел
  private static String prompt (String msg) {
    Scanner inputValue = new Scanner(System.in);
    System.out.println(msg);
    return inputValue.nextLine();
  }


// Метод - обработчик, который собирает все команды над списком
  public static void run () {
    // Флаг, который даст выйти из while
    boolean getIteration = true;
    // Запускаем цикл, который будет спрашивать команды у пользователя и в зависимости от команды производить действия
    while (getIteration) {
      String command = prompt ("Enter command");
      // Делим введенное значение по значку ~ и переводит все значения в заглавные буквы
      String [] cLine = command.toUpperCase().split("~");
      // Действия на команды, которые вводит пользователь
      switch (cLine[0]) {
        // Выход из цикла
        case "EXIT":
          getIteration = false;
          break;
        // Печать указанного элемента списка 
        case "PRINT":
          System.out.println(list.get(Integer.parseInt(cLine[1])));
          break;
        // Печатаем наш список и удаляем его
        case "LIST":
          while (list.size() > 0) {
            System.out.println(list.pop());
          }
          break;
        // Выводим перевернутый список
        case "REVERSE":
          LinkedList<String> reverseList = new LinkedList<>(list);
          Collections.reverse(reverseList);
          for (int i = 0; i < reverseList.size(); i ++) {
            System.out.println(reverseList.get(i));
          }
          break;
        // По умолчанию добавляем элемент в список
        default: list.addFirst(cLine[0]);  
          break;         
      }
    }
  }

}
