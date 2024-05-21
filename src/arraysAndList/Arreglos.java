package arraysAndList;
import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args){
        /*··Arrays..*/
        //declaracion de un array
        int[] numbers;
        //creacion de un array
        numbers = new int[4];
        //Declaracion y creacion de un array
        int[] numbers2 = new int[4];
        //asignacion de valores
        numbers2[0]=2;
        numbers2[1]=22;
        numbers2[2]=222;
        numbers2[3]=2222;
        //declaracion e inicializacion del array
        int[] numbers3 = {5,85,12,33,48};

        for(int num : numbers2){
            System.out.println(num);
        }

        System.out.println("///////copia total////// ");
        //copiar un array
        int[] copyNumbers3 = Arrays.copyOf(numbers3,numbers3.length);
        for(int num : copyNumbers3){
            System.out.println(num);
        }

        System.out.println("/////Copia rango//////// ");
        //copia un rango del array
        int[] copyRangeA = Arrays.copyOfRange(numbers3,1,2);
        for(int num : copyRangeA){
            System.out.println(num);
        }

        System.out.println("/////Ordenamiento//////// ");
        //Ordenar un array
        Arrays.sort(numbers3);
        for(int num : numbers3){
            System.out.println(num);
        }

        System.out.println("///////////// ");
        //busqueda binaria
        String [] pokemon = {"Pikachu","Charizard","Squirtle","Dragonite","Ratata","Joleteon","Mew","Mewtwo"};
        //Devuelve el indice del elemento encontrado
            //hay que ordenar primero el arreglo con .sort()
            Arrays.sort(pokemon);
        int index = Arrays.binarySearch(pokemon,"Dragonite");
        System.out.println(Arrays.toString(pokemon));
        System.out.println(index);

        System.out.println("///////toString////// ");
        //devuelve cadena de texto
        System.out.println(Arrays.toString(numbers3));
        System.out.println(numbers3[2]);

        System.out.println("///////////// ");
        //compara dos arreglos y verifica si estos son iguales
        int[] A = {1,2,3};
        int[] B = {1,2,3};

        boolean igual = Arrays.equals(A,B);
        System.out.println(igual);

    }
}
