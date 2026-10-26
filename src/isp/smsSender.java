package isp;

public class smsSender {
    public static void sendSMS(SMSable recipient, String message) {
        System.out.println("Enviando SMS a " + recipient.getTelephone() + ": " + message);
    }
}
