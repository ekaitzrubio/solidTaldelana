package isp;

public class mainISP {
    public static void main(String[] args) {
        System.out.println("DEMO ISP:");

        person person = new person("Ainhoa", "Calle Mayor 1", "ainhoa@example.com", "600112233");
        gmailAccount gmail = new gmailAccount("Mikel", "mikel@gmail.com");
        
        emailSender.sendEmail(person, "Bienvenido a la plataforma");
        smsSender.sendSMS(person, "Tu código de verificación es 4321");

        emailSender.sendEmail(gmail, "Mensaje exclusivo para Gmail");
        
        System.out.println("GmailAccount no se puede pasar a SMSSender (error prevenido en tiempo de compilación).");
    }
}
