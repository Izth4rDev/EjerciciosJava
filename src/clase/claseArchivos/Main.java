package clase.claseArchivos;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String nameDirectory, nameFile, dataName;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del directorio");
        nameDirectory = sc.nextLine();
        System.out.println("Ingrese el nombre del archivo (este debe finalizar con .txt");
        nameFile = sc.nextLine();

        //Llamada al metodo crearArchivo
        crearArchivo(nameDirectory, nameFile);

        //LLamada al metodo buscar Texto
        System.out.println("Ingrese el elemento a buscar en el archivo");
        dataName = sc.nextLine();
        nameFile = "src/"+nameDirectory+"/"+nameFile;
        bucarTexto(dataName,nameFile);

    }
    public static void crearArchivo(String nameDirectory, String nameFile){
        //Instancias de clases y delcaracion de variables
        File directory = new File("src/"+nameDirectory);
        File fileWrite = new  File("src/"+nameDirectory+"/"+nameFile);
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Perro");
        lista.add("Gato");
        lista.add("Juan");
        lista.add("Daniel");
        lista.add("Juan");
        lista.add("Gato");
        lista.add("Perro");
        lista.add("Camila");
        lista.add("Daniel");
        lista.add("Camila");

        //Creacion del directorio
        try{
            if(!directory.exists()){
                if(directory.mkdirs()){
                    System.out.println("directorio creado exitosamente");
                }else{
                    System.out.println("Error al crear el archivo: Revise permisos sobre el direcotrio Raiz");
                }
            }else{
                System.out.println("El Directorio ya Existe");
            }
        }catch(RuntimeException e){
            System.out.println("error al crear el archivo" + e.getMessage());
        }

        //Creacion del archivo dentro del directorio
        try{
            if(fileWrite.createNewFile()){
                System.out.println("archivo creado exitosamente");
            }else{
                System.out.println("problemas al crear el arhivo");
                return;
            }
        }catch (IOException e){
            System.out.println("Error al crear el archivo"+e.getMessage());
            return;
        }

        //Escribir en el archivo los elementos del array
        try(FileWriter writingData = new FileWriter(fileWrite);
            BufferedWriter bWritingData = new BufferedWriter(writingData)){
            for(String data : lista){
                //escribe en el archivo
                bWritingData.write(data);
                //agrega un salto de linea
                bWritingData.newLine();
            }
        }catch(IOException e){
            System.out.println("Problemas al escribir en el archivo"+e.getMessage());
        }
    }

    public static void bucarTexto(String dataName, String nameFile){
        File fileRead = new  File(nameFile);
        int count = 0;

        if(fileRead.exists()){
            try(FileReader readingFile = new FileReader (fileRead);
            BufferedReader bReadingFile = new BufferedReader(readingFile)){
                String line;
                while ((line = bReadingFile.readLine()) != null) {
                    if(line.equals(dataName)){
                        count++;
                    }
                }
            }catch (IOException e){
                System.out.println("error al leer el archivo" + e.getMessage());
            }
        }else{
            System.out.println("archivo no existe");
            return;
        }

        System.out.println("cantidad de repeticiones del texto -> "+count);
    }
}
