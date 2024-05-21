package EjerciciosPoo.clasesHerencia;

public class Main {
    public static void main(String[] args){
        //con constructor
        Auto auto1 = new Auto("Peugot","2008","blanco");
        System.out.println(auto1);
        System.out.println(auto1.getMarca());

        auto1.setMarca("Citroen");
        System.out.println(auto1);

        auto1.setAttributes("Buggatti", "veyron", "dorado");
        System.out.println(auto1);

        //sin constructor con setters
        Auto auto2 = new Auto();
        auto2.setMarca("citroen");
        auto2.setModelo("c4");
        auto2.setColor("rojo");

        System.out.println(auto2);

        Hashback hashback1 = new Hashback("Peugot","206","rojo",130);
        System.out.println(hashback1);
        Pickup pickup1 = new Pickup("Ford","f-150","rojo", 500);
        System.out.println(pickup1);
    }

}
