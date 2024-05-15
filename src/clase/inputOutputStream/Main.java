package clase.inputOutputStream;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese nombre de la imagen resultante");
        Scanner sc = new Scanner(System.in);
        String ImageName = sc.nextLine();
        if(!ImageName.endsWith(".jpg")){
            ImageName+=".jpg";
        }

        File inputFile = new File("src/clase/inputOutputStream/Input/pikachu.jpg");
        File outputFile = new File("src/clase/inputOutputStream/Output/",ImageName);
        int newWidth = 300; // Nuevo ancho deseado para la imagen reducida
        int newHeight = 200; // Nuevo alto deseado para la imagen reducida

        try {
            // Leer la imagen de entrada utilizando FileInputStream
            FileInputStream inputStream = new FileInputStream(inputFile);
            BufferedImage originalImage = ImageIO.read(inputStream);
            inputStream.close();

            // Crear una nueva imagen con las dimensiones deseadas(redimencionada pero en blanco)
            BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, originalImage.getType());

            // Redimensionar la imagen de entrada a las nuevas dimensiones
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(originalImage, 0, 0, newWidth, newHeight, null);
            g.dispose();

            // Guardar la imagen redimensionada utilizando FileOutputStream
            FileOutputStream outputStream = new FileOutputStream(outputFile);
            ImageIO.write(resizedImage, "jpg", outputStream);
            outputStream.close();

            System.out.println("¡Imagen redimensionada exitosamente!");
        } catch (IOException e) {
            System.out.println("Error al redimensionar la imagen: " + e.getMessage());
        }
    }
}

