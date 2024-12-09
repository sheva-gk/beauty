package Decorator;

public class DiscountDecorator extends ServiceDecorator {
    private double discount;

    public DiscountDecorator(Service decoratedService, double discount) {
        super(decoratedService);
        this.discount = discount;
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription() + " (with discount)";
    }

    @Override
    public double getCost() {
        return decoratedService.getCost() - discount;
    }
}
