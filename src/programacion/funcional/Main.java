package programacion.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        Funcional f = new Funcional();
        f.pruebas();


        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Paco");
        nombres.add("Pepe");
        nombres.add("Juan");

        // remplaza en un linea lo que antes usaba un for
        //nombres.stream().forEach(System.out::println);
        nombres.stream().forEach(x -> System.out.println(x));

        // funcion MAPEO aplicada lo que yo quiera a cada elemento
        //version corta del codigo
        //Stream<String>  valores = nombres.stream().map(x -> "Hola," + x.toUpperCase());
        // Version larga del codigo
        Stream<String>  valores = nombres.stream()
                .map((x) -> {
                    return "Hola," + x.toUpperCase();
                });


        valores.forEach(x -> System.out.println(x));
        // una vez que se consume el string no se puede volver a utilizar:stream has already been operated upon or closed
        //valores.forEach(x -> System.out.println(x));


        Stream<String>  valores2 = nombres.stream()
                .map((x) -> x.toUpperCase())
                .filter(x -> x.startsWith("P"));

        valores2.forEach(x -> System.out.println(x));

//        int[] numeros  ={ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 9 , 10};
//        IntStream stNumeros = Arrays.stream(numeros);
//        IntStream result = stNumeros.filter(x -> x % 2 == 0);
//        result.forEach(x -> System.out.println(x));


        // forma funcional o declarativa
        int[] numeros  ={ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 ,9 , 10};
        var stNumeros = Arrays.stream(numeros);
        var result = stNumeros
                .map(x-> x * 2)
                .filter(x -> x % 2 == 0)
                .reduce(0, (x , y)-> {
                    System.out.println("X es " + x + " Y es " + y);
                    return x + y;
                });
        System.out.println("el total es: " + result);

        // los mismo en forma imperativa
        int sumatotal = 0;
        for (int numero : numeros){
            numero = numero * 2;
            if(numero % 2 !=0){
                continue;
            }
            sumatotal += numero;
        }
        System.out.println("el total es: " + result + " y con for: " + sumatotal);

    }




}

