package Controller;

/**
 * Интерфейс для фабрики с методом создания
 */
public interface iCalculatorFactory {
    iCalculable create(double primaryReal, double primaryImaginary);
}
