package tema01_basicas;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String nombre = null;

        try {
            // nombre no referencia un String real. Invocar length() sobre null
            // provoca NullPointerException.
            System.out.println("Longitud: " + nombre.length());
        } catch (NullPointerException e) {
            System.out.println("No podemos usar métodos sobre una referencia null.");
        }
    }
}
