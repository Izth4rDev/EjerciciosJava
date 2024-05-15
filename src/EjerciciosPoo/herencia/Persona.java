package EjerciciosPoo.herencia;

public class Persona {
    private String nombre;
    private String rut;
    private int altura;

    public Persona(){
    }
    public Persona(String nombre, String rut, int altura){
        this.nombre = nombre;
        this.rut = rut;
        this.altura = altura;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public String getNombre(){
        return nombre;
    }
    public String getRut(){
        return rut;
    }
    public int getAltura(){
        return altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", altura=" + altura +
                '}';
    }
}
