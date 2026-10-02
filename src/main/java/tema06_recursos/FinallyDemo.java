package tema06_recursos;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Entramos en try.");
            int resultado = 10 / 2;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error matemático.");
        } finally {
            // Se usa para tareas que deben intentarse siempre al abandonar try/catch.
            System.out.println("finally se ejecuta siempre en el flujo normal de salida.");
        }
    }
}
