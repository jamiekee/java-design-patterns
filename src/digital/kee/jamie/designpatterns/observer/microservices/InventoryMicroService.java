package digital.kee.jamie.designpatterns.observer.microservices;

public class InventoryMicroService implements Observer {

    public InventoryMicroService(SubjectApiClient subjectApi) {
        subjectApi.registerObserver(new InventoryMicroServiceApiClient(this));
    }

    @Override
    public void update() {
        removeStock();
    }

    public void removeStock() {
        System.out.println("\t\tRemoving order from our stock levels");
    }

}
