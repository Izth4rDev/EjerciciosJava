package clase.claseArrayMethod;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10);
        //creacion de stream a partir de una lista
        Stream<Integer> numerosPar = numeros.stream();
        //filtrado en un nuevo stream
        Stream<Integer> filtrado = numerosPar.filter(num -> num%2 == 0);
        //convertimos el stream en una lista
        List<Integer> numberFiltered = filtrado.collect(Collectors.toList());
        System.out.println(numberFiltered);

        //limita el numero de elementos que van a ser filtrados
        Stream<Integer> numerosLimit = numeros.stream();
        Stream<Integer> numerosLimitados = numerosLimit.limit(2);
        List<Integer> convertedLimited = numerosLimitados.collect(Collectors.toList());
        System.out.println(convertedLimited);

        //distinct borra datos duplicados
        Stream<Integer> numerosDisntinc = numeros.stream();
        Stream<Integer> numerosDistintos = numerosDisntinc.distinct();
        List<Integer> distiNumbers = numerosDistintos.collect(Collectors.toList());
        System.out.println(distiNumbers);

        //Saltar numeros de la lista
        Stream<Integer> numeroSaltar = numeros.stream();
        Stream<Integer> numeroSkip = numeroSaltar.skip(2);
        List<Integer> numberSkiped = numeroSkip.collect(Collectors.toList());
        System.out.println(numberSkiped);
    }
}
