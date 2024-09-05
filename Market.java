package OOP.Lessen2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private List<Actor> queue = new ArrayList<>();// очередь посетителей


    @Override
    public void acceptToMarket(Actor actor) { //добавляет человека в очередь(+)
        takeInQueue(actor);
        System.out.println("Покупатель " + actor.getName() +  " встал в очередь");
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) { // удаляет человека из очереди
        queue.remove(0); // 0 - потому-что из очереди удаляется первый кто пришел первый
        System.out.println("Спасибо за заказ! Ждем Вас снова!");
    }
// это из MarketBehaviour - обновление магазина
    // принимает заказ и добавляет в список заказов
    @Override
    public void update() {  //(-)
        takeOrder();
        giveOrder();
        releaseFromQueue();

    }

    @Override
    public void takeInQueue(Actor actor) { // добавляем посетителя в очередь(+)
        queue.add(actor);

    }

    @Override
    public void takeOrder() {  //(+)
        for (Actor actor: queue) {
            if(actor.isMakeOrder == false){
                actor.setTakeOrder(true);
            }
        }
    }

    @Override
    public void giveOrder() { // проверяем что  сделан(+)
        for (Actor actor: queue) {
                if(actor.isMakeOrder == true){
                    actor.setTakeOrder(true);
            }
        }
    }

    @Override
    public void releaseFromQueue() { //(-)
        List<Actor> actorsReleaseFromQueue = new ArrayList<>();
        for (Actor actor: queue) {
            if(actor.isTakeOrder == true){
               actorsReleaseFromQueue.add(actor);
            }
        }
        releaseFromMarket(actorsReleaseFromQueue);
    }
}
