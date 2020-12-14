package digital.kee.jamie.designpatterns.observer.microservices;

public class MarketingMicroService implements Observer {

    public MarketingMicroService(SubjectApiClient subjectApi) {
        subjectApi.registerObserver(new MarketingMicroServiceApiClient(this));
    }

    @Override
    public void update() {
        orderMetrics();
    }

    public void orderMetrics() {
        System.out.println("\t\tUpdating order metrics.");
    }

}
