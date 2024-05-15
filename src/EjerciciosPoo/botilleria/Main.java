package EjerciciosPoo.botilleria;

public class Main {
    public static void main (String[] args){
        // creamos un objeto del tipo cerveza
        //creacion de objeto sin setter
        Cerveza royal = new Cerveza("botella 2LT", "Royal", 2500);
        //creacion de objeto con setter
        Cerveza stella = new Cerveza();
        stella.setBotella("Botella 2LT");
        stella.setMarca("Stella Artois");
        stella.setPrecio(3000);

        //imprimimos los objetos para ver si se crearon correctamente
        System.out.println(royal);
        System.out.println(stella);

        //aqui hay un error, si queremos meter muchas botellas de cerveza en la boti tenemos que hacer una List
        //pero para efectos del ejercicio vamos a ingresar solo una a la botillera

        //creamos el objeto EjerciciosPoo.botilleria
        Botilleria liquidos = new Botilleria();
        liquidos.setNombre("liquiedos");
        liquidos.setCerveza(royal);

        //mostranis el objeto EjerciciosPoo.botilleria
        System.out.println(liquidos);

        //ahi quedo (^w^)



    }
}
