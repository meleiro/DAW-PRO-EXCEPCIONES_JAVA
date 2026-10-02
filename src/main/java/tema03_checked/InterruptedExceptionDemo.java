package tema03_checked;

public class InterruptedExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Esperando medio segundo...");
            // sleep declara InterruptedException: otro código podría interrumpir el hilo.
            Thread.sleep(500);
            System.out.println("Fin de la espera.");
        } catch (InterruptedException e) {
            // Buena práctica: restaurar la marca de interrupción.
            Thread.currentThread().interrupt();
            System.out.println("El hilo fue interrumpido.");
        }
    }
}
