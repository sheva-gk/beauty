package Facade;

public class MessageService {
    public String sendConfirmation(String clientName) {
        return "Confirmation message sent to " + clientName;
    }
}
