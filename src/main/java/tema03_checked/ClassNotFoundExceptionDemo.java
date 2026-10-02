package tema03_checked;

public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            // Class.forName busca una clase por su nombre en tiempo de ejecución.
            Class.forName("paquete.ClaseQueNoExiste");
        } catch (ClassNotFoundException e) {
            System.out.println("Java no pudo localizar la clase solicitada.");
        }
    }
}
