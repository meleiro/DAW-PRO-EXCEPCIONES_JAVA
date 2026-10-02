package tema05_personalizadas;

// Al heredar de Exception creamos una CHECKED exception personalizada.
public class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
