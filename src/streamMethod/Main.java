package streamMethod;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        //filter
        List<String> alumnos= Arrays.asList("Ringo","Paul","Jhon","George","Miguel","Nico","Agustin","Vittorio","Marcos","Sebastian");
        Stream<String> alumnDataStream = alumnos.stream();
        Stream<String> alumnosFiltered = alumnDataStream.filter(element -> element.startsWith("M"));
        List<String> alumnosFileterdList = alumnosFiltered.collect(Collectors.toList());
        System.out.println(alumnosFileterdList);

        //map
            //paso por paso
        List<Integer> numeros = Arrays.asList(25,45,62,33,54,74,11,25);
        Stream<Integer> numPar = numeros.stream();
        Stream<Integer> numParTerminal = numPar.map(numbers -> numbers*2);
        List<Integer> resultado = numParTerminal.collect(Collectors.toList());
        System.out.println(resultado);
            //mas declarativo
        List<Integer> numeros2 = Arrays.asList(25,45,62,33,54,74,11,25);
        Stream<Integer> numPar2 = numeros2.stream().map(numbers->numbers*3);
        //metodos Collector
            //List<Integer> resultado2 = numPar2.collect(Collectors.toList());
            //long resultado2 = numPar2.collect(Collectors.counting());

        List<Integer> numeros3 = Arrays.asList(25, 45, 62, 33, 54, 74, 11, 25);

        //encuentra el valor minimo
        int minValue = numeros2.stream()
                .min((Integer a, Integer b)->a-b)
                .get();
        System.out.println("Valor Mínimo: " + minValue);

        //encuentra el valor maximo
        int maxValue = numeros2.stream()
                .max((Integer a, Integer b)->a-b)
                .get();

        /*max y min devuelven un Optional, que es una clase contenedora que puede o no contener un valor
        por lo tanto para obtener el valor max y min utilizamos .get() que es un metodo de la clase Optional
        que nos permite obtener el valor min y max si este existe*/

        System.out.println("Valor maximo: " + maxValue);
    }
}
