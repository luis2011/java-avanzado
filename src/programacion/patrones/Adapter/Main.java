package programacion.patrones.Adapter;

public class Main {

    public static void main(String[] args) {

        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapter lighbuld = new PowerAdapter();

        enciende(horno);
       // enciende(lampara);
        enciende(lighbuld);

        System.out.println(estaEncedido(horno));
        System.out.println(estaEncedido(lampara)); // false por que no esta encedida
        System.out.println(estaEncedido(lighbuld));

    }

     public static  void  enciende(Enchufable enchufable){
         enchufable.enciende();
     }

    public static  void  apaga(Enchufable enchufable){
        enchufable.apaga();
    }

    public static  boolean  estaEncedido(Enchufable enchufable){
        return enchufable.estaEncendido();
    }


}

