package digital.kee.jamie.designpatterns.observer.solution;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
