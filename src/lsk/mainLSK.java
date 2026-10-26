package lsk;

public class mainLSK {
    public static void main(String[] args) {
        engine v8 = new engine("V8 Gasolina");
        engine electric = new engine("Eléctricoa 250W");

        car car = new car("Audi A4", 220, v8);
        skate skate = new skate("Xiaomi Scooter", 25, electric);
        bike bike = new bike("Orbea Alma", 30);
        trailer trailer = new trailer("trailer", 90);

        System.out.println("DEMO LSK:");
        car.startEngine();
        car.matrikulatu("1234-ABC");

        skate.startEngine();
        bike.pedal();
        trailer.matrikulatu("R-5678-XYZ");
    }
    
}