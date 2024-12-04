package factories;

import products.AppointmentForm;
import products.PhotoUploadTool;
import products.MessageService;

public interface SkinCareFactory {
    AppointmentForm createAppointmentForm();
    PhotoUploadTool createPhotoUploadTool();
    MessageService createMessageService();
}
