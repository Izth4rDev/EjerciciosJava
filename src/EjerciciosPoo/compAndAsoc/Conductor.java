package EjerciciosPoo.compAndAsoc;

public class Conductor {
    private String nombre;
    private String rut;
    private String tipoLicencia;
    private int edad;

    public Conductor (String nombre,String rut, String tipoLicencia, int edad){
        this.nombre = nombre;
        this.rut = rut;
        this.tipoLicencia = tipoLicencia;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", tipoLicencia='" + tipoLicencia + '\'' +
                ", edad=" + edad +
                '}';
    }

}
