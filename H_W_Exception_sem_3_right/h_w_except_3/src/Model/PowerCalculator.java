package Model;

import Controller.iPowerCalculator;

public class PowerCalculator implements iPowerCalculator {

    private int firstNumber;
    private int secondNumber;
/**
 * Создаю два конструктора класса калькулятор возведения в степень
 */
    public PowerCalculator() {
    }

    public PowerCalculator(int firstNumber, int secondNumber) {
      this.firstNumber = firstNumber;
      this.secondNumber = secondNumber;
    }
/**
 * Переопределяю метод возведения в степень
 */
    @Override
    public int power(int firstNumber, int secondNumber) throws InvalidInputException {
        if (firstNumber == 0 | secondNumber < 0) throw new InvalidInputException("Invalid base (zero) and negative exponent");
        return (int) Math. pow(firstNumber, secondNumber);
    }
}
