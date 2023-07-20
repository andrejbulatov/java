package Controller;

/**
 * Задаю интерфейс, определяю методы. Для всех методов принимаю два числа - действительную часть комплексного числа и мнимую.
 */

public interface iCalculable {

    iCalculable sum(double primaryReal, double primaryImaginary);
    iCalculable multi(double primaryReal, double primaryImaginary);
    iCalculable devide(double primaryReal, double primaryImaginary);
    double[] getResult();

}
