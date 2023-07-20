package Model;

import Controller.iCalculable;
import Controller.iCalculatorFactory;

  /**
   * Фабрика, создающая "продукт" - калькулятор. Имплементацию интерфеса делаю, описываю метод создания калькулятора
   */ 
public class CalculatorFactory implements iCalculatorFactory {
    
    public iCalculable create(double primaryReal, double primaryImaginary) {
        return new Calculator(primaryReal, primaryImaginary);
    }
}
