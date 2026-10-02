package tema05_personalizadas;

// RuntimeException crea una excepción personalizada UNCHECKED.
public class CodigoPostalInvalidoException extends RuntimeException {
    public CodigoPostalInvalidoException(String mensaje) { super(mensaje); }
}
