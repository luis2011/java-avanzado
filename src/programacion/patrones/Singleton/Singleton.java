package programacion.patrones.Singleton;

public class Singleton {

    private static Singleton singleton;
    int contador;

    private Singleton(){}

    // Patron de funcionamiento singleton
    public static Singleton getSingleton(){
        if(singleton==null){
           singleton= new Singleton();
        }
        return singleton;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
