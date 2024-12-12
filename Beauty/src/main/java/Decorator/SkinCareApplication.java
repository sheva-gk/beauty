package Decorator;

public class SkinCareApplication {
    public static void main(String[] args) {
        Service basicService = new BasicService("Skin Diagnosis", 50);

        Service discountedService = new DiscountDecorator(basicService, 10);
        Service bonusService = new Service() {
            @Override
            public String getDescription() {
                return "";
            }

            @Override
            public double getCost() {
                return 0;
            }
        };
        Service premiumService = new PremiumDecorator(bonusService);

        System.out.println("Service: " + premiumService.getDescription());
        System.out.println("Total Cost: $" + premiumService.getCost());
    }
}
