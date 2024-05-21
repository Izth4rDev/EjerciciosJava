package EjerciciosPoo.clasesHerencia;

public class Hashback extends Auto{
    private int espacioRedMaletero;

    public Hashback (String marca, String modelo, String color, int espacioRedMaletero){
        super(marca,modelo,color);
        this.espacioRedMaletero = espacioRedMaletero;
    }

    @Override
    public String toString() {
        return "Hashback{" +
                "espacioRedMaletero=" + espacioRedMaletero +
                "} " + super.toString();
    }
}
