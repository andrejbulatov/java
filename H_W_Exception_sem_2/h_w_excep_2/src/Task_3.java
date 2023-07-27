// Задача3: - по желанию
// Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

// Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
// Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
// Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
// Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
// - необходимо создать 3 класса собвстенных исключений


import java.util.Scanner;
/**
 * Класс NumberOutOfRangeException, унаследованный от класса RuntimeException
 */
class NumberOutOfRangeException extends RuntimeException {
  /**
   * Конструктор класса NumberOutOfRangeException
   * @param message Поле Сообщение
   */
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

class NumberSumException extends RuntimeException {
  /**
   * Конструктор класса NumberSumException
   * @param message Поле Сообщение
   */
    public NumberSumException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends RuntimeException {
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
public class Task_3{
    public static void main(String[] args) {
      //Переводим значения вводимые пользователем в int (Вызываем метод для запроса и считывания значения из терминала)
        int inputNumberFirst = Integer.parseInt(entryNumber("Input first number: "));
        int inputNumberSecond = Integer.parseInt(entryNumber("Input second number: "));
        int inputNumberThird = Integer.parseInt(entryNumber("Input third number: "));     
        try {
          //Пытаемся вызвать функцию проверки первого числа
            checkFirstNumber(inputNumberFirst);
          //Пытаемся вызвать функцию проверки второго числа
            checkSecondNumber(inputNumberSecond);
          //Пытаемся проверить сумму первого и второго числа
            checkSumNumbers(inputNumberFirst, inputNumberSecond);
          //Пытаемся проверить третье число 0
            checkNumberOnZero(inputNumberThird);
          //Если все проверки пройдены успешно, то выводим сообщение об успешности проверки
            System.out.println("Verification passed successfully");
            //Если первое и второе число за допустимым диапазоном, то выводим сообщение об ошибке
        } catch (NumberOutOfRangeException exceptOutOfRange) {
            System.out.println("Caught NumberOutOfRangeException: " + exceptOutOfRange.getMessage());
        } catch (NumberSumException exceptSum) {
            System.out.println("Caught NumberSumException: " + exceptSum.getMessage());
        } catch (DivisionByZeroException exceptSum) {
            System.out.println("Caught DivisionByZeroException: " + exceptSum.getMessage());
        }
    }

    public static void checkFirstNumber(int number) throws NumberOutOfRangeException {
      // Если первое число больше 100, то вызывает класс NumberOutOfRangeException с указанным сообщением, что вне допустимого диапазона  
        if (number > 100) {
            throw new NumberOutOfRangeException("First number out of allowable range");
        }
    }

    public static void checkSecondNumber(int number) throws NumberOutOfRangeException {
      // Если второе число меньше 0, то вызывает класс NumberOutOfRangeException с указанным сообщением, что вне допустимого диапазона  
        if (number < 0) {
            throw new NumberOutOfRangeException("Second number out of allowable range");
        }
    }

    public static void checkSumNumbers(int numberFirst, int numberSecond) throws NumberSumException {
        // Если сумма первого и второго числа меньше 10, то вызывает класс NumberSumException с указанным сообщением, что сумма чисел очень мала  
        if (numberFirst + numberSecond < 10) {
            throw new NumberSumException("The sum of two numbers is very small");
        }
    }

    public static void checkNumberOnZero(int number) throws DivisionByZeroException {
        // Если третье число равно 0, то вызывает класс DivisionByZeroException с указанным сообщением, что делить на ноль нельзя  
        if (number == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed");
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