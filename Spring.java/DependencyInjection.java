interface MessageService {
    void sendMessage();
}

class EmailService implements MessageService {

    @Override
    public void sendMessage() {
        System.out.println("Message sent through Email");
    }
}

class Notification {

    private final MessageService messageService;

    // Constructor Injection
    Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    void notifyUser() {
        messageService.sendMessage();
    }
}

public class DependencyInjection {

    public static void main(String[] args) {

        MessageService service = new EmailService();

        Notification notification = new Notification(service);

        notification.notifyUser();
    }
}