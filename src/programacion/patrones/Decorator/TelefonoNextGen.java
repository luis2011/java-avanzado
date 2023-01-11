package programacion.patrones.Decorator;

public class TelefonoNextGen extends TelefonoDecorator {

    public TelefonoNextGen(Telefono telefono){
        super(telefono);
    }

    @Override
    public void crear(){
        super.crear();
        System.out.println("  -> nextgen: Tengo tambíen 5G");
        System.out.println("  -> nextgen: Tengo tambíen VolTE");
    }
}
