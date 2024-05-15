package EjerciciosPoo.compAndAsoc;

public class Motor {
    private String tipoMotor;
    private String cilindrada;

    public Motor(String tipoMotor, String cilindrada){
        this.tipoMotor = tipoMotor;
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipoMotor='" + tipoMotor + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }
}
