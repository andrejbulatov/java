package Controller;

import Model.Logger;
/**
 * СОздаю класс декоратор
 */
public class CalcDecorator implements iCalculable {

    private iCalculable oldCalc;
    private Logger logger;
/**
 * Конструктор декоратора
 * @param oldCalc калькулятор
 * @param logger логгер
 */ 
    public CalcDecorator(iCalculable oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }
/**
 * Переопределяю методы сложения умножения и деления и получения результата и включаю туда логирование
 */
    @Override
    public iCalculable sum(double argReal, double argImaginary) {
        double[] firstArg = oldCalc.getResult();
        
        logger.log(String.format("Первое значение калькулятора: действительная часть " + String.format("%.2f", firstArg[0]) + 
                                 ", мнимая часть " + String.format("%.2f", firstArg[1])));
        
        logger.log(String.format("Начало вызова метода sum со вторым значением калькулятора: действительная часть " + 
                                  String.format("%.2f", argReal)+", мнимая часть "+String.format("%.2f", argImaginary)));
        
        iCalculable result = oldCalc.sum(argReal, argImaginary);
        
        logger.log(String.format("Вызов метода sum произошел"));
        
        return result;
    }

    @Override
    public iCalculable multi(double argReal, double argImaginary) {
        double[] firstArg = oldCalc.getResult();
        
        logger.log(String.format("Первое значение калькулятора: действительная часть " + String.format("%.2f", firstArg[0]) + 
                                  ", мнимая часть " + String.format("%.2f", firstArg[1])));
        
        logger.log(String.format("Начало вызова метода multi со вторым значением калькулятора: действительная часть " + 
                                 String.format("%.2f", argReal) + ", мнимая часть " + String.format("%.2f", argImaginary)));
        
        iCalculable result = oldCalc.multi(argReal, argImaginary);
        
        logger.log(String.format("Вызов метода multi произошел"));
        
        return result;
    }

    @Override
    public iCalculable devide(double argReal, double argImaginary) {
        double[] firstArg = oldCalc.getResult();
        
        logger.log(String.format("Первое значение калькулятора: действительная часть " + String.format("%.2f", firstArg[0]) + 
                                 ", мнимая часть "+String.format("%.2f", firstArg[1])));
        
        logger.log(String.format("Начало вызова метода devide со вторым значением калькулятора: действительная часть " + 
                                 String.format("%.2f", argReal) + ", мнимая часть "+ String.format("%.2f", argImaginary)));
        
        iCalculable result = oldCalc.devide(argReal, argImaginary);
        
        logger.log(String.format("Вызов метода devide произошел"));
        
        return result;
    }

    @Override
    public double[] getResult() {
        double[] result = oldCalc.getResult();
        logger.log(String.format("Получение результата: действительная часть " + String.format("%.2f", result[0]) + 
                                 ", мнимая часть " + String.format("%.2f", result[1])));
        return result;
    }
  
}
