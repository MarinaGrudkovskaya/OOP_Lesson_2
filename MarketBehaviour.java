package OOP.Lessen2;

import java.util.List;

public interface MarketBehaviour { // логика магазина(приход/уход покупателей)
    // метод добавление посетителей магазина
    void acceptToMarket(Actor actor);
    // метод выхода из магазина
    void releaseFromMarket(List<Actor> actorList);
    //обновление магазина
    void update();
}
