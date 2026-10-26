package isp;

public class emailSender {
    public static void sendEmail(Emailable recipient, String message) {
        System.out.println("Enviando Email a " + recipient.getEmail() + ": " + message);
    }
}
