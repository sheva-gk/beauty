package AbstractFactory;

public class ClientAppointmentForm implements AppointmentForm {
    @Override
    public String renderForm() {
        return "Client appointment form displayed";
    }
}
