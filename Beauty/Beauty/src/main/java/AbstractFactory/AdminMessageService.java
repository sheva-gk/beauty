package AbstractFactory;

public class AdminMessageService implements MessageService {
    @Override
    public String sendMessage(String message) {
        return "Admin message sent: " + message;
    }
}
