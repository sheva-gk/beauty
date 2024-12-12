package Command;

public class AddAppointmentCommand implements Command {
    private AppointmentManager manager;
    private String appointment;

    public AddAppointmentCommand(AppointmentManager manager, String appointment) {
        this.manager = manager;
        this.appointment = appointment;
    }

    @Override
    public void execute() {
        manager.addAppointment(appointment);
    }

    @Override
    public void undo() {
        manager.removeAppointment(appointment);
    }
}