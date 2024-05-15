package EjerciciosPoo.botilleria;

public class Botilleria {
    private Cerveza cerveza;
    private String nombre;

    //constructor
    public Botilleria(){
    }
    public Botilleria(Cerveza cerveza, String nombre){
        this.cerveza = cerveza;
        this.nombre = nombre;
    }

    //setter and getters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCerveza(Cerveza cerveza){
        this.cerveza = cerveza;
    }
    public String getNombre(){
        return nombre;
    }
    public Cerveza getCerveza(){
        return cerveza;
    }

    @Override
    public String toString() {
        return "Botilleria{" +
                "cerveza=" + cerveza +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
