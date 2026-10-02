package tema01_basicas;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        try {
            // Este ejemplo se deja para cuando se introduzcan arrays.
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("La posición solicitada no existe en el array.");
        }
    }
}
