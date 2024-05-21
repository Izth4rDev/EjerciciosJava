package arraysAndList;
import java.util.*;


public class Listas {
    public static void main(String[] args){
        //creacion de lista
        List<String> frutas = new ArrayList<String>();
        //añadir elementos a la lista
        frutas.add("Durazno");
        frutas.add("Platano");
        frutas.add("Mango");
        frutas.add("Maracuya");
        frutas.add("Manzana");

        //mostrar elemento
        System.out.println(frutas.get(3));
        //modificar un elemento
        frutas.set(4,"Chirimoya");
        System.out.println(frutas.get(4));
        //Eliminar elemento
        frutas.remove(3);
        System.out.println(frutas.get(3));
        //conocer el tamaño
        System.out.println(frutas.size());
        //conocer si la lista contiene elementos
        System.out.println(frutas.isEmpty());
        //conocer si un elemento existe en la lista
        System.out.println(frutas.contains("Mango"));
        //Eliminar todos los elementos de la lista
        //frutas.clear();

        //Devuelve el indice del elemento a consultado
        System.out.println(frutas.indexOf("Mango"));
        //copia en un arreglo los elementos de la lista
        Object[] elements = frutas.toArray();
        System.out.println(Arrays.toString(elements));

        //Ordenar una lista
        frutas.sort(Comparator.naturalOrder());
        System.out.println(frutas);
        frutas.sort(Comparator.reverseOrder());
        System.out.println(frutas);


        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(22);
        numbers.add(2);
        numbers.add(14);
        numbers.add(56);

        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);

        // Crear una lista de personas
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("María", 30));
        personas.add(new Persona("Pedro", 20));

        // Ordenar la lista de personas por edad usando Comparator.comparingInt()
        personas.sort(Comparator.comparingInt(Persona::getEdad));

        // Imprimir la lista ordenada
        System.out.println("Lista de personas ordenada por edad:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

    }
}
