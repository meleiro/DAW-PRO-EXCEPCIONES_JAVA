package tema02_scanner_conversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BooleanYDoubleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Precio decimal: ");
            double precio = sc.nextDouble();
            System.out.print("¿Tiene descuento? (true/false): ");
            boolean descuento = sc.nextBoolean();

            if (descuento) precio *= 0.9;
            System.out.println("Precio final: " + precio);
        } catch (InputMismatchException e) {
            System.out.println("Algún dato no tiene el tipo esperado.");
        } finally {
            sc.close();
        }
    }
}
