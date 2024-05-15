package EjerciciosPoo.herencia;

public class Programador extends Persona{
    private String lenguaje;

    public Programador(){
    }
    public Programador(String lenguaje){
        this.lenguaje = lenguaje;
    }
    public Programador(String nombre, String rut, int altura, String lenguaje){
        super(nombre, rut, altura);
        this.lenguaje = lenguaje;
    }
    public void setLenguaje(String lenguaje){
        this.lenguaje = lenguaje;
    }
    public String getLenguaje(){
        return lenguaje;
    }
    @Override
    public String toString() {
        return "Programador{" +
                "lenguaje='" + lenguaje + '\'' +
                "} " + super.toString();
    }
}
