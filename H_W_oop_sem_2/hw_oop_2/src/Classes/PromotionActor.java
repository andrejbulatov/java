package Classes;
/**
 * Класс акционного клиента
 */
public class PromotionActor extends Actor {

    private int clientPromId;
    private String promotionName;
    private static int countPromoClients = 15;
  /**
   * Конструктор класса акционного клиента
   * @param name имя клиента
   * @param clientPromId идентификатор акционного клиента
   * @param  countPromoClients количество клиентов в акции
   */
    public PromotionActor(String name, int clientPromId, String promotionName) {
      super(name + " - promotion");
      this.clientPromId = clientPromId;
      this.promotionName = promotionName;
    }

    /**
     * Возвращает название акции.
     * @return название акции.
     */
    public String getPromotionName(){
        return promotionName;
    }
    /**
     * Возвращает идентификатор акционного клиента.
     * @return идентификатор акционного клиента.
     */
    public int getClientPromId(){
        return clientPromId;
    }
    /**
     * Возвращает количество участников акции.
     * @return количество участников акции.
     */
    public static int countPromoClients(){
        return countPromoClients;
    }
    /**
     * Получение имени клиента.
     * @return имя клиента.
     */
    @Override
    public String getName(){
        return super.name;
    }
    /**
     * Проверка, хочет ли клиент сделать заказ.
     * @return true (хочет) / false (нет).
     */
    @Override
    public boolean isMakeOrder(){
        return super.isMakeOrder;
    }
    /**
     * Проверка готовности клиента забрать заказ.
     * @return true (готов) / false (нет).
     */
    @Override
    public boolean isTakeOrder(){
        return super.isTakeOrder;
    }
    /**
     * Установка флага о желании клиента сделать заказ.
     * @param makeOrder значение флага.
     */
    @Override
    public void setMakeOrder(boolean makeOrder){
       super.isMakeOrder = makeOrder;
    }
    /**
     * Установка флага о готовности клиента забрать заказ.
     * @param pickUpOrder значение флага.
     */
    @Override
    public void setTakeOrder(boolean pickUpOrder){
       super.isTakeOrder = pickUpOrder;   
    }
    /**
     * Получение объекта клиента.
     * @return объект клиента.
     */
    @Override
    public Actor getActor(){
        return this;
    }

    /**
     * Проверка возможности возврата товара.
     * @return true (возврат возможен) / false (нет).
     */
    @Override
    public boolean isCanReturn(){
        return super.isCanReturn;
    }
    /**
     * Возврат клиентом заказа.
     * @param canReturn значение флага
     */
    @Override
    public void setReturnOrder(boolean canReturn){
        super.isCanReturn = canReturn;
    }
}
