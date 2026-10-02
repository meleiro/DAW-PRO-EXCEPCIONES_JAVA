package tema05_personalizadas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistroEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Edad: ");
            int edad = sc.nextInt();

            // throw lanza explícitamente una excepción cuando una regla del programa falla.
            if (edad < 0 || edad > 130) {
                throw new EdadInvalidaException("La edad debe estar entre 0 y 130.");
            }
            System.out.println("Edad válida: " + edad);
        } catch (InputMismatchException e) {
            System.out.println("La edad debe ser un entero.");
        } catch (EdadInvalidaException e) {
            System.out.println("Validación: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
