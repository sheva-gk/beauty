package ChainOfResponsibility;

import java.util.Arrays;
import java.util.List;

public class AvailabilityHandler implements Handler {
    private Handler next;
    private List<String> unavailableSlots = Arrays.asList("2024-11-10 14:00", "2024-11-11 10:00");

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public String handle(Request request) {
        if (unavailableSlots.contains(request.getDateTime())) {
            return "Appointment failed: The selected time slot is unavailable.";
        }
        if (next != null) {
            return next.handle(request);
        }
        return "Time slot available.";
    }
}