package ChainOfResponsibility;

public class Request {
    private String clientName;
    private String consultationType;
    private String dateTime;

    public Request(String clientName, String consultationType, String dateTime) {
        this.clientName = clientName;
        this.consultationType = consultationType;
        this.dateTime = dateTime;
    }

    public String getClientName() {
        return clientName;
    }

    public String getConsultationType() {
        return consultationType;
    }

    public String getDateTime() {
        return dateTime;
    }
}