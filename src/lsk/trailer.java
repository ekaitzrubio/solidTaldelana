package lsk;

public class trailer extends transportationDevice implements Licensable {
    private String license;

    public trailer(String name, double speed) {
        super(name, speed);
    }

    @Override
    public void matrikulatu(String license) {
        this.license = license;
        System.out.println(name + " (Remolque): Matriculado con código " + license);
    }

    @Override
    public String getLicense() { return license; }
}
