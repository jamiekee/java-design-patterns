package digital.kee.jamie.designpatterns.observer.microservices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MicroServiceApplication {

    public static void main(String[] args) throws IOException {
        final var reader = new BufferedReader(new InputStreamReader(System.in));
        final OrderMicroService orderMicroService = new OrderMicroService();
        final OrderMicroserviceApiClient orderApi = new OrderMicroserviceApiClient(orderMicroService);
        new MarketingMicroService(orderApi);
        new InventoryMicroService(orderApi);

        while (true) {
            System.out.println("Would you like to place an order? [y/n]");
            String input = reader.readLine();

            if ("n".equals(input)) {
                break;
            }

            orderMicroService.placeOrder();
        }
    }
}
