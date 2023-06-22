package Phonebook;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {

  // Реализуйте структуру телефонной книги с помощью HashMap. Программа также должна учитывать, 
  // что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, 
  // как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
  // (можно выводить без сортировки, но обязательно в отдельном методе)

  // Создаем hashmap, который в себе будет хранить фамилию и список тел номеров
  private static HashMap<String, List<String>> contacts = new HashMap<>();

  // Метод, который будет добавлять новые контакты в телефонную книгу, на входе массив строк типа "Фамилия Номер телефона"
  public static HashMap<String, List<String>> PhoneFill(String[] phones) {
    // Разбиваю элементы на фамилию и номер телефона
    for (String s : phones) {
      String [] stringPhone = s.split(" ");
      // Если такая фамилия есть, то добавляем номер телефона
      if (contacts.containsKey(stringPhone[0])) {
        // Получаю список номеров по фамилии из hashmap
        List<String> phoneList = contacts.get(stringPhone[0]);
        // Добавляю новый телефон в этот список
        phoneList.add(stringPhone[1]);
        // Сохраняю список в hashmap
        contacts.put(stringPhone[0], phoneList);
      }
      // Если фамилии нет, то создаем новую запись - контакт
      else {
        List<String> phoneList = new ArrayList<>();
        // Добавляю телефон в список
        phoneList.add(stringPhone[1]);
        // Сохраняю новый контакт в hashmap
        contacts.put(stringPhone[0], phoneList);
      }
    }
    return contacts;
  }

  // Метод для печати телефонной книги
  public static void printPhonebook(HashMap<String, List<String>> contacts) {
    // Создаю список из записей, которые в hashmap
    ArrayList<Map.Entry<String, List<String>>> sortedMap = new ArrayList(contacts.entrySet());
    // Используя компаратор сортирую список в порядке убывания количества телефонных номеров
    Collections.sort(sortedMap, new Comparator<Map.Entry<String, List<String>>>(){
        @Override
        public int compare(Map.Entry<String, List<String>> objectFirst, Map.Entry<String, List<String>> objectSecond)
                {
                    return objectSecond.getValue().size() - objectFirst.getValue().size();
                }
            }
        );
    // Печать отсортированного hashmap
    for (Map.Entry<String, List<String>> items : sortedMap) {
      System.out.println(items.getKey() + ":" + items.getValue());
    }
  }
}
