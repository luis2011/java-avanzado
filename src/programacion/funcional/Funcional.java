package programacion.funcional;

import java.util.function.Function;
public class Funcional {

    // Que tipo de parametro recibo y que tipo de parametro devuelvo = Function lambda
        private Function<String,String> toMayus = (x) -> x.toUpperCase();
        private Function<Integer,Integer> sumador = (x) -> x.sum(x , x);

        public void pruebas(){
            System.out.println(toMayus.apply("Luis"));
            System.out.println(sumador.apply(5));


            Saluda(toMayus,"Victor");
        }

        // función que tiene de parametro otra función
        public void Saluda(Function<String,String> mifuncion, String nombre){
            mifuncion.apply(nombre);
        }

    }

