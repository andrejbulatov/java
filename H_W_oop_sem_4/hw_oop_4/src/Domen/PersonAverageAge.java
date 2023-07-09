package Domen;

import java.util.ArrayList;
import java.util.List;
/**
 * Класс Средний возраст персоны - общий для всех классов наследованных от Персоны
 */
public class PersonAverageAge <T extends Person> {
  
    private List<T> listPerson = new ArrayList<T>();
    private int age;
    private double averageAge;
    

/**
 * Метод определения среднего возраста для списка персон
 */
    private void averAge() {
        for (T i : listPerson){
            age += i.getAge();
        }
        averageAge = (double) age/ listPerson.size();
    }
/**
 * Вызывается метод подсчета среднего возраста по списку, публичный
 * @param listPerson список персон
 */
    public void averageAge(List<T> listPerson){
        this.listPerson = listPerson;
        averAge();
    }
/**
 * Метод печати среднего возраста
 */
    public void averageResult() {

        System.out.printf("Средний возраст = %.2f", averageAge);
    }
}
