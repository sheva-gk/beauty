package Composite;

class SingleService implements Service {
    private String name;
    private double price;

    public SingleService(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showDetails() {
        System.out.println("Service: " + name + ", Price: $" + price);
    }
}
