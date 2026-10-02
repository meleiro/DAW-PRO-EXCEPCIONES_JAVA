package tema05_personalizadas;

public class CodigoPostalDemo {
    public static void main(String[] args) {
        String codigo = "30A00";
        try {
            if (!codigo.matches("\\d{5}")) {
                throw new CodigoPostalInvalidoException("Debe contener exactamente 5 dígitos.");
            }
            System.out.println("Código postal válido.");
        } catch (CodigoPostalInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
