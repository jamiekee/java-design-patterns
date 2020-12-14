package digital.kee.jamie.designpatterns.observer.microservices;

public class InventoryMicroServiceApiClient implements ObserverApiClient {

    private final InventoryMicroService inventoryMicroService;

    public InventoryMicroServiceApiClient(InventoryMicroService inventoryMicroService) {
        this.inventoryMicroService = inventoryMicroService;
    }

    @Override
    public void update() {
        inventoryMicroService.update();
    }

}
