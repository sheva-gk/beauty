package AbstractFactory;

import AbstractFactory.*;

public class ClientFactory implements SkinCareFactory {
    @Override
    public AppointmentForm createAppointmentForm() {
        return new ClientAppointmentForm();
    }

    @Override
    public PhotoUploadTool createPhotoUploadTool() {
        return new ClientPhotoUploadTool();
    }

    @Override
    public MessageService createMessageService() {
        return new ClientMessageService();
    }
}
