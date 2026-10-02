package tema05_personalizadas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CajeroSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 100.0;

        try {
            System.out.println("Saldo: " + saldo);
            System.out.print("Cantidad a retirar: ");
            double cantidad = sc.nextDouble();

            if (cantidad <= 0) {
                throw new IllegalArgumentException("La cantidad debe ser positiva.");
            }
            if (cantidad > saldo) {
                throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad);
            }
            saldo -= cantidad;
            System.out.println("Nuevo saldo: " + saldo);
        } catch (InputMismatchException e) {
            System.out.println("La cantidad debe ser numérica.");
        } catch (IllegalArgumentException | SaldoInsuficienteException e) {
            // Multi-catch: dos excepciones distintas reciben el mismo tratamiento.
            System.out.println("Operación rechazada: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
