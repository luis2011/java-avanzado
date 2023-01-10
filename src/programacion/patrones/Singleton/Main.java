package programacion.patrones.Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getSingleton();
        singleton.setContador(15);

        Singleton singleton2 = Singleton.getSingleton();


        System.out.println("valor: " + singleton.getContador() + " en memoria: " + singleton);
        System.out.println("valor: " + singleton2.getContador() + " en memoria: " + singleton2);


        System.out.println("---------------------APLICACION-------------------------");

        Aplicacion app = Aplicacion.getInstance(); // new Aplicacion()
        Aplicacion app2 = Aplicacion.getInstance();// app2 = app;

        app.Run();
        app2.Run();

        System.out.println(app + " " + app2);

    }
}
