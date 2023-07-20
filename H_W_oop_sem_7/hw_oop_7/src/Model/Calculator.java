package Model;

import Controller.iCalculable;
/**
 * Создаем класс калькулятор
 */

public class Calculator implements iCalculable {

    /**
     * Действительная часть комплексного числа
     */
    private double real;

    /**
     * Мнимая часть комплексного числа
     */
    private double imaginary;

    public Calculator() {
      
    }

    /**
     * Конструктор
     */
    public Calculator(double primaryReal, double primaryImaginary) {
        this.real = primaryReal;
        this.imaginary = primaryImaginary;
    }

    /**
     * Переопределяю метод суммы
     */ 
    @Override
    public iCalculable sum(double argReal, double argImaginary) {
        this.real += argReal;
        this.imaginary += argImaginary;
        return this;
    }
    /**
     * Переопределяю метод умножения
     */ 
    @Override
    public iCalculable multi(double argReal, double argImaginary) {
        this.real = this.real * argReal - this.imaginary * argImaginary;
        this.imaginary = this.real * argImaginary + this.imaginary * argReal;
        return this;
    }

    /**
     * Переопределяю метод деления
     */ 
    @Override
    public iCalculable devide(double argReal, double argImaginary) {
        double denominator = argReal * argReal + argImaginary * argImaginary;
        this.real = (this.real * argReal + this.imaginary * argImaginary) / denominator;
        this.imaginary = (this.imaginary * argReal - this.real * argImaginary) / denominator;
        return this;
    }
    
    /**
     * Возвращаю результат в виде массива из двух элементов: получившейся действительной и мнимой части комплексного числа
     */
    @Override
    public double[] getResult() {
        return new double[] {this.real, this.imaginary};
    }

}
