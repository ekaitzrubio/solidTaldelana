package lsk;

public class skate extends transportationDevice implements WithEngine {
    private engine engine;

    public skate(String name, double speed, engine engine) {
        super(name, speed);
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        System.out.println(name + " (Patinete): Motor " + engine.getType() + " encendido.");
    }
}