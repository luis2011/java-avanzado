package programacion.patrones.Adapter;

public class Lightbuld {

    boolean poweredOn = false;
    int voltage = 0;


    public void turnOn(int voltage) {
        poweredOn = true;
        this.voltage = voltage;

        System.out.println("Lighbuld powered with " + voltage + " of current");
    }

    public void turnOff() {
        poweredOn = false;
        voltage = 0;

        System.out.println("Lighbuld powered off ");
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }
}
