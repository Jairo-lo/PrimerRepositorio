import java.util.Scanner;

public class Intento {
    public static void main(String[] args) {
        // Ingreso de credenciales por código para su posterior validación
        final String JQUSER = "profe";
        final String JQPASS = "1234";
        final String JQCEDULA = "1751405570";
        final String JQNOMBRE = "Jairo Quispe";
        final String JQCORREO = "jairo.quispe@epn.edu.ec";

        String negro = "\033[30m";
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String amarillo = "\033[33m";
        String azul = "\033[34m";
        String magenta = "\033[35m";
        String celeste = "\033[36m";
        String blanco = "\033[37m";
        String negroIntenso = "\033[1;30m";
        String rojoIntenso = "\033[1;31m";
        String verdeIntenso = "\033[1;32m";
        String amarilloIntenso = "\033[1;33m";
        String azulIntenso = "\033[1;34m";
        String magentaIntenso = "\033[1;35m";
        String celesteIntenso = "\033[1;36m";
        String blancoIntenso = "\033[1;37m";

        String jqusuario, jqclave, jqcodigo, jqnombre, jqedad, jqsexo;
        int jqcontador = 0, jqopcion, jqvalidar = 1;
        boolean jqingresa = false;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.print(amarillo + "-------------------------------------------------\n");
            System.out.print(verde + "\t\t\"NETWORKIN DE <LOGING>\"\n");
            System.out.print(amarillo + "-------------------------------------------------\n");
            System.out.print(negro + "      - Usuario:\n\t" + rojo);
            jqusuario = scanner.next();
            System.out.print(azul + "      - Clave:\n\t" + magenta);
            jqclave = scanner.next();
            System.out.print(".......................................\n");
            System.out.print(celeste + "      * Número de intentos: " + jqvalidar);

            jqvalidar++;

            if (jqusuario.equals(JQUSER) && jqclave.equals(JQPASS)) {
                jqingresa = true;
                System.out.print(blanco + "\n::Bienvenido PROFE\n");
                System.out.print("\n    <+> Por favor, registra:\n");

                System.out.print("      1. Codigo (ID): \n\t");
                jqcodigo = scanner.next();

                System.out.print("      2. Nombre o nickname: \n\t");
                jqnombre = scanner.next();

                System.out.print("      3. Edad: \n\t");
                jqedad = scanner.next();

                System.out.print("      4. Sexo: \n\t");
                jqsexo = scanner.next();

                System.out.print(amarillo + "-------------------------------------------------\n");
                System.out.print(verde + "\t\t\"NETWORKIN DE <CREDENCIALES>\"\n");
                System.out.print(amarillo + "-------------------------------------------------\n\t");
                System.out.print(rojo + "Usuario: PROFE\n");

                System.out.print(negro + "1. Agregar amigo\n\t2. Amigo de amigo\n\t3. Network final\n\t0. Salir");

                jqopcion = scanner.nextInt();

                if (jqopcion == 0) {
                    System.out.print("\nRegresa pronto PROFE. Hasta luego!");
                } else if (jqopcion == 1) {
                    System.out.print(amarillo + "-------------------------------------------------\n");
                    System.out.print(verde + "\t\t\"NETWORKIN DE <AGREGAR AMIGO>\"\n");
                    System.out.print(amarillo + "-------------------------------------------------\n\t");
                    System.out.print("      1. Codigo (ID): \n\t");
                    jqcodigo = scanner.next();

                    System.out.print("      2. Nombre o nickname: \n\t");
                    jqnombre = scanner.next();

                    System.out.print("      3. Edad: \n\t");
                    jqedad = scanner.next();

                    System.out.print("      4. Sexo: \n\t");
                    jqsexo = scanner.next();
                } else if (jqopcion == 2) {
                    System.out.print(amarillo + "-------------------------------------------------\n");
                    System.out.print(verde + "\t\t\"NETWORKIN DE <AMIGO DE AMIGO>\"\n");
                    System.out.print(amarillo + "-------------------------------------------------\n\t");
                    System.out.print("      1. Codigo (ID): \n\t");
                    jqcodigo = scanner.next();

                    System.out.print("      2. Nombre o nickname: \n\t");
                    jqnombre = scanner.next();

                    System.out.print("      3. Edad: \n\t");
                    jqedad = scanner.next();

                    System.out.print("      4. Sexo: \n\t");
                    jqsexo = scanner.next();
                } else if (jqopcion == 3) {
                    System.out.print(amarillo + "-------------------------------------------------\n");
                    System.out.print(verde + "\t\t\"NETWORKIN DE <VER TODO>\"\n");
                    System.out.print(amarillo + "-------------------------------------------------\n\t");
                    System.out.print(rojo + "Usuario: PROFE\n\t");
                    System.out.print(azulIntenso + "(" + jqcodigo + "-" + jqsexo + ") " + blancoIntenso + jqnombre);

                } else {
                    System.out.print("Error de ingreso");
                }
            } else {
                System.out.print("\n\tEl usuario y/o clave son incorrectos\n");
                jqcontador++;
            }
        } while (!jqingresa && jqcontador < 3);

        if (!jqingresa) {
            System.out.print("Lo sentimos, tu usuario y clave son incorrectos..!");
            System.out.print("Gracias.");
        }
    }
}
