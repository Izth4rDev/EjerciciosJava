package ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args){
        mensaje();
        int resultado = suma(2,3);
        System.out.println(resultado);
        Producto camisa = new Producto("Camisa pokemon",25000,2);
        camisa.calcularDescuento();
    }

    public static void mensaje(){
        System.out.println("hola mundo");
    }
    public static int suma(int valor1, int valor2){
        return valor1+valor2;
    }
}
