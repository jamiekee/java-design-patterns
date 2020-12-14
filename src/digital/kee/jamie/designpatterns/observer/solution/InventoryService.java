package digital.kee.jamie.designpatterns.observer.solution;

public class InventoryService implements Observer {

    public InventoryService(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        removeStock();
    }

    public void removeStock() {
        System.out.println("\t\tRemoving order from our stock levels");
    }

}
