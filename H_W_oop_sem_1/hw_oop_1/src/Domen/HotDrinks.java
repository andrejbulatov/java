package Domen;
  /**
   * Класс горячие напитки, он унаследован от класса Product
   */
public class HotDrinks extends Product {

    private int temperature;
/**
 * Конструктор класса Горячие напитки
 * @param price Цена
 * @param place Месторасположение
 * @param name Наименование
 * @param id Идентификатор
 * @param temperature Температура
 */
    public HotDrinks(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }
/**
 * Свойства класса Горячие напитки
 * @return
 */
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
/**
 * Переопределение метода toString
 */
    @Override
    public String toString() {
        return super.toString() + "Temperature of drink = " + temperature + "\n";
    }
  
}
