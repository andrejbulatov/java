package View;

import java.util.Scanner;

import Model.Calculator;
import Model.PowerCalculator;
/**
 * Класс view
 */
public class ViewCalculator {

    private Calculator calculator;
    private PowerCalculator pCalculator;
/**
 * Конструктор класса view
 * @param calculator
 */
    public ViewCalculator(Calculator calculator, PowerCalculator pCalculator) {
          this.calculator = calculator;
          this.pCalculator = pCalculator;
    }
/**
 * Метод run где создаю новый объект calculator, запрашиваю данные у пользователя и вывожу в терминал результаты операций с исключениями
 */   
    public void run() {
        Calculator calculator = new Calculator();
        PowerCalculator pCalculator = new PowerCalculator();
        try {
            int firstNumber = promptInt("Введите первое число: ");
            int SecondNumber = promptInt("Введите второе число: ");
            System.out.print("Сумма чисел: ");
            System.out.println(calculator.sum(firstNumber, SecondNumber));
            System.out.print("Разность чисел: ");
            System.out.println(calculator.difference(firstNumber, SecondNumber));
            try {
                System.out.print("Частное от деления чисел: ");
                System.out.println(calculator.division(firstNumber, SecondNumber));
            } catch (Exception e) {
                System.out.println("Caught error " + e.getMessage());
            }
            try {
                System.out.print("Произведение чисел: ");            
                System.out.println(calculator.multiply(firstNumber, SecondNumber));
            } catch (Exception e) {
                System.out.println("Caught error " + e.getMessage());
            }
            try {
            System.out.print("Число возведенное в степень: ");           
            System.out.println(pCalculator.power(firstNumber, SecondNumber));
            } catch (Exception e) {
                System.out.println("Caught error " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Caught error " + e.getMessage());
        }
            
    }
/**
 * Метод запроса значения, вывода сообщения, считывания введенног значения и преобразования в int
 * @param message
 * @return
 */
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        String str = in.nextLine();
        if (str.matches("//d+")) throw new NumberFormatException("Uncorrect data");
        return Integer.parseInt(str);
    }
}
