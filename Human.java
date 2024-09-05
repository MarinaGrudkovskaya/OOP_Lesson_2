package OOP.Lessen2;

public class Human extends Actor{
    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public boolean setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
        return takeOrder;
    }

    @Override
    public boolean makeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean takeOrder() {
        return super.isTakeOrder;
    }
}
