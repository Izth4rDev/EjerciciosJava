package EjerciciosPoo.compAndAsoc;

public class Main {
    public static void main(String[] args){
        Conductor conductor1 = new Conductor("Miguel",
                "17144995-2","A",35);

        Auto mazda = new Auto("Mazda","cx-9","blanco",conductor1,"V8","2.5Lt");
        System.out.println(mazda);
    }
}
