package digital.kee.jamie.designpatterns.observer.solution;

public class MarketingService implements Observer {

    public MarketingService(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        orderMetrics();
    }

    public void orderMetrics() {
        System.out.println("\t\tUpdating order metrics.");
    }

}
