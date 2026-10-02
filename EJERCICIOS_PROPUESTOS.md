# Ejercicios propuestos

1. **Calculadora resistente**: parte de una calculadora con `switch`. Añade tratamiento específico de `InputMismatchException` y `ArithmeticException`, y un `finally`.
2. **Conversor**: lee con `nextLine()` y convierte con `Integer.parseInt`. Captura `NumberFormatException`. Repite hasta obtener un valor correcto.
3. **Edad**: crea y lanza `EdadInvalidaException` para valores fuera de 0..130.
4. **Cajero**: amplía `CajeroSimple` con un bucle de menú y evita cantidades negativas o saldo insuficiente.
5. **Archivo**: cambia el nombre de archivo en `ArchivoNoEncontradoDemo` y observa la diferencia entre archivo existente/no existente.
6. **Multi-catch**: crea una operación donde dos excepciones reciban el mismo mensaje y usa `catch (A | B e)`.
7. **finally**: modifica un ejemplo para que haya una ejecución correcta y otra incorrecta; comprueba que `finally` aparece en ambas.
8. **Reto**: crea `NotaInvalidaException` y valida una nota de 0 a 10.
