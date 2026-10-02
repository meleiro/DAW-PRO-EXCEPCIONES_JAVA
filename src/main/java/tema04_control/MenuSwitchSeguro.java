package tema04_control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuSwitchSeguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("1. Saludar\n2. Despedirse\n3. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("¡Hola!");
                case 2 -> System.out.println("¡Hasta luego!");
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción fuera del menú.");
            }
        } catch (InputMismatchException e) {
            System.out.println("La opción debe ser numérica.");
        } finally {
            sc.close();
        }
    }
}
