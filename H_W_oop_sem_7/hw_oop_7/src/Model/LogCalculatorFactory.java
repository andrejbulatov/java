package Model;

import Controller.CalcDecorator;
import Controller.iCalculable;
import Controller.iCalculatorFactory;
/**
 * "Фабрика", которая создаёт декоратор LogCalculator, с помощью которого добавляю логгер к калькулятору.
 */
public class LogCalculatorFactory implements iCalculatorFactory{
    private Logger logger;

    public LogCalculatorFactory(Logger logger){
        this.logger = logger;
    }
    @Override
    public iCalculable create(double primaryReal, double primaryImaginary) {
        return new CalcDecorator(new Calculator(primaryReal, primaryImaginary), logger);
    }
}
