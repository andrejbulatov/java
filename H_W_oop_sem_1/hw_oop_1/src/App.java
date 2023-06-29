import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrinks;
import Domen.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
/**
 * Задаем экземляры класса продукты, бутылка и горячие напитки, добавляем их в список
 */
        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Product(50, 2, "Cola");
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, (float)1.5);
        Product item4 = new HotDrinks(120, 13, "Coffe americano", 201, 70);
        Product item5 = new HotDrinks(155, 14, "Hot chocolate", 202, 75);
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);

        Holder hold1 = new Holder(4, 4);
        CoinDispenser coinDesp = new CoinDispenser(0);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);
/**
 * Печатаем экземпляры с характеристиками
 */
        for(Product prod: venMachine.getProducts())
        {
            System.out.println(prod);
        }

        MainFrame myFrame = new MainFrame();
        myFrame.initialize();

    }
}
