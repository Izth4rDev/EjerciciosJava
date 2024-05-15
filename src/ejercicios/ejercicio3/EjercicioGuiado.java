package ejercicios.ejercicio3;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioGuiado {
    public static void main(String[] args){
        int [] sueldos = new int[] {400000, 760000, 1100000, 650000, 654980, 987300,
                700450, 442300};
        double [] notas = new double[] {4.7,2.2,5.4,6.9,4.4,2.6};

        //Promedio
        System.out.println(promedio(sueldos));

        //agregar elemento
        ArrayList<String> Elementos = new ArrayList<String>();
        Elementos.add("mesa");
        Elementos.add("Refrigerador");
        Elementos.add("Cocina");
        Elementos.add("lavadora");
        agregarElemento(Elementos);

        //mayor y menor
        double mayor = Mayor(notas);
        double menor = Menor(notas);
        System.out.println("el mayor es "+mayor);
        System.out.println("el menor es "+menor);

        //Ingresar Elemeto existe
        ArrayList<String> elementoExiste = new ArrayList<String>();
        elementoExiste.add("Miguel");
        elementoExiste.add("Pedro");
        elementoExiste.add("Diego");
        IngresarExiste(elementoExiste);

    }

    public static double promedio(int[] sueldos) {
        int resultado = 0, cont = 0;
        for (int numero : sueldos) {
            if (numero > 500000) {
                resultado = resultado + numero;
                cont++;
            }
        }
        resultado = resultado / cont;
        return resultado;
    }

    public static void agregarElemento(ArrayList<String> Elementos){

        Scanner sc = new Scanner(System.in);
        String elemento;
        Boolean respuesta = true;
        String resp;

        do{
            System.out.println("desea ingresar un elemento S/N ?");
            resp = sc.nextLine();

            if(resp.equals("S")){

                System.out.println("ingrese un elemento");
                elemento = sc.nextLine();

                if(!Elementos.contains(elemento)){
                    Elementos.add(elemento);
                }else{
                    System.out.println("el elemento ya existe");
                }

                respuesta = true;

            }else if(resp.equals("N")){
                respuesta = false;
            }else{
                System.out.println("debe ingresar S o N");
                respuesta = false;
            }

        }while(respuesta);

        for (String element : Elementos){
            System.out.println(element);
        }
    }

    public static double Mayor (double[] notas){
        double mayor = 0;
        for(int i=0; i<notas.length; i++){
            if (mayor < notas[i]) {
                mayor = notas[i];
            }
        }
        return mayor;
    }
    public static double Menor (double[] notas){
        double menor = notas[0];
        for(int i=0; i<notas.length; i++){
            if (menor > notas[i]) {
                menor = notas[i];
            }
        }
        return menor;
    }
    public static void IngresarExiste(ArrayList<String> elementos){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese elemento");
        String elemento = sc.nextLine();

        if(elementos.contains(elemento)){
            System.out.println("el elemento existe: "+ elemento);
        }else{
            System.out.println("El elemento no existe\n ######elementos dentro del arrylist######");
            for(String elements : elementos){
                System.out.println(elements);
            }
            elementos.clear();
            System.out.println("######elementos eliminados######");
            System.out.println("elementos en el arrayList: " + elementos.size());
        }
    }
}
