package Command;

import java.util.ArrayList;
import java.util.List;

public class AppointmentManager {
    private List<String> appointments = new ArrayList<>();

    public void addAppointment(String appointment) {
        appointments.add(appointment);
        System.out.println("Appointment added: " + appointment);
    }

    public void removeAppointment(String appointment) {
        appointments.remove(appointment);
        System.out.println("Appointment removed: " + appointment);
    }

    public List<String> getAppointments() {
        return appointments;
    }
}