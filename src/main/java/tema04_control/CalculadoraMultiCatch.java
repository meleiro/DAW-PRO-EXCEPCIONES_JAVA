package tema04_control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraMultiCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Dividendo: ");
            int a = sc.nextInt();
            System.out.print("Divisor: ");
            int b = sc.nextInt();
            System.out.println("Resultado: " + a / b);
        } catch (InputMismatchException e) {
            System.out.println("Debes escribir enteros.");
        } catch (ArithmeticException e) {
            System.out.println("El divisor no puede ser cero.");
        } finally {
            sc.close();
            System.out.println("Operación terminada.");
        }
    }
}
