package EjerciciosPoo.botilleria;

public class Botella {
    private String botella;
    private String marca;

    //contructores
    public Botella(){
    }

    public Botella(String botella, String marca){
        this.botella = botella;
        this.marca = marca;
    }

    //setter
    public void setBotella(String botella){
        this.botella=botella;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getBotella(){
        return botella;
    }
    public String getMarca(){
        return marca;
    }

    @Override
    public String toString() {
        return "Botella{" +
                "botella='" + botella + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
