package tema02_scanner_conversion;

import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un entero como texto: ");
        String texto = sc.nextLine();

        try {
            // parseInt() es la operación susceptible de fallar. "25" funciona;
            // "veinticinco" o "12.5" producen NumberFormatException.
            int numero = Integer.parseInt(texto);
            System.out.println("Número x 10: " + numero * 10);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir '" + texto + "' a int.");
        } finally {
            sc.close();
        }
    }
}
