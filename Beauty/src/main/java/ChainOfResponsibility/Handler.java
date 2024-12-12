package ChainOfResponsibility;

public interface Handler {
    void setNext(Handler next);
    String handle(Request request);
}