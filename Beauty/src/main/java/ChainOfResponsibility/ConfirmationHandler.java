package ChainOfResponsibility;

public class ConfirmationHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public String handle(Request request) {
        String confirmation = "Appointment confirmed for " + request.getClientName() + " at " + request.getDateTime();
        if (next != null) {
            return next.handle(request) + "\n" + confirmation;
        }
        return confirmation;
    }
}