# ProyectoExcepcionesJava

Proyecto didáctico para IntelliJ IDEA sobre manejo de excepciones en Java.

## Requisitos
- JDK 17 o superior.
- IntelliJ IDEA Community o Ultimate.

## Abrir en IntelliJ
1. Descomprime la carpeta.
2. En IntelliJ: **File > Open**.
3. Selecciona la carpeta `ProyectoExcepcionesJava`.
4. Si IntelliJ pregunta, importa el proyecto Gradle.
5. Abre cualquier clase con `main` y pulsa Run.

## Orden recomendado
1. `tema01_basicas` — RuntimeException frecuentes.
2. `tema02_scanner_conversion` — entrada y conversión.
3. `tema03_checked` — checked exceptions.
4. `tema04_control` — bucles, switch y multi-catch.
5. `tema05_personalizadas` — throw, throws y excepciones propias.
6. `tema06_recursos` — finally y try-with-resources.
7. `tema07_errors` — Error (solo demostración; leer antes de ejecutar).
8. `tema08_repaso` — práctica integradora.

## Idea clave
`try` debe envolver solo el código que razonablemente puede lanzar la excepción que queremos tratar. Un `try` enorme funciona, pero hace más difícil saber qué instrucción falló y puede ocultar errores de diseño.

> Nota: el JDK contiene una cantidad muy grande de excepciones, incluidas excepciones internas y específicas de APIs avanzadas. Este proyecto cubre las familias y excepciones estándar más útiles para aprender el mecanismo y trabajar en aplicaciones habituales.
