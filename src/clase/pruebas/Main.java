package clase.pruebas;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/clase/pruebas/output.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Hello, world!");
            writer.printf("The value of pi is approximately %.2f%n", Math.PI);
            writer.println("Goodbye!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

