package OOP.Lessen2;

public interface ActorBehavoir {
    // метод для создания заказа в него принимаем другой метод для указания создан заказ или нет
    void setMakeOrder(boolean makeOrder);
    // метод указывает забрал ли посетитель заказ и так же метод для проверки
    boolean setTakeOrder(boolean takeOrder);
    boolean makeOrder(); // метод для проверки создания заказа
    boolean takeOrder(); // метод для проверки забрал ли посетитель заказа
}
