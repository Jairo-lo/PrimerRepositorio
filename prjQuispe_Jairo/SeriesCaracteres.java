package prjQuispe_Jairo;

import javax.swing.JOptionPane;

public class SeriesCaracteres {
    int a, b, c, i, j, k, l, veces;
    int dimension01;

    /**
     * Método para leer la dimensión de las series de caracteres.
     * Solicita al usuario ingresar la dimensión para todas las series de
     * caracteres.
     */
    public void LectorDatosC01() {
        int validar = -1; // Valor inicial inválido para entrar al bucle

        while (validar < 0 || validar > 13) {
            String dimension01 = JOptionPane
                    .showInputDialog("Ingrese dimension para todas sus series con caracteres...");

            try {
                validar = Integer.parseInt(dimension01);

                if (validar < 0 || validar > 13) {
                    JOptionPane.showMessageDialog(null, "Incorrecto. Debe ser número entre 0 y 13.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.");
            }
        }
        dimension01 = validar;
    }

    /**
     * SerieC01: Signos alternos (+ - + - + - + - ...).
     * Imprime una serie de signos alternos (+ y -) hasta la dimensión especificada.
     */
    public void QuispeSerieC01() {
        System.out.print("\n- Serie C01. + - + - + - + -... (Signos alternos):\n  ");
        while (veces < dimension01) {
            veces = veces + 2;
            System.out.print("+ ");
            if (veces <= dimension01) {
                System.out.print("- ");
            }
        }
    }

    /**
     * SerieC02: Fibonacci (+ + ++ +++ +++++ ...).
     * Imprime una serie de signos (+) en la secuencia de Fibonacci hasta la
     * dimensión especificada.
     */
    public void QuispeSerieC02() {
        j = 1;
        veces = -1;
        k = 0;
        System.out.print("\n\n- Serie C02. + + ++ +++ +++++... (Fibonacci):\n ");

        while (veces < dimension01) {
            veces = veces + 2;
            while (k < i) {
                System.out.print("+");
                k++;
            }
            k = 0;
            System.out.print(" ");
            j = i + j;
            i = i + j;
            if (veces <= dimension01) {
                while (k < j) {
                    System.out.print("+");
                    k++;
                }
                k = 0;
                System.out.print(" ");
            }
        }
    }

    /**
     * SerieC03: Primos (++ +++ +++++ +++++++ ...).
     * Imprime una serie de signos (+) con números primos hasta la dimensión
     * especificada.
     */
    public void QuispeSerieC03() {
        k = 0;
        System.out.print("\n\n- Serie C03. ++ +++ +++++ +++++++... (Primos):\n  ");

        for (int contador = 0, numero = 2; contador < dimension01; numero++) {
            if (esPrimo01(numero)) {
                while (k < numero) {
                    k++;
                    System.out.print("+");
                }
                k = 0;
                contador++;
                System.out.print(" ");
            }
        }
    }

    /**
     * Verifica si un número es primo.
     *
     * @param numero El número a verificar.
     * @return true si el número es primo, false en caso contrario.
     */
    public static boolean esPrimo01(int numero) {
        return numero > 1
                && java.util.stream.IntStream.range(2, (int) Math.sqrt(numero) + 1).noneMatch(i -> numero % i == 0);
    }

    /**
     * SerieC04: Operaciones básicas (+ - * / + - * / ...).
     * Imprime una serie de signos (+, -, *, /) hasta la dimensión especificada.
     */
    public void QuispeSerieC04() {
        System.out.print("\n\n- Serie C04. + - * / + - * /... (Op. básicas):\n  ");
        veces = 1;
        while (veces <= dimension01) {
            System.out.print("+ ");
            veces++;
            if (veces <= dimension01) {
                System.out.print("- ");
            }
            veces++;
            if (veces <= dimension01) {
                System.out.print("* ");
            }
            veces++;
            if (veces <= dimension01) {
                System.out.print("/ ");
            }
            veces++;
        }
    }

    /**
     * SerieC05: Líneas alternadas (\ | / - | \ | / ...).
     * Imprime una serie de caracteres (\, |, /, -) hasta la dimensión especificada.
     */
    public void QuispeSerieC05() {
        System.out.print("\n\n- Serie C05. \\ | / - | \\ | /... (Líneas alternadas):\n  ");
        veces = 1;
        while (veces <= dimension01) {
            System.out.print("\\ ");
            veces++;
            if (veces <= dimension01) {
                System.out.print("| ");
            }
            veces++;
            if (veces <= dimension01) {
                System.out.print("/ ");
            }
            veces++;
            if (veces <= dimension01) {
                System.out.print("- ");
            }
            veces++;
            if (veces <= dimension01) {
                System.out.print("| ");
            }
            veces++;
        }
    }

    /**
     * SerieC06: Abecedario (a b c d e f g h ...).
     * Imprime una serie de letras del abecedario hasta la dimensión especificada.
     */
    public void QuispeSerieC06() {
        i = 97;
        j = dimension01 + i;
        System.out.print("\n\n- Serie C06. a b c d e f g h... (Abecedario):\n  ");

        while (i < j) {
            char caracter = (char) i;
            System.out.print("" + caracter + " ");
            i++;
        }
    }

    /**
     * SerieC07: AbcAlterno (a + c - e + g - ...).
     * Imprime una serie de letras del abecedario alternando con los signos (+, -)
     * hasta la dimensión especificada.
     */
    public void QuispeSerieC07() {
        i = 97;
        j = dimension01 + i;
        k = 100;
        System.out.print("\n\n- Serie C07. a + c - e + g -... (AbcAlterno):\n  ");

        while (i < j) {
            char caracter = (char) i;
            System.out.print("" + caracter + " ");
            i++;

            if (i < j) {
                if (i == k) {
                    System.out.print("- ");
                    k = k + 4;
                } else {
                    System.out.print("+ ");
                }
            }
            i++;
        }
    }

    /**
     * SerieC08: Abc pares (aa bbbb cccccc ddddddd ...).
     * Imprime una serie de letras del abecedario repetidas en forma de pirámide
     * hasta la dimensión especificada.
     */
    public void QuispeSerieC08() {
        k = 97;
        i = 97;
        l = 99;
        j = dimension01 + i;
        System.out.print("\n\n- Serie C08. aa bbbb cccccc ddddddd... (Abc pares):\n  ");

        while (i < j) {
            char caracter = (char) i;
            while (k < l) {
                System.out.print("" + caracter);
                k++;
            }
            l = l + 2;
            k = 97;
            i++;
            System.out.print(" ");
        }
    }

    /**
     * SerieC09: Abc impares (a bbb ccccc ddddddd ...).
     * Imprime una serie de letras del abecedario con el número de caracteres
     * incrementando en forma de pirámide hasta la dimensión especificada.
     */
    public void QuispeSerieC09() {
        k = 97;
        i = 97;
        l = 98;
        j = dimension01 + i;
        System.out.print("\n\n- Serie C09. a bbb ccccc ddddddd... (Abc impares):\n  ");

        while (i < j) {
            char caracter = (char) i;
            while (k < l) {
                System.out.print("" + caracter);
                k++;
            }
            l = l + 2;
            k = 97;
            i++;
            System.out.print(" ");
        }
    }

    /**
     * SerieC10: Abecedario fibonacci (a b cc ddd eeeee ...).
     * Imprime una serie de letras del abecedario donde el número de caracteres
     * sigue la secuencia de Fibonacci hasta la dimensión especificada.
     */
    public void QuispeSerieC10() {
        i = 97;
        l = 98;
        j = dimension01 + i;
        a = 0;
        b = 1;
        k = 0;
        System.out.print("\n\n- Serie C10. a b cc ddd eeeee... (Abecedario fibonacci):\n  ");

        while (i < j) {
            char caracter = (char) i;
            while (k < b) {
                k++;
                System.out.print(caracter);
            }
            k = 0;
            i = i + 2;
            a = a + b;
            b = a + b;
            System.out.print(" ");
            char lood = (char) l;
            if (i <= j) {
                while (k < a) {
                    k++;
                    System.out.print(lood);
                }
            }
            l = l + 2;
            k = 0;
            System.out.print(" ");
        }
        System.out.print(
                "\n................................................................................................\n");
    }
}
