package Controller;

import Model.InvalidInputException;
/**
 * Задаю интерфейс, определяю метод возведения в степень, на входе 2 целых числа
 */
public interface iPowerCalculator {
    int power(int a, int b) throws InvalidInputException;
}
