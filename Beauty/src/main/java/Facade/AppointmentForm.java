package Facade;

public class AppointmentForm {
    public String createAppointment(String clientName, String consultationType, String dateTime) {
        return "Appointment created for " + clientName + " (Type: " + consultationType + ", DateTime: " + dateTime + ")";
    }
}
