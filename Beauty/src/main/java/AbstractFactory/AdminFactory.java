package factories;

import products.*;

public class AdminFactory implements SkinCareFactory {
    @Override
    public AppointmentForm createAppointmentForm() {
        return new AdminAppointmentForm();
    }

    @Override
    public PhotoUploadTool createPhotoUploadTool() {
        return new AdminPhotoReviewTool();
    }

    @Override
    public MessageService createMessageService() {
        return new AdminMessageService();
    }
}
