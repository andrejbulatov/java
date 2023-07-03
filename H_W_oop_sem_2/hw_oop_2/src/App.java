import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.PromotionActor;
import Classes.SpecialClient;
import Classes.TaxServices;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Market magnit = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new SpecialClient("prezident",1001);
        iActorBehaviour p = new PensionerClient("Sergey Nikolay",1111);
        iActorBehaviour tax = new TaxServices();
        iActorBehaviour promclient4 = new PromotionActor("Дмитрий", 4, "летняя распродажа");
        iActorBehaviour promclient5 = new PromotionActor("Вячеслав", 5, "летняя распродажа");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(promclient4);
        magnit.acceptToMarket(promclient5);

        magnit.update();
    }
}