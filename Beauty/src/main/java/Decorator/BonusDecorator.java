package Decorator;

public class BonusDecorator extends Decorator.ServiceDecorator {
    private String bonus;

    public BonusDecorator(Service decoratedService, String bonus) {
        super(decoratedService);
        this.bonus = bonus;
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription() + " + Bonus: " + bonus;
    }
}
