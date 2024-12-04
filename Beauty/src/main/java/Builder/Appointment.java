package products;

public class Appointment {
    private String clientName;
    private String consultationType;
    private String dateTime;
    private String comments;
    private String photoPath;

    // Приватний конструктор
    private Appointment(Builder builder) {
        this.clientName = builder.clientName;
        this.consultationType = builder.consultationType;
        this.dateTime = builder.dateTime;
        this.comments = builder.comments;
        this.photoPath = builder.photoPath;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "clientName='" + clientName + '\'' +
                ", consultationType='" + consultationType + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", comments='" + comments + '\'' +
                ", photoPath='" + photoPath + '\'' +
                '}';
    }

    // Static Builder class
    public static class Builder {
        private String clientName;
        private String consultationType;
        private String dateTime;
        private String comments;
        private String photoPath;

        public Builder setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        public Builder setConsultationType(String consultationType) {
            this.consultationType = consultationType;
            return this;
        }

        public Builder setDateTime(String dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        public Builder setComments(String comments) {
            this.comments = comments;
            return this;
        }

        public Builder setPhotoPath(String photoPath) {
            this.photoPath = photoPath;
            return this;
        }

        public Appointment build() {
            return new Appointment(this);
        }
    }
}
