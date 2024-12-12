package AbstractFactory;

public class ClientMessageService implements MessageService {
    @Override
    public String sendMessage(String message) {
        return "Client message sent: " + message;
    }
}
