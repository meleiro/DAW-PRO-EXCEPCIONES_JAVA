package tema04_control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BucleHastaEntradaValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Edad (entero): ");
                int edad = sc.nextInt();
                if (edad < 0) {
                    System.out.println("La edad no puede ser negativa.");
                } else {
                    System.out.println("Edad registrada: " + edad);
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada incorrecta. Inténtalo de nuevo.");
                // nextInt no consume el token incorrecto; nextLine lo descarta.
                sc.nextLine();
            }
        }
        sc.close();
    }
}
