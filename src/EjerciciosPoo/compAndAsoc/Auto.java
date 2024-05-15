package EjerciciosPoo.compAndAsoc;

public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private Conductor conductor;
    private Motor motor;

    public Auto (String marca, String modelo, String color, Conductor conductor, String tipoMotor, String cilindrada){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.conductor = conductor;
        this.motor = new Motor(tipoMotor,cilindrada);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", conductor=" + conductor +
                ", motor=" + motor +
                '}';
    }
}
