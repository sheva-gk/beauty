package Command;

public class RemoveAppointmentCommand implements Command {
    private AppointmentManager manager;
    private String appointment;

    public RemoveAppointmentCommand(AppointmentManager manager, String appointment) {
        this.manager = manager;
        this.appointment = appointment;
    }

    @Override
    public void execute() {
        manager.removeAppointment(appointment);
    }

    @Override
    public void undo() {
        manager.addAppointment(appointment);
    }
}