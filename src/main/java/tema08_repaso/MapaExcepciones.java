package tema08_repaso;

public class MapaExcepciones {
    public static void main(String[] args) {
        System.out.println("Throwable");
        System.out.println("├── Error                 -> fallos graves de JVM/entorno");
        System.out.println("└── Exception");
        System.out.println("    ├── RuntimeException  -> unchecked");
        System.out.println("    └── otras Exception   -> normalmente checked");
        System.out.println();
        System.out.println("Ejemplos unchecked: ArithmeticException, NullPointerException,");
        System.out.println("InputMismatchException, NumberFormatException, IllegalArgumentException.");
        System.out.println("Ejemplos checked: IOException, FileNotFoundException, ParseException,");
        System.out.println("InterruptedException, ClassNotFoundException.");
    }
}
