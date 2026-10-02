package tema02_scanner_conversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un entero: ");
            // nextInt() espera un entero. Si escribimos "hola", lanza
            // InputMismatchException. Por eso esta lectura está dentro del try.
            int numero = sc.nextInt();
            System.out.println("Doble: " + numero * 2);
        } catch (InputMismatchException e) {
            System.out.println("La entrada no tiene formato de número entero.");
        } finally {
            sc.close();
            System.out.println("Scanner cerrado.");
        }
    }
}
