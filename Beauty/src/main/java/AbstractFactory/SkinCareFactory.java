package AbstractFactory;

import AbstractFactory.AppointmentForm;
import AbstractFactory.PhotoUploadTool;
import AbstractFactory.MessageService;

public interface SkinCareFactory {
    AppointmentForm createAppointmentForm();
    PhotoUploadTool createPhotoUploadTool();
    MessageService createMessageService();
}
