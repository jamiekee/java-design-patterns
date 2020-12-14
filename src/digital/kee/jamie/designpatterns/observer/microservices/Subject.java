package digital.kee.jamie.designpatterns.observer.microservices;

public interface Subject {

    void registerObserver(ObserverApiClient observer);
    void removeObserver(ObserverApiClient observer);
    void notifyObservers();

}
