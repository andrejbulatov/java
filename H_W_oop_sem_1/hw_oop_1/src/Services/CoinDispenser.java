package Services;
/**
 * Класс приемника денег
 */
public class CoinDispenser {
      
    private int nominal;
/**
 * Конструктор для класса приемки денег
 * @param nominal Сумма денег
 */
      public CoinDispenser(int nominal) {
        this.nominal = nominal;
      }
     
      public String toString() {
        return "Номинал монеты равен " + nominal;
      }
/**
 * Метод подсчета общей суммы
 * @param insertCoin Вставленные монеты
 * @param outCoin Монеты, которые отдал приемник
 * @return
 */
    public int getSumm(int insertCoin, int outCoin) {
        int summCoin;
        summCoin = insertCoin + outCoin;
        return summCoin;
    }
/**
 * Метод сдачи
 * @param summCoin Общая сумма денег
 * @param price Цена товара
 * @return
 */
    public int giveChahge(int summCoin, int price) {
        int change;
        if (price < summCoin) {
            change = summCoin - price;
        }
        else if (price == summCoin) {
            change = summCoin - price;
        }
        else change = 0;
        return change;
    }

    public boolean dispense(int price) {
        return false;
    }            
}