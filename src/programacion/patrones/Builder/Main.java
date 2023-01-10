package programacion.patrones.Builder;

public class Main {
    public static void main(String[] args) {

        //Vehiculo vehiculo = new Vehiculo();
        Vehiculo coche = new CocheBuilder("Ford")
                .setPuertas(5)
                .setMotor("Electrico")
                .setTipo("Paseo")
                .build();

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Puertas: " + coche.getPuertas());
        System.out.println("Tipo: " + coche.getTipo());
        System.out.println("Motor: " + coche.getMotor());

        System.out.println("---------------STRING BUILDER--------------------------");
        StringBuilder cadena = new StringBuilder("Hola");
        cadena.append(" amigos").append(" del").append(" curso");
        System.out.println(cadena);

    }
}
