package isp;

public class gmailAccount implements Emailable {
    private String name;
    private String emailAddress;

    public gmailAccount(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() { return name; }

    @Override
    public String getEmail() {
        return emailAddress;
    }
}
