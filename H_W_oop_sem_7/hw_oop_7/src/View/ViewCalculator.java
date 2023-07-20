package View;

import java.util.Scanner;

import Controller.iCalculable;
import Controller.iCalculatorFactory;
/**
 * Класс отображения пользователю
 */
public class ViewCalculator {
  
    private iCalculatorFactory calculatorFactory;
/**
 * Конструктор
 * @param calculatorFactory определяю новый калькулятор
 */
    public ViewCalculator(iCalculatorFactory calculatorFactory) {
        this.calculatorFactory = calculatorFactory;
    }
/**
 * Запускаю калькулятор для пользователя
 */
    public void run() {
        while (true) {           
            double primaryReal = promptDouble("Введите действительную часть комплексного числа: ");
            double primaryImaginary = promptDouble("Введите мнимую часть комплексного числа: ");
/**
 * Создаю калькулятор
*/            
            iCalculable calculator = calculatorFactory.create(primaryReal, primaryImaginary);
/**
 * В цикле спрашиваю у пользователя команду и второе число или завершение расчета при вводе =
 */
            while (true) {
                String cmd = prompt("Введите команду (+, *, /, =): ");                
                if (cmd.equals("=")) {                    
/**
 * Запрашиваю получившуюся дейсвительную и мнимую части комплексного числа
 */
                    double[] result = calculator.getResult();                    
/**
 * Форматирую вывод комплесного числа из его действительной и мнимой частей
 */
                    String output;
                    if (result[0] == 0) {
                        output = String.format("%.2f", result[1]);
                    } else if (result[1] == 0) {
                        output = String.format("%.2fi", result[0]);
                    } else if (result[1] < 0) {
                        output = String.format("%.2f - %.2fi", result[0], Math.abs(result[1]));
                    } else {
                        output = String.format("%.2f + %.2fi", result[0], result[1]);
                    }
                    System.out.println("Результат: "+output);
                    break;
                }
                else {
/**
 * Если выбрана дальнейшая операция (не "равно"), запрашиваем элементы второго комплексного числа
 */
                    double argReal = promptDouble("Введите действительную часть следующего комплексного числа: ");
                    double argImaginary = promptDouble("Введите мнимую часть следующего комплексного числа: ");

                    if (cmd.equals("+")) {
                        calculator.sum(argReal, argImaginary);
                        continue;
                    }
                    if (cmd.equals("*")) {
                        calculator.multi(argReal, argImaginary);
                        continue;
                    }
                    if (cmd.equals("/")) {
                        calculator.devide(argReal, argImaginary);
                        continue;
                    }
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }

}
