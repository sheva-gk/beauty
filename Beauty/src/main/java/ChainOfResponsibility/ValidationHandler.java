package ChainOfResponsibility;

public class ValidationHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public String handle(Request request) {
        if (request.getClientName() == null || request.getClientName().isEmpty()) {
            return "Validation failed: Client name is required.";
        }
        if (request.getConsultationType() == null || request.getConsultationType().isEmpty()) {
            return "Validation failed: Consultation type is required.";
        }
        if (request.getDateTime() == null || request.getDateTime().isEmpty()) {
            return "Validation failed: Date and time are required.";
        }
        if (next != null) {
            return next.handle(request);
        }
        return "Validation passed.";
    }
}