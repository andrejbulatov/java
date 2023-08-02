package Controller;

/**
 * Задаю интерфейс, определяю методы, для каждого на входе два целых числа
 */
public interface iCalculator {

    int sum(int a, int b);
    int difference(int a, int b);
    double division(int a, int b);
    int multiply(int a, int b);

}
