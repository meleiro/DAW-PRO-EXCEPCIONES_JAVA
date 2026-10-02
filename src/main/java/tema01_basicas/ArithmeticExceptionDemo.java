package tema01_basicas;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int dividendo = 10;
        int divisor = 0;

        try {
            // El try es pequeño a propósito: esta es la operación que puede lanzar
            // ArithmeticException cuando trabajamos con enteros y divisor == 0.
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir un entero entre cero.");
            System.out.println("Detalle de Java: " + e.getMessage());
        } finally {
            // finally se ejecuta tanto si hubo excepción como si no.
            System.out.println("División finalizada.");
        }
    }
}
