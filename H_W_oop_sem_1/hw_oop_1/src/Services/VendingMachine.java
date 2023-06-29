package Services;

import java.util.List;

import Domen.Product;
/**
 * Класс машины по продаже продуктами
 */
public class VendingMachine {

    private Holder holder;
    private CoinDispenser dispenser;
    private List<Product> assort;
    private Display display;
/**
 * Конструктор машины по продаже продуктами
 * @param holder Пружинка-держатель
 * @param dispenser Купюроприемник
 * @param assort Набор товаров
 * @param display Информация на дисплее
 */
    public VendingMachine(Holder holder, CoinDispenser dispenser, List<Product> assort, Display display) {
        this.holder = holder;
        this.dispenser = dispenser;
        this.assort = assort;
        this.display = display;
    }
/**
 * Свойства класса машины по продаже продуктами
 * @return
 */
    public List<Product> getProducts() {
        return assort;
    }
/**
 * Метод покупки продукта
 * @param p Продукт
 * @param price Цена
 */
    public void buyProduct(Product p, int price) {
        if (assort.contains(p) && holder.getBalance() >= price) {
            if (dispenser.dispense(price)) {
                releaseProduct(p, holder);
                display.print("You have successfully bought " + p.getName() + ".");
            } 
        } else {
            display.print("Product not available or insufficient balance.");
        }
    }

    /**
     * Метод высвобождения продукта
     * @param p Продукт
     * @param h Прожика-держатель
     */
    public void releaseProduct(Product p, Holder h) {
        h.release(0, 0);
        assort.remove(p);
    }

    public void cancel() {
        dispenser.giveChahge(0, 0);
    }

    public Holder getHolder() {
        return holder;
    }

    public CoinDispenser getDispenser() {
        return dispenser;
    }

    public List<Product> getAssort() {
        return assort;
    }

    public Display getDisplay() {
        return display;
    }
}