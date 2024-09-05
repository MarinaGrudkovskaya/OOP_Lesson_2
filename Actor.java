package OOP.Lessen2;

public abstract class Actor implements ActorBehavoir  {
    protected boolean isTakeOrder; //состояние готовности сделать заказ
    protected boolean isMakeOrder; // создание заказа
    protected final String name;

    public Actor(String name) {
        this.name = name;
    }
    public abstract String getName();


}
