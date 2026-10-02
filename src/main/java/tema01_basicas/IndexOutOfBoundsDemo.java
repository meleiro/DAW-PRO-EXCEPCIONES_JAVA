package tema01_basicas;

public class IndexOutOfBoundsDemo {
    public static void main(String[] args) {
        String texto = "Java";

        try {
            // Java tiene posiciones 0..3 en este String. La posición 8 no existe.
            System.out.println(texto.charAt(8));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Posición inexistente dentro del texto.");
        }
    }
}
