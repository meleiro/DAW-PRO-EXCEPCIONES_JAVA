package tema03_checked;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class IOExceptionDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new StringReader("Hola Java"))) {
            System.out.println(br.readLine()); // readLine declara IOException
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
    }
}
