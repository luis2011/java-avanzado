Principios básicos de la Programación Funcional

Funciones puras:

* Solo debe trabajar con sus propios parámetros 
* deben devolver lo que dice que hacer, si suma devuelve una suma
* no pueden modificar datos ajenos a la función
* siempre devuelven el mismo valor si ingresamos los mismos parámetros

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
*Recursividad de cabeza: invoca primero a la función recursiva
*Recursividad de cola: se llama al final la función recursiva
      Ventajas de la recursiva
*reduce la complejidad del tiempo (tiempo de proceso)
* Añade claridad cuando debemos escribir y depurar código
* los más usados es recorrer un árbol binario.
            Desventajas de la recursiva
* Mucho consumo de memoria. Cada vez que se llama se crea una copia para no modificar 
  las variables anteriores y así no perder su valor.
* Si no se implementa bien la recursividad la función puede ser muy lenta, ya que se crea un
 nuevo frame cada vez que se autoinvoca.
* investigar técnicas de memorize para poder mejorar los tiempos 

**********************************************************************
                    SERVICIO REST
Es un aplicación web que cumple con ciertos patrones determinados

* VERBOS HTTP 
- Tipo de petición que enviamos a un servidor utilizando el protocolo HTTPS
- GET : obtiene los recursos del servidor
- POST: envió datos al servidor
- PUT: actualizar algo que ya exista en el servidor y envía todos los datos para su actualización
- PATCH : actualizar algo que ya exista en el servidor, pero solo envía los datos que han cambiado. por ej.: name.
- DELETE : borra un recurso del servidor que exista

*********************************************************************************
					PATRONES DE DISEÑO
- Creacionales
- Estructurales
- Comportamiento

Creacionales:
* Singleton: solo puede haber una instancia de una clase
* Factory: se usa para crear una jerarquía de clases 
* Builder: Nos permite construir objetos complejos paso a paso, y evitamos tener un mega constructor
* Prototype: tiene como objeto autoclonarse y que herede todos sus propiedades y métodos de su clon, y sus estados

Estructurales:
* Decorador: Añade funcionalidad a una clase ya existente sin modificar esa clase ya existente. 
* Adaptador: crea una clase que permita que clases con la misma implementación y clases con distinta implementación
            funcionen coherentemente.Por ej. adapta una clase de terceros a una propia
* Facade: en un envoltorio que simplifica algo que es complejo por detras