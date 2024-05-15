package EjerciciosPoo.herencia;
import java.util.List;

public class Oficina {
    private List <Programador> programadores;
    private JefeDeProyecto jp;

    public Oficina(List<Programador> programadores, JefeDeProyecto jp){
        this.programadores = programadores;
        this.jp = jp;
    }
    public void setProgramadores(List<Programador> programadores){
        this.programadores=programadores;
    }
    public void setJp (JefeDeProyecto jp){
        this.jp = jp;
    }
    public List<Programador> getProgramadores(){
        return programadores;
    }
    public JefeDeProyecto getJp(){
        return jp;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "programadores=" + programadores +
                ", jp=" + jp +
                '}';
    }
}
