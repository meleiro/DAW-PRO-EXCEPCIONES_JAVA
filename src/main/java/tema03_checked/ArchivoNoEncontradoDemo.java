package tema03_checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ArchivoNoEncontradoDemo {
    public static void main(String[] args) {
        try {
            // FileReader declara FileNotFoundException (checked). El compilador
            // obliga a capturarla o declararla con throws.
            FileReader lector = new FileReader("archivo_que_no_existe.txt");
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
        } catch (java.io.IOException e) {
            System.out.println("Problema al cerrar el archivo.");
        }
    }
}
