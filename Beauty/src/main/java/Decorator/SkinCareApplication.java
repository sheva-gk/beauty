package Decorator;

import Decorator.*;

public class SkinCareApplication {
    public static void main(String[] args) {
        // Базова послуга
        Service basicService = new BasicService("Skin Diagnosis", 50);

        // Додаткові функції
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

        // Виведення деталей
        System.out.println("Service: " + premiumService.getDescription());
        System.out.println("Total Cost: $" + premiumService.getCost());
    }
}
