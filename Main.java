package OOP.Lessen2;

public class Main {
    public static void main(String[] args) {

        Actor human = new Human("Juan");
        boolean flag;
        flag = human.setTakeOrder(true);
        Market market = new Market();
        market.acceptToMarket(human);
        System.out.println(market);
        market.takeInQueue(human);
        market.takeOrder();
        market.giveOrder();




    }

}
