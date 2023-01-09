Principios básicos de la Programación Funcional

Funciones puras:

* Solo debe trabajar con sus propios parametros 
* deben devolver lo que dice que hacer, si suma devuelve una suma
* no pueden modifcar datos ajenos a la función
* siempre devuelven el mismo valor si ingresamos los mismos parametros

// ej función pura
public static function suma(int a, int b){
    int sumador = 5;
    return a + b + sumador;
}

Las funciones puras no puede tener tomar valores externos ni tener efectos colaterales


private static int contador = 0

public static void main(String[] args) {
        int result = suma(1,2);
    }
public static function suma(int a, int b){
    contador += 1 // esto ya la convierte en impuras
    multiplica(a , b);
    return a + b;
}

public static function multiplica(int a, int b){
return a + b;
}

Funcion de Alto Nivel (High Level Function)
* Puede llamar a una función y debe devolver otra función
* Debe recibir como parámetro otra función 

public class Main {
public static void main(String[] args) {

        int valor = devuelve("hola");
        System.out.println(valor);
        //49:45
    }

    public static int devuelve(String cadena){
        return cadena.length();
    }

}

Funciones Lambda
*Son funciones que se definen en funciones (Funciones especiales)
* son funciones que tiene como entrada una funcion y una funcion de salida: es una entrada otra función

private Function<String,String> toMayus = (x) -> x.toUpperCase();
private Function<Integer,Integer> sumador = (x) -> x.sum(x , x);

public void Saluda(Function<String,String> mifuncion, String nombre){
mifuncion.apply(nombre);
}

int[] numeros  ={ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 ,9 , 10};
var stNumeros = Arrays.stream(numeros);

var result = stNumeros.filter(x -> x % 2 == 0).reduce(0, (x , y)-> {
System.out.println("X es " + x + " Y es " + y);
return x + y;
});

*************************************************************

*Recursión: consiste en que una función se va a llamar a si misma.
*Vamos a usar la recursión siempre que haga mas claro nuestro código
*Siempre que trabajemos con recursividad vamos a tener que poner una sentencia de control 
 o punto de salida.
*Recursividad de cabeza : invoca primero a la función recursiva
*Recursividad de cola :  se llama al final la función recursiva
      Ventajas de la recursiva
*reduce la complejidad del tiempo (tiempo de preceso)
* Añade claridad cuando debemos escribir y depurar código
* lo mas usados es recorrer un arbol binario.
            Desventajas de la recursiva
* Mucho consumo de memoria. Cada vez que se llama se crea una copia para no modifcar 
  las variables anteriores y así no perder su valor.
* Sino se implementa bien la recursivada la funcion puede ser muy lenta ya que se crea un
 nuevo frame cada vez que se autoinvoca.
