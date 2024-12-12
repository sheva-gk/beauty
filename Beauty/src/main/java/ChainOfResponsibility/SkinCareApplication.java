package ChainOfResponsibility;

public class SkinCareApplication {
    public static void main(String[] args) {
        Handler validationHandler = new ValidationHandler();
        Handler availabilityHandler = new AvailabilityHandler();
        Handler confirmationHandler = new ConfirmationHandler();

        validationHandler.setNext(availabilityHandler);
        availabilityHandler.setNext(confirmationHandler);

        Request request = new Request("Karina Teslenko", "Skin Analysis", "2024-11-10 14:00");

        String result = validationHandler.handle(request);
        System.out.println(result);

        Request validRequest = new Request("Karina Teslenko", "Skin Analysis", "2024-11-12 10:00");
        System.out.println(validationHandler.handle(validRequest));
    }
}