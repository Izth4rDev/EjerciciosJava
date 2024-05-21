package mainRegistroAsistencia;
import registroAsistencia.Estudiante;
import registroAsistencia.Profesor;
import registroAsistencia.Persona;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Profesor> profesores = new ArrayList<Profesor>();
        List<Estudiante> alumnos =  new ArrayList<Estudiante>();
        alumnos.add(new Estudiante("1111111", "Juan", true));
        alumnos.add(new Estudiante("2222222", "Andrés", true));
        alumnos.add(new Estudiante("3333333", "Juan", false));
        profesores.add(new Profesor("10101010", "Jose", true));

        for(Profesor profe : profesores){
            System.out.println(profe.toString());
        }

        for(Estudiante alumno : alumnos){
            System.out.println(alumno.toString());
        }
        System.out.println("/////////////////////////////////////////////////////");
        //en un solo arraylist
        List<Persona> personas = new ArrayList<Persona>();
        personas.add(new Estudiante("4444444", "Pedro", true));
        personas.add(new Estudiante("5555555", "Diego", true));
        personas.add(new Estudiante("6666666", "Luis", false));
        personas.add(new Profesor("85263251", "David", true));

        for(Persona person : personas){
            System.out.println(person.toString());
            //casteo de clases
            System.out.println(person.getClass().getSimpleName());
        }

        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Estudiante(1500, "1", "Juan", true));
        lista.add(new Estudiante(2000, "2", "Andrés", true));
        lista.add(new Estudiante(3500, "3", "Juan", false));
        lista.add(new Profesor("10", "Jose", true));
        for(Persona individuo : lista) {
            System.out.println(individuo.getClass().getSimpleName());
        }

        for(Persona individuo : lista) {
            Estudiante estudiante = (Estudiante) individuo;
            System.out.println(individuo.getClass().getSimpleName());
            System.out.println(estudiante.getDeuda());
        }

    }
}
