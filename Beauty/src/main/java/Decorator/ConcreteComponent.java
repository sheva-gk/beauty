package products;

public class BasicService implements Service {
    private String name;
    private double cost;

    public BasicService(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
