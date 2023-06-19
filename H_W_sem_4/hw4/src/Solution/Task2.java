package Solution;

import java.util.LinkedList;

public class Task2 {
  
  public static void workWithList (LinkedList<String> list) {
    // Вызываем методы и печатаем результаты
    System.out.println("Помещаем элемент 'Russian Federation' в конец очереди");
    System.out.println(enqueue(list, "Russian Federation"));   
    System.out.println("Первый элемент в списке, который удален");
    System.out.println(dequeue(list));    
    System.out.println("Первый элемент в списке");
    System.out.println(first(list));
    System.out.println("Окончательный список");
    System.out.println(list);
  }
  // Метод добавления элемента в конец списка
  private static LinkedList<String> enqueue (LinkedList list, String element) {
    list.addLast(element);
    return list;
  }
  // Метод выбора возврата первого элемента списка и его удаление
  private static String dequeue (LinkedList list) {
    return (String) list.remove();
  }
  // Метод возврата первого элемента списка без его удаления
  private static String first (LinkedList list) {
    return (String) list.getFirst();
  }
}
