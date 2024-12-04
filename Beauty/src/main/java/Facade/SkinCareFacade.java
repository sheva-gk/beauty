package facade;

import subsystems.AppointmentForm;
import subsystems.PhotoUploadTool;
import subsystems.MessageService;

public class SkinCareFacade {
    private AppointmentForm appointmentForm;
    private PhotoUploadTool photoUploadTool;
    private MessageService messageService;

    public SkinCareFacade() {
        this.appointmentForm = new AppointmentForm();
        this.photoUploadTool = new PhotoUploadTool();
        this.messageService = new MessageService();
    }

    public String bookAppointment(String clientName, String consultationType, String dateTime, String photoPath) {
        String appointmentDetails = appointmentForm.createAppointment(clientName, consultationType, dateTime);
        String photoUploadStatus = photoUploadTool.uploadPhoto(photoPath);
        String confirmationMessage = messageService.sendConfirmation(clientName);

        return appointmentDetails + "\n" + photoUploadStatus + "\n" + confirmationMessage;
    }
}
