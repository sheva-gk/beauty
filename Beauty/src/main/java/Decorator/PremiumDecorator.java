package products;

public class PremiumDecorator extends ServiceDecorator {
    public PremiumDecorator(Service decoratedService) {
        super(decoratedService);
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription() + " (Premium Service)";
    }

    @Override
    public double getCost() {
        return decoratedService.getCost() + 50; // Додатковий преміальний тариф
    }
}
