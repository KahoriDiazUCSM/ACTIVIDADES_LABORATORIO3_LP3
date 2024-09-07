public class NotificationManager {
    
    private Notification notification;
    
    public NotificationManager(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(String message) {
        notification.send(message);
    }
}
