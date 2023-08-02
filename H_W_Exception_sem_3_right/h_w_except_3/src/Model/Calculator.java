package Model;

import Controller.iCalculator;
/**
 * Создаю класс калькулятор
 */
public class Calculator implements iCalculator {
  
    private int firstNumber;
    private int secondNumber;
/**
 * Создаю два конструктора класса калькулятор
 */
    public Calculator() {
    }

    public Calculator(int firstNumber, int secondNumber) {
      this.firstNumber = firstNumber;
      this.secondNumber = secondNumber;
    }
/**
 * Переопределяю методы сложения вычитания умножения деления
 */
    @Override
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double division(int firstNumber, int secondNumber) {
        if (secondNumber == 0) throw new ArithmeticException("Division by zero is not allowed");
        return (double)firstNumber / (double)secondNumber;
    }

    @Override
    public int multiply(int firstNumber, int secondNumber) {
        if (firstNumber > Integer.MAX_VALUE / secondNumber) throw new ArithmeticException("Int type overflow");
        return firstNumber * secondNumber;
    }

    @Override
    public int difference(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

}
