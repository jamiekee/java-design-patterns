package digital.kee.jamie.designpatterns.observer.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemApplication {

    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        OrderService orderService = new OrderService();

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
