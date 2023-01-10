package programacion.patrones.Singleton;

public class Aplicacion {

    private static Aplicacion aplicacion;
    boolean isRunning = false;
 // hacemos un constructor privado para que no pueda ser instaciado desde otra lado, solo nuestra clase
    private  Aplicacion(){}

    public static Aplicacion getInstance(){
        if(aplicacion == null){
            aplicacion = new Aplicacion();
        }
        return aplicacion;
    }

    public void Run() {
        if (!isRunning) {
            System.out.println("Arrancando");
            isRunning = true;
        }else{
            System.out.println("Ya estaba en ejecución");
        }
    }

}
