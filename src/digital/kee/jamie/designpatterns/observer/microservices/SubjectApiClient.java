package digital.kee.jamie.designpatterns.observer.microservices;

public interface SubjectApiClient {

    void registerObserver(ObserverApiClient observer);
    void removeObserver(ObserverApiClient observer);

}
