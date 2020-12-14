package digital.kee.jamie.designpatterns.observer.microservices;

public class MarketingMicroServiceApiClient implements ObserverApiClient {

    private final MarketingMicroService marketingMicroService;

    public MarketingMicroServiceApiClient(MarketingMicroService marketingMicroService) {
        this.marketingMicroService = marketingMicroService;
    }

    @Override
    public void update() {
        marketingMicroService.update();
    }

}
