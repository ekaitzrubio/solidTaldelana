package lsk;

public abstract class transportationDevice {
    protected String name;
    protected double speed;

    public transportationDevice(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() { return name; }
    public double getSpeed() { return speed; }
}