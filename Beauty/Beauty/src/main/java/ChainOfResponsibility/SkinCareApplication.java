package ChainOfResponsibility;

public class SkinCareApplication {
    public static void main(String[] args) {
        // Створення обробників
        Handler validationHandler = new ValidationHandler();
        Handler availabilityHandler = new AvailabilityHandler();
        Handler confirmationHandler = new ConfirmationHandler();

        // Побудова ланцюга
        validationHandler.setNext(availabilityHandler);
        availabilityHandler.setNext(confirmationHandler);

        // Створення запиту
        Request request = new Request("John Doe", "Skin Analysis", "2024-11-10 14:00");

        // Виконання ланцюга
        String result = validationHandler.handle(request);
        System.out.println(result);

        // Інший запит
        Request validRequest = new Request("Jane Doe", "Skin Analysis", "2024-11-12 10:00");
        System.out.println(validationHandler.handle(validRequest));
    }
}