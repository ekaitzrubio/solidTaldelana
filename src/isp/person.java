package isp;

public class person implements Emailable, SMSable {
    private String name;
    private String address;
    private String email;
    private String telephone;

    public person(String name, String address, String email, String telephone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
}
