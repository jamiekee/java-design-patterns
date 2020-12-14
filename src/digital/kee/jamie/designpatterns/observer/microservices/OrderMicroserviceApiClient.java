package digital.kee.jamie.designpatterns.observer.microservices;

public class OrderMicroserviceApiClient implements SubjectApiClient {

    private final OrderMicroService orderMicroService;

    public OrderMicroserviceApiClient(OrderMicroService orderMicroService) {
        this.orderMicroService = orderMicroService;
    }

    @Override
    public void registerObserver(ObserverApiClient observer) {
        orderMicroService.registerObserver(observer);
    }

    @Override
    public void removeObserver(ObserverApiClient observer) {
        orderMicroService.removeObserver(observer);
    }

}
