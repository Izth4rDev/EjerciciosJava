package EjerciciosPoo.herencia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        List<Programador> programadores = new ArrayList<>();
        System.out.println("Ingrese número de programadores:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < number; i++){
            Programador programador = new Programador();
            System.out.println("Ingrese nombre:");
            String nombre = sc.nextLine();
            programador.setNombre(nombre);

            System.out.println("Ingrese RUT:");
            String rut = sc.nextLine();
            programador.setRut(rut);

            System.out.println("Ingrese lenguaje:");
            String lenguaje = sc.nextLine();
            programador.setLenguaje(lenguaje);

            System.out.println("Ingrese altura:");
            int altura = sc.nextInt();
            programador.setAltura(altura);
            sc.nextLine(); // Consumir el salto de línea

            programadores.add(programador);
        }

        System.out.println(programadores);

        // jefe de proyecto
        JefeDeProyecto jp = new JefeDeProyecto();
        System.out.println("ingrese nombre de jefe de proyecto");
        String nombre = sc.nextLine();
        jp.setNombre(nombre);
        System.out.println("Ingrese rut de jefe de proyecto");
        String rut = sc.nextLine();
        jp.setRut(rut);

        System.out.println("Ingrese altura:");
        int altura = sc.nextInt();
        jp.setAltura(altura);
        sc.nextLine();

        System.out.println("ingrese area");
        String area = sc.nextLine();
        jp.setArea(area);

        //Oficina
        Oficina oficina1 = new Oficina(programadores,jp);
        System.out.println("Oficina");
        listTeamOffice(oficina1);
    }

    public static void listTeamOffice(Oficina oficina){
        //System.out.println(oficina);
        System.out.println(oficina.getProgramadores());
        System.out.println(oficina.getJp());

        System.out.println("///Equipo conformado por la oficina///");
        System.out.println("#####Programadores####");

        for(Programador dev : oficina.getProgramadores()){
            System.out.println("Nombre: "+dev.getNombre());
            System.out.println("Rut: "+dev.getRut());
            System.out.println("Lenguaje: "+dev.getLenguaje());
            System.out.println("Altura: "+dev.getAltura());
        }

        System.out.println("####Jefe de proyecto####");
        System.out.println("Nombre: "+oficina.getJp().getNombre());
        System.out.println("Rut: "+oficina.getJp().getRut());
        System.out.println("Area: "+oficina.getJp().getArea());
        System.out.println("Altura: "+oficina.getJp().getAltura());

    }
}
