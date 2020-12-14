package digital.kee.jamie.designpatterns.observer.microservices;

import java.util.ArrayList;
import java.util.List;

public class OrderMicroService implements Subject {

    private final List<ObserverApiClient> observerApiClients;

    public OrderMicroService() {
        this.observerApiClients = new ArrayList<>();
    }

    @Override
    public void registerObserver(ObserverApiClient observer) {
        observerApiClients.add(observer);
    }

    @Override
    public void removeObserver(ObserverApiClient observer) {
        int index = observerApiClients.indexOf(observer);
        if (index != -1) {
            observerApiClients.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        observerApiClients.forEach(ObserverApiClient::update);
    }

    public void placeOrder() {
        System.out.println("An order has been placed!");
        System.out.println("\tInforming all dependants now...");

        notifyObservers();
    }

}
