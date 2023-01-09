package programacion.recursiva;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        // vamos a medir el tiempo de una funcion
        long tiempoInicial = System.currentTimeMillis();
       for (int i = 0; i <=1000000; i++){
           suma(50);
       }
        long tiempoFinal= System.currentTimeMillis();
        System.out.println("MS en total suma(): " + (tiempoFinal - tiempoInicial));


        tiempoInicial = System.currentTimeMillis();
        for (int i = 0; i <=1000000; i++){
            sumaFuncional(5);
        }
        tiempoFinal= System.currentTimeMillis();
        System.out.println("MS en total sumaFuncional(): " + (tiempoFinal - tiempoInicial));


        tiempoInicial = System.currentTimeMillis();
        for (int i = 0; i <=1000000; i++){
            sumaRecursiva(50);
        }
        tiempoFinal= System.currentTimeMillis();
        System.out.println("MS en total  sumaRecursiva(): " + (tiempoFinal - tiempoInicial));



//        System.out.println(suma(5));
//        System.out.println(sumaRecursiva(5));
//        tailRecursion(5);
//        headRecursion(5);
//
//        System.out.println("Suma funcional " + sumaFuncional(5));
//
//        System.out.println("-----------------FACTORIAL-----------------------");
//        System.out.println("Factorial Iteractiva "+factorial(5));
//        System.out.println("Factorial Recursiva "+factorialRecursivo(5));
//        System.out.println("Factorial Funcional "+factorialFuncionar(5));
    }

    public static int suma(int max){
        int result = 0;
        for(int i=0; i<=max; i++){
            result = result + i;
        }
        return result;
    }

    // Las misma función pero recursiva

    //sumaRecursiva(5)
    //  sumaRecursiva(4) // 5 -1
    //      sumaRecursiva(3) //4 -1
    //      .....
    //      sumaRecursiva(0)// sentencia de control
    public static int sumaRecursiva(int numero){
        if(numero==1){
            return  1;
        }
            return numero + sumaRecursiva(numero - 1);
    }

    // Recusión de cola
    public static void tailRecursion(int valor){
        if(valor==0){
            return;
        }
        System.out.println(valor);
        tailRecursion(valor - 1);
    }
    //Recursion de cabeza
    public static void headRecursion(int valor){
        if(valor==0){
            return;
        }
        headRecursion(valor - 1); // no se va a imprimir hasta que la funcion deje de llamarse
        System.out.println(valor);
    }

    // recursión de forma funcional con una lamdab

    public static int sumaFuncional(int numero){
        // 5 + 4 + 3 + 2 + 1
        return IntStream.rangeClosed(1,5)
                .reduce(0, (a,b)-> a + b);
    }

    // factorial de un number con Iteractiva
    public static int factorial(int numero){
        int result = 1;
        for(int i = 0; i < numero; i++){
            result = result + (result * i);
        }
        return result;
    }

    // factorial de un number con recursivada por cola
    public static int factorialRecursivo(int numero){
        if(numero == 0){
            return 1;
        }
        return numero*factorialRecursivo(numero - 1);
    }

    public static int factorialFuncionar(int numero){
        return IntStream.rangeClosed(1, numero)
                .reduce(1, (a,b) -> a*b);
    }




}
