package Decorator;

public abstract class ServiceDecorator implements Service {
    protected Service decoratedService;

    public ServiceDecorator(Service decoratedService) {
        this.decoratedService = decoratedService;
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedService.getCost();
    }
}
