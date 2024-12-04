package products;

public class AdminAppointmentForm implements AppointmentForm {
    @Override
    public String renderForm() {
        return "Admin appointment form with details displayed";
    }
}
