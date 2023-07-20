import Controller.CalcDecorator;
import Controller.iCalculable;
import Controller.iCalculatorFactory;
import Model.Calculator;
import Model.LogCalculatorFactory;
import Model.Logger;
import View.ViewCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        
        iCalculatorFactory calculableFactory = new LogCalculatorFactory(new Logger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
