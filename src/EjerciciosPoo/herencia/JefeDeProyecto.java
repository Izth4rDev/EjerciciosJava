package EjerciciosPoo.herencia;

public class JefeDeProyecto extends Persona{
    private String area;
    public JefeDeProyecto(){
    }
    public JefeDeProyecto(String area){
        this.area = area;
    }
    public JefeDeProyecto(String nombre, String rut, int altura, String area){
        super(nombre, rut, altura);
        this.area = area;
    }
    public void setArea(String area){
        this.area = area;
    }
    public String getArea(){
        return area;
    }

    @Override
    public String toString() {
        return "JefeDeProyecto{" +
                "area='" + area + '\'' +
                "} " + super.toString();
    }
}
