package tema08_repaso;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PracticaFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int secreto = random.nextInt(10) + 1;
        boolean acertado = false;

        for (int intento = 1; intento <= 3 && !acertado; intento++) {
            try {
                System.out.print("Intento " + intento + ". Número 1-10: ");
                int numero = sc.nextInt();

                if (numero < 1 || numero > 10) {
                    throw new IllegalArgumentException("El número debe estar entre 1 y 10.");
                }

                if (numero == secreto) {
                    acertado = true;
                    System.out.println("¡Correcto!");
                } else {
                    System.out.println(numero < secreto ? "El secreto es mayor." : "El secreto es menor.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un entero.");
                sc.nextLine(); // limpia la entrada inválida
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Intento procesado.\n");
            }
        }

        if (!acertado) System.out.println("El número secreto era " + secreto);
        sc.close();
    }
}
