// Подумать над структурой класса Ноутбук(или Единорогов) для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Переопределить toString, equals и hashCode(как на семинаре).
// Вывести на печать экземпляры класса, сравнить пару экземпляров и найти один экземпляр в наборе.

package NotebookShop;

import java.util.Objects;

// Создаю класс ноутбуков
public class Notebook {
    // Задаю поля
    public long id;
    public String brand;
    public double price;
    public double weight;
    public double diagonal;
    public int color;
    public String os;
    public String ram;
    public String countryProduced;
    // Создаю конструктор
    public Notebook(long id, String brand, double price, double weight, double diagonal, int color, String os, String ram,
      String countryProduced) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.diagonal = diagonal;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.countryProduced = countryProduced;
  }
    // Метод наличия в магазине ноутбука
    public boolean isAvailable() {
      return true;
    }
    // Переопределяю метод печати
    @Override
    public String toString() {
      // TODO Auto-generated method stub
      return "ID: "+ id+" Марка: "+brand+" Цена: "+price+" Масса: "+weight+" Диагональ: "+diagonal+" Цвет: "+color+" ОС: "+os+" ОЗУ: "+ram+
              " Страна производитель: "+countryProduced;
    }
    // Переопределяю метод сравнения
    @Override
    public boolean equals(Object notebook) {
      // TODO Auto-generated method stub
        if (this == notebook) return true;
        if (notebook == null || getClass() != notebook.getClass()) return false;
        Notebook laptop = (Notebook) notebook;
        return weight == laptop.weight && brand == laptop.brand && ram == laptop.ram && diagonal == laptop.diagonal;
    }
    // Переопределяю метод для поиска в сете
    @Override
    public int hashCode() {
      // TODO Auto-generated method stub
      return Objects.hash(weight, brand, ram, diagonal);
    }

}


