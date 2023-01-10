package programacion.patrones.Prototype;

public class Coche  implements Cloneable {
// implemento la interface Cloneable
    public String marca;
    public String modelo;
    int puertas;

    public Coche(){}

    public Coche clonar() throws CloneNotSupportedException{
//        Coche clon = new Coche();
//
//        clon.marca = marca;
//        clon.modelo = modelo;
//        clon.puertas = puertas;
//
//        return clon;

        return (Coche)this.clone(); // me retorna todas las propiedades

    }
}
