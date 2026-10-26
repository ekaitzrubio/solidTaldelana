package lsk;

public class bike extends transportationDevice {
    public bike(String name, double speed) {
        super(name, speed);
    }

    public void pedal() {
        System.out.println(name + ": Pedaleando a " + speed + " km/h.");
    }
}