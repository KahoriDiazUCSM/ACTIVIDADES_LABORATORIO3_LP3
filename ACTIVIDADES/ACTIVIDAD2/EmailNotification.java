public class EmailNotification extends Notification {

    @Override
    public void send(String message) {
        System.out.println("Enviando correo: " + message);
    }
}
