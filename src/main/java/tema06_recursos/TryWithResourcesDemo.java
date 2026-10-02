package tema06_recursos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        // Los recursos declarados entre paréntesis implementan AutoCloseable.
        // Java los cierra automáticamente, incluso si ocurre una excepción.
        try (BufferedReader lector = new BufferedReader(new StringReader("línea 1\nlínea 2"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}
