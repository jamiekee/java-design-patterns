package digital.kee.jamie.designpatterns.observer.problem;

public class OrderService {

    private final InventoryService inventoryService = new InventoryService();
    private final MarketingService marketingService = new MarketingService();

    public void placeOrder() {
        System.out.println("An order has been placed!");
        System.out.println("\tInforming all dependants now...");

        inventoryService.removeStock();
        marketingService.orderMetrics();
    }

}
