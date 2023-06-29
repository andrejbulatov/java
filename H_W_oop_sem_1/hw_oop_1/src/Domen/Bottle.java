package Domen;
/**
 * Класс Бутылка, унаследованный от класса Product
 */
public class Bottle extends Product {

    private float bottleVolume;

/**
 * Конструктор класса Бутылка
 * @param price Цена
 * @param place Месторасположение
 * @param name Наименование
 * @param id Идентификатор
 * @param bottleVolume Объем
 */
     public Bottle (int price, int place, String name, long id, float bottleVolume) {
        super(price,place,name,id);
        this.bottleVolume = bottleVolume;
    }

 public  Bottle(int price, int place, String name, long id) {
        super(price,place,name,id);
        this.bottleVolume = 0f;
    }
/**
 * Свойства класса Бутылка
 * @return
 */
    public float getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(float bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

/**
 * Переопределение метода toString
 */
    @Override
    public String toString() {
        return super.toString() + "volume = " + bottleVolume + "\n";
    }

}