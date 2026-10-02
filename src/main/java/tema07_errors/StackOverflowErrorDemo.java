package tema07_errors;

public class StackOverflowErrorDemo {
    public static void main(String[] args) {
        System.out.println("Demostración desactivada para evitar un fallo accidental.");
        System.out.println("StackOverflowError suele aparecer por recursión sin condición de salida.");
        // recursivo(); // Descomenta SOLO con intención didáctica.
    }

    static void recursivo() {
        recursivo();
    }
}
