package tema03_checked;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ParseExceptionDemo {
    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);

        try {
            System.out.println(formato.parse("31/02/2026"));
        } catch (ParseException e) {
            System.out.println("La fecha no existe o no tiene el formato esperado.");
        }
    }
}
