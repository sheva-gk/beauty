package Builder;

import Builder.Appointment;

public class SkinCareApplication {
    public static void main(String[] args) {
        // Використання Builder для створення запису
        Appointment appointment = new Appointment.Builder()
                .setClientName("Liza Buhakova")
                .setConsultationType("Skin Analysis")
                .setDateTime("2024-11-10 14:00")
                .setComments("I have dry skin issues.")
                .setPhotoPath("uploads/john_doe_skin.jpg")
                .build();

        System.out.println(appointment);
    }
}
