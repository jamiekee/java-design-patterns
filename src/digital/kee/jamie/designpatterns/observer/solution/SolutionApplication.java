package digital.kee.jamie.designpatterns.observer.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionApplication {

    public static void main(String[] args) throws IOException {
        final var reader = new BufferedReader(new InputStreamReader(System.in));
        final OrderService orderService = new OrderService();
        new MarketingService(orderService);
        new InventoryService(orderService);

        while (true) {
            System.out.println("Would you like to place an order? [y/n]");
            String input = reader.readLine();

            if ("n".equals(input)) {
                break;
            }

            orderService.placeOrder();
        }
    }
}
