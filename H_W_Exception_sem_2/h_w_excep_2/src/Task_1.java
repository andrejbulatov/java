// Задача 1:
// Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. 
// Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException 
// с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

import java.util.Scanner;
/**
 * Класс InvalidNumberException, унаследованный от класса Exception
 */
class InvalidNumberException extends Exception {
  /**
   * Конструктор класса InvalidNumberException
   * @param message Поле Сообщение
   */
    public InvalidNumberException(String message) {
        super(message);
    }
}
/**
 * Основной класс
 */
public class Task_1 {
    public static void main(String[] args) {
      //Переводим значение вводимое пользователем в int (Вызываем метод для запроса и считывания значения из терминала)
        int inputNumber = Integer.parseInt(entryNumber("Input number: "));
        try {
          //Пытаемся вызвать функцию проверки числа на положительность
            checkPositiveNumber(inputNumber);
            //Если число положительно, то выводит сообщение о корректности числа
            System.out.println("Number " + inputNumber + " is correct");
            //Если не положительное, то выводим сообщение об ошибке
        } catch (InvalidNumberException except) {
            System.out.println("Caught InvalidNumberException: " + except.getMessage());
        }
    }
/**
 * Метод проверки числа на то что число положительное
 * @param number Проверяемое число
 * @throws InvalidNumberException
 */
    public static void checkPositiveNumber(int number) throws InvalidNumberException {
      // Если число меньше или равно 0, то вызывает класс InvalidNumberException с указанным сообщением, что число некорректное  
      if (number <= 0) {
            throw new InvalidNumberException("Number is not correct");
        }
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


