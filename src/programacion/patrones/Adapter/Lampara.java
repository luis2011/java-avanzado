package programacion.patrones.Adapter;

public class Lampara implements Enchufable {

    boolean encendido = false;

    @Override
    public void enciende() {
        encendido = true;
        System.out.println("Lampara encendida ");
    }

    @Override
    public void apaga() {
        encendido = false;
        System.out.println("Lampara Apagada ");
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
