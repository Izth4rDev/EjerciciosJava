package EjerciciosPoo.clasesHerencia;

public class Pickup extends Auto {
    private int espacioDeCarga;

    public Pickup(String marca, String modelo, String color, int espacioDeCarga){
        super(marca, modelo, color);
        this.espacioDeCarga = espacioDeCarga;
    }

    @Override
    public String toString() {
        return "Pickup{" +
                "espacioDeCarga=" + espacioDeCarga +
                "} " + super.toString();
    }
}
