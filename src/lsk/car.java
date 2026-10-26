package lsk;

public class car extends transportationDevice implements WithEngine, Licensable {
    private engine engine;
    private String license;

    public car(String name, double speed, engine engine) {
        super(name, speed);
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        System.out.println(name + "Motor" + engine.getType());
    }

    @Override
    public void matrikulatu(String license) {
        this.license = license;
        System.out.println(name + " Matriculado con código " + license);
    }

    @Override
    public String getLicense() { return license; }
}
