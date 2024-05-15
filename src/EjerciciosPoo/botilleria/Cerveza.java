package EjerciciosPoo.botilleria;

// hereda de botella
public class Cerveza extends Botella {
    private int precio;

    //constructores
    public Cerveza(){
    }
    public Cerveza(String botella, String marca, int precio){
        super(botella, marca);
        this.precio = precio;
    }

    //getter y setter
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return precio;
    }

    @Override
    public String toString() {
        return "Cerveza{" +
                "precio=" + precio +
                "} " + super.toString();
    }
}
