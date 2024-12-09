package AbstractFactory;

import AbstractFactory.*;
import AbstractFactory.*;

public class SkinCareApplication {
    public static void clientInteraction(SkinCareFactory factory) {
        AppointmentForm form = factory.createAppointmentForm();
        PhotoUploadTool photoTool = factory.createPhotoUploadTool();
        MessageService messageService = factory.createMessageService();

        System.out.println(form.renderForm());
        System.out.println(photoTool.uploadPhoto());
        System.out.println(messageService.sendMessage("Appointment confirmed!"));
    }

    public static void main(String[] args) {
        SkinCareFactory clientFactory = new ClientFactory();
        SkinCareFactory adminFactory = new AdminFactory();

        System.out.println("Client interaction:");
        clientInteraction(clientFactory);

        System.out.println("\nAdmin interaction:");
        clientInteraction(adminFactory);
    }
}
