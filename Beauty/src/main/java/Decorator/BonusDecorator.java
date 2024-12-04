package products;

public class BonusDecorator extends ServiceDecorator {
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
