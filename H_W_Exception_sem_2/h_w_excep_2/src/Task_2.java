// Задача 2:
// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException 
// с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.

import java.util.Scanner;
/**
 * Класс DivisionByZeroException, унаследованный от класса Exception
 */
class DivisionByZeroException extends Exception {
  /**
   * Конструктор класса DivisionByZeroException
   * @param message Поле Сообщение
   */
    public DivisionByZeroException(String message) {
        super(message);
    }
}
/**
 * Основной класс
 */
public class Task_2 {
    public static void main(String[] args) {
      //Переводим значения вводимые пользователем в double (Вызываем метод для запроса и считывания значения из терминала)
        double inputNumberFirst = Double.parseDouble(entryNumber("Input dividend: "));
        double inputNumberSecond = Double.parseDouble(entryNumber("Input divisor: "));      
        try {
          //Пытаемся вызвать функцию деления двух чисел и записать в переменную результат деления
            double result = divideNumbers(inputNumberFirst, inputNumberSecond);
            //Если делитель не равен 0, то выводит результат деления
            System.out.println("Result of division is " + inputNumberFirst + " / " + inputNumberSecond + " = " + result);
            //Если делитель равен 0, то выводим сообщение об ошибке
        } catch (DivisionByZeroException except) {
            System.out.println("Caught DivisionByZeroException: " + except.getMessage());
        }
    }
/**
 * Метод деления двух чисел
 * @param dividend Делимое
 * @param divisor Делитель
 * @return
 * @throws DivisionByZeroException
 */
    public static double divideNumbers(double dividend, double divisor) throws DivisionByZeroException {
      // Если делитель равен 0, то вызывает класс DivisionByZeroException с указанным сообщением, что делить на ноль нельзя  
      if (divisor == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed");
        }
      // Если делитель не равен 0, то возвращаем результат деления
      return dividend / divisor;
    }
/**
 * Метод запроса и считывания числа пользователя из терминала
 * @param message Сообщение для пользователя перед вводом им значения
 * @return
 */
    public static String entryNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
  }