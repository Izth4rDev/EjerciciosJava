package ejercicios.ejercicio2;

public class Producto {
    private String nombreP;
    private int precio;
    private int cantidad;

    public Producto (String nombreP, int precio, int cantidad){
        this.nombreP = nombreP;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void calcularDescuento (){
        double descuento =this.precio - (0.25*this.precio) ;
        System.out.print("el valor de descuento es:" + descuento );
    }
}
