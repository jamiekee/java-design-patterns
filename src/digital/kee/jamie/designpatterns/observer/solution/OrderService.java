package digital.kee.jamie.designpatterns.observer.solution;

import java.util.ArrayList;
import java.util.List;

public class OrderService implements Subject {

    private final List<Observer> observers;

    public OrderService() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index != -1) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void placeOrder() {
        System.out.println("An order has been placed!");
        System.out.println("\tInforming all dependants now...");

        notifyObservers();
    }

}
