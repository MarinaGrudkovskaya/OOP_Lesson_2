package OOP.Lessen2;

public interface QueueBehaviour { // логика очереди
    //встать в  очередь
    void takeInQueue(Actor actor);
    // забрать заказ и отдать заказ
    void takeOrder();
    void giveOrder();
    //выйти из очереди
    void releaseFromQueue();

}
