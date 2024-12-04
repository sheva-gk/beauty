package main;

import products.*;

public class SkinCareApplication {
    public static void main(String[] args) {
        // Базова послуга
        Service basicService = new BasicService("Skin Diagnosis", 50);

        // Додаткові функції
        Service discountedService = new DiscountDecorator(basicService, 10);
        Service bonusService = new BonusDecorator(discountedService, "Free Skin Care Sample");
        Service premiumService = new PremiumDecorator(bonusService);

        // Виведення деталей
        System.out.println("Service: " + premiumService.getDescription());
        System.out.println("Total Cost: $" + premiumService.getCost());
    }
}
