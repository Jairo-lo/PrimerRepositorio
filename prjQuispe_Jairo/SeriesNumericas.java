package prjQuispe_Jairo;

import javax.swing.JOptionPane;

public class SeriesNumericas {
    int i, j, k, veces, dimension;

    /**
     * El método LectorDatos solicita al usuario ingresar la dimensión para todas
     * las series numéricas.
     * La dimensión se almacena en la variable 'dimension'.
     */
    public void LectorDatos() {
        int validar = -1; // Valor inicial inválido para entrar al bucle

        while (validar < 0 || validar > 19) {
            String dimension = JOptionPane.showInputDialog("Ingrese dimension para todas sus series numericas...");

            try {
                validar = Integer.parseInt(dimension);

                if (validar < 0 || validar > 19) {
                    JOptionPane.showMessageDialog(null, "Incorrecto. Debe ser número entre 0 y 19.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.");
            }
        }
        dimension = validar;
    }

    // SERIE 01, Fibonacci....................
    /**
     * El método QuispeSerie01 genera la Serie 01, también conocida como la serie de
     * Fibonacci.
     * La serie se imprime en la consola y está compuesta por números que siguen la
     * secuencia de Fibonacci.
     */
    public void QuispeSerie01() {
        j = 1;
        System.out.print("\n- Serie 01. 0 1 1 2 3 5 8 13... (Fibonacci):\n  ");

        while (veces < dimension) {
            veces = veces + 2;
            System.out.print(i + " ");
            j = j + i;
            i = i + j;
            if (veces <= dimension) {
                System.out.print(j + " ");
            }
        }
    }

    // SERIE 02, Impares y Ceros....................
    /**
     * El método QuispeSerie02 genera la Serie 02, que contiene números impares
     * seguidos de ceros alternativamente.
     * La serie se imprime en la consola.
     */
    public void QuispeSerie02() {
        i = 1;
        veces = 0;
        System.out.print("\n\n- Serie 02. 1 0 3 0 5 0 7 0... (Impares y 0s):\n  ");

        while (veces < dimension) {
            veces = veces + 2;
            System.out.print(i + " ");
            i = i + 2;
            if (veces <= dimension) {
                System.out.print("0 ");
            }
        }
    }

    // SERIE 03, Fibonacci y denominador impar.....................
    /**
     * El método QuispeSerie03 genera la Serie 03, que combina la secuencia de
     * Fibonacci con denominadores impares.
     * La serie se imprime en la consola en formato de fracción.
     */
    public void QuispeSerie03() {
        j = 1;
        i = 0;
        k = 1;
        veces = 0;
        System.out.print("\n\n- Serie 03. 0/1 1/3 1/5 2/7 3/9... (Fibonacci/impares):\n  ");

        while (veces < dimension) {
            veces = veces + 2;

            System.out.print(i + "/" + k + " ");
            j = j + i;
            i = i + j;
            k = k + 2;
            if (veces <= dimension) {
                System.out.print(j + "/" + k + " ");
            }
            k = k + 2;
        }
    }

    // SERIE 04, Fibonacci y Pares.....................
    /**
     * El método QuispeSerie04 genera la Serie 04, que combina la secuencia de
     * Fibonacci con denominadores pares.
     * La serie se imprime en la consola en formato de fracción.
     */
    public void QuispeSerie04() {
        j = 1;
        i = 0;
        k = 2;
        veces = 0;
        System.out.print("\n\n- Serie 04. 0/2 1/4 1/6 2/8 3/10... (Fibonacci/pares):\n  ");

        while (veces < dimension) {
            veces = veces + 2;

            System.out.print(i + "/" + k + " ");
            j = j + i;
            i = i + j;
            k = k + 2;
            if (veces <= dimension) {
                System.out.print(j + "/" + k + " ");
            }
            k = k + 2;
        }
    }

    // SERIE 05, Números primos.....................
    /**
     * El método QuispeSerie05 genera la Serie 05, que contiene números primos en
     * orden ascendente.
     * La serie se imprime en la consola.
     */
    public void QuispeSerie05() {
        System.out.print("\n\n- Serie 05. 2 3 5 7 11 13 17 19... (Primos):\n  ");

        for (int contador = 0, numero = 2; contador < dimension; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
            }
        }
    }

    /**
     * El método esPrimo verifica si un número dado es primo.
     * Devuelve true si el número es primo, de lo contrario, devuelve false.
     */
    public static boolean esPrimo(int numero) {
        return numero > 1 && java.util.stream.IntStream.range(2, (int) Math.sqrt(numero) + 1)
                .noneMatch(i -> numero % i == 0);
    }

    // SERIE 06, Cuadrado de números naturales.....................
    /**
     * El método QuispeSerie06 genera la Serie 06, que contiene el cuadrado de
     * números naturales.
     * La serie se imprime en la consola.
     */
    public void QuispeSerie06() {
        i = 1;
        veces = 0;
        System.out.print("\n\n- Serie 06. 1 4 9 16 25 36 49 64... (Al cuadrado):\n  ");
        while (veces < dimension) {
            veces++;
            i = veces * veces;
            System.out.print(i + " ");
        }
    }

    // SERIE 07, (+3) desde el 1.....................
    /**
     * El método QuispeSerie07 genera la Serie 07, que contiene números
     * incrementados en 3 comenzando desde 1.
     * La serie se imprime en la consola.
     */
    public void QuispeSerie07() {
        i = 1;
        veces = 0;
        System.out.print("\n\n- Serie 07. 1 4 7 10 13 16 19 22... (+3 desde 1):\n  ");
        while (veces < dimension) {
            veces++;
            System.out.print(i + " ");
            i = i + 3;
        }
    }

    // SERIE 08, (+5) desde el 3.....................
    /**
     * El método QuispeSerie08 genera la Serie 08, que contiene números
     * incrementados en 5 comenzando desde 3.
     * La serie se imprime en la consola.
     */
    public void QuispeSerie08() {
        i = 3;
        veces = 0;
        System.out.print("\n\n- Serie 08. 3 8 13 18 23 28 33 38... (+5 desde 3):\n  ");
        while (veces < dimension) {
            veces++;
            System.out.print(i + " ");
            i = i + 5;
        }
    }

    // SERIE 09, 2 al cuadrado.....................
    /**
     * El método QuispeSerie09 genera la Serie 09, que contiene potencias de 2.
     * La serie se imprime en la consola.
     */
    public void QuispeSerie09() {
        veces = 0;
        i = 1;
        System.out.print("\n\n- Serie 09. 2 4 8 16 32 64 128 256... (Potencias de 2):\n  ");
        while (veces < dimension) {
            veces++;
            i = i * 2;
            System.out.print(i + " ");
        }
    }

    // SERIE 10, 3 al cuadrado.....................
    /**
     * El método QuispeSerie10 genera la Serie 10, que contiene potencias de 3.
     * La serie se imprime en la consola.
     */
    public void QuispeSerie10() {
        veces = 0;
        i = 1;
        System.out.print("\n\n- Serie 10. 3 9 27 81 243 729 2187 6561... (Potencias de 3):\n  ");
        while (veces < dimension) {
            veces++;
            i = i * 3;
            System.out.print(i + " ");
        }
    }

    // SERIE 12.....................
    /**
     * El método QuispeSerie12 genera la Serie 12, que contiene productos crecientes
     * de números.
     * La serie se imprime en la consola.
     */
    public void QuispeSerie12() {
        k = 0;
        i = 1;
        j = 2;

        System.out.print("\n\n- Serie 12. 2 6 12 20 30 42 56 72... (Producto creciente):\n  ");

        while (i <= dimension) {
            k = i * j;
            i++;
            j++;
            System.out.print(k + " ");
        }
        System.out.print(
                "\n................................................................................................\n");
    }
}
