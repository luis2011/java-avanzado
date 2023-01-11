package programacion.patrones.Adapter;

public class PowerAdapter  implements  Enchufable{

    public Lightbuld lightbuld = new Lightbuld();
    @Override
    public void enciende() {
        lightbuld.turnOn(100);
    }

    @Override
    public void apaga() {
        lightbuld.turnOff();
    }

    @Override
    public boolean estaEncendido() {
        return lightbuld.isPoweredOn();
    }
}
