package prjQuispe_Jairo;
//import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * La clase SeriesFiguras es parte del paquete QuispeJairo_DeberPoliRetos.
 * Esta clase contiene métodos para leer la dimensión de las series de figuras.
 */
public class SeriesFiguras {
    int a, b, c, i, j, k, dimension02;

    /**
     * El método LectorF02 solicita al usuario que ingrese la dimensión para todas
     * las series de figuras.
     * La dimensión se lee desde una ventana de entrada emergente y se almacena en
     * la variable dimension02.
     */
    public void LectorF02() {
        int validar = -1; // Valor inicial inválido para entrar al bucle

        while (validar < 0 || validar > 15) {
            String dimension02 = JOptionPane.showInputDialog("Ingrese dimension para todas sus series con figuras...");

            try {
                validar = Integer.parseInt(dimension02);

                if (validar < 0 || validar > 15) {
                    JOptionPane.showMessageDialog(null, "Incorrecto. Debe ser número entre 0 y 15");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.");
            }
        }
        dimension02 = validar;
    }

    /**
     * QuispeSerieF01 genera una serie de figuras en forma de un cuadrado con
     * asteriscos.
     * La matriz de asteriscos se imprime en la salida estándar.
     */
    public void QuispeSerieF01() {
        System.out.print("\n- Serie F01. Cuadrado (*):\n");

        // Crear la matriz de asteriscos
        char[][] matriz = new char[dimension02][dimension02];

        // Llenar los bordes con asteriscos y el interior con espacios en blanco
        for (int i = 0; i < dimension02; i++) {
            for (int j = 0; j < dimension02; j++) {
                if (i == 0 || i == dimension02 - 1 || j == 0 || j == dimension02 - 1) {
                    matriz[i][j] = '*';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < dimension02; i++) {
            for (int j = 0; j < dimension02; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * QuispeSerieF02 genera una serie de figuras en forma de un cuadrado con
     * asteriscos (*) y cruces (+).
     * La matriz resultante se imprime en la salida estándar.
     */
    public void QuispeSerieF02() {
        System.out.print("\n- Serie F02. Cuadrado (*) y (+):\n");

        int k = 0;
        int c = 0;
        int a = 2;

        // Crear la matriz de asteriscos y cruces
        char[][] matriz = new char[dimension02][dimension02];

        for (int i = 0; i < dimension02; i++) {
            for (int j = 0; j < dimension02; j++) {
                if ((i + j) % 2 == 0) {
                    matriz[i][j] = '*';
                } else {
                    matriz[i][j] = '+';
                }
            }
        }

        for (int i = 0; i < dimension02; i++) {
            for (int j = 0; j < dimension02; j++) {
                // Imprimir la PRIMERA FILA
                if (i == 0) {
                    System.out.print(matriz[i][j] + "  ");
                }
                // Imprimir el BORDE IZQUIERDO
                k = i + 1;
                if (j == 0 && i != 0 && k != dimension02) {
                    System.out.print(matriz[i][j] + "  ");
                }
                // Imprimir el BORDE DERECHO
                c = j + 1;
                if (c == dimension02 && i != 0 && k != dimension02) {
                    while (a < dimension02) {
                        a++;
                        System.out.print("   ");
                    }
                    a = 2;
                    System.out.print(matriz[i][j]);
                }
                // Imprimir la ÚLTIMA FILA
                if (k == dimension02) {
                    System.out.print(matriz[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * El método QuispeSerieF03 imprime una serie de asteriscos en forma ascendente.
     * La serie se genera utilizando bucles while y se basa en el valor de la
     * variable dimension02.
     * Cada línea de la serie contiene una cantidad creciente de asteriscos,
     * comenzando desde 1 y aumentando en 1 en cada línea.
     */
    public void QuispeSerieF03() {
        i = 0;
        j = 1;
        System.out.print("\n- Serie F03. Ascenso n+1 (*):\n");

        while (j <= dimension02) {
            while (i < j) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            i = 0;
            j++;
        }
    }

    /**
     * El método QuispeSerieF04 imprime una serie de asteriscos en forma
     * descendente.
     * La serie se genera utilizando bucles while y se basa en el valor de la
     * variable dimension02.
     * Cada línea de la serie contiene una cantidad decreciente de asteriscos,
     * comenzando desde dimension02 y disminuyendo en 1 en cada línea.
     */
    public void QuispeSerieF04() {
        i = 0;
        j = dimension02;
        System.out.print("\n- Serie F04. Descenso n-1 (*):\n");

        while (j > 0) {
            while (i < j) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            i = 0;
            j--;
        }
    }

    /**
     * El método QuispeSerieF05 realiza una simulación que imprime una serie de
     * asteriscos en forma descendente.
     * La serie se genera utilizando bucles while y se basa en el valor de la
     * variable dimension02.
     * Cada línea de la serie contiene una cantidad decreciente de asteriscos y
     * espacios en blanco.
     * La serie sigue un patrón específico de asteriscos y espacios en blanco.
     */
    public void QuispeSerieF05() {
        j = 2;
        i = 2;
        a = 2;
        b = 2;
        k = dimension02;
        System.out.print("\n- Serie F05. Descenso n-2 (*):\n");
        k = k * 2;
        b = k;
        while (k >= a) {
            while (i <= b) {
                i++;
                System.out.print("* ");
            }
            System.out.print("\n");
            i = 2;
            b = b - 2;
            while (j <= a) {
                System.out.print("  ");
                j = j + 2;
            }
            j = 2;
            a = a + 2;
        }
    }

    /**
     * El método QuispeSerieF06 realiza una simulación que imprime una serie de
     * asteriscos en forma ascendente.
     * La serie se genera utilizando bucles while y se basa en el valor de la
     * variable dimension02.
     * Cada línea de la serie contiene una cantidad creciente de asteriscos y
     * espacios en blanco.
     * La serie sigue un patrón específico de asteriscos y espacios en blanco.
     */
    public void QuispeSerieF06() {
        i = 2;
        j = 2;
        a = 2;
        b = 2;
        k = dimension02;

        System.out.print("\n- Serie F06. Ascenso n+2 (*):\n");

        k = k * 2;
        b = k;

        while (k >= a) {
            while (j < b) {
                System.out.print("  ");
                j = j + 2;
            }
            j = 2;
            b = b - 2;

            while (i <= a) {
                i++;
                System.out.print("* ");
            }
            i = 2;
            a = a + 2;
            System.out.print("\n");
        }
    }

    /**
     * El método QuispeSerieF07 crea una escalera que se dirige hacia abajo.
     * Genera una serie de escalones que descienden en forma de escalera al
     * infierno, imprimiendo una representación visual en la consola.
     * El número de escalones y su tamaño está determinado por la variable
     * "dimension02".
     */
    public void QuispeSerieF07() {
        i = 1;
        j = 1;

        System.out.print("\n- Serie F07. Escalera al infierno:\n");

        while (dimension02 >= i) {
            System.out.print("___\n");
            while (i > j) {
                j++;
                System.out.print("    ");
            }
            j = 1;
            System.out.print("   |");
            i++;
        }
        System.out.print("\n");
    }

    // SerieF08..................
    /**
     * El método QuispeSerieF08 realiza una simulación que imprime una escalera al
     * cielo.
     * La escalera se genera utilizando bucles while y se basa en el valor de la
     * variable dimension02.
     * Cada escalón de la escalera se imprime utilizando caracteres especiales y
     * espacios en blanco.
     * La escalera sigue un patrón específico de caracteres y espacios en blanco.
     */
    public void QuispeSerieF08() {
        int i = 1;
        int j = 1;
        int a = 1;
        int b = 1;

        System.out.print("\n- Serie F08. Escalera al cielo:\n ");
        while (dimension02 >= i) {
            i++;
            b++;

            while (dimension02 > a) {
                a++;
                System.out.print("    ");
            }
            a = b;
            System.out.print(" ___\n");

            while (dimension02 > j) {
                j++;
                System.out.print("    ");
            }
            j = i;
            System.out.print(" |");
            System.out.print("\r");
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.print("\n");
    }

    // SerieF09..................
    /**
     * El método QuispeSerieF09 realiza una simulación que imprime una escalera
     * doble.
     * La escalera doble se genera utilizando bucles while y se basa en el valor de
     * la variable dimension02.
     * Cada escalón de las escaleras se imprime utilizando caracteres especiales y
     * espacios en blanco.
     * Las escaleras siguen un patrón específico de caracteres y espacios en blanco.
     */
    public void QuispeSerieF09() {
        int veces = 1;
        int mas = 1;
        int bruh = 1;
        int jota = 1;
        int vecesinf = 0;
        int masinf = 0;
        int total = 0;
        int totalinf = 1;

        System.out.print("\n- Serie F09. Escalera doble:\n ");

        vecesinf = dimension02;
        masinf = dimension02;

        while (dimension02 >= veces) {
            veces++;
            jota++;
            total = total + 2;
            totalinf = totalinf + 2;

            while (dimension02 > bruh) {
                bruh++;
                System.out.print("    ");
            }
            bruh = jota;
            System.out.print(" ___");

            while (dimension02 > vecesinf) {
                vecesinf++;
                System.out.print("    ");
            }
            vecesinf = vecesinf - total;
            System.out.print("___\n");

            while (dimension02 > mas) {
                mas++;
                System.out.print("    ");
            }
            mas = veces;
            System.out.print(" |");
            System.out.print(" ");

            while (dimension02 >= masinf) {
                masinf++;
                System.out.print("    ");
            }
            masinf = masinf - totalinf;
            System.out.print(" |\n");
            System.out.print(" ");
        }
    }

    // SerieF10..................
    /**
     * El método QuispeSerieF10 realiza una simulación que imprime escaleras con
     * patrones alternos.
     * Las escaleras se generan utilizando bucles while y se basan en el valor de la
     * variable dimension02.
     * Cada escalón de las escaleras tiene un patrón alternante de caracteres y
     * espacios en blanco.
     */
    public void QuispeSerieF10() {
        int i = 1;
        int j = 1;

        System.out.print("\n- Serie F10. Escaleras con alternos:\n");

        while (dimension02 >= i) {
            System.out.print("_+_\n");

            while (i > j) {
                j++;
                System.out.print("    ");
            }
            j = 1;
            System.out.print("   |");
            i++;

            if (dimension02 >= i) {
                System.out.print("_-_\n");
                while (i > j) {
                    j++;
                    System.out.print("    ");
                }
                j = 1;
                System.out.print("   |");
                i++;
            }
        }
        System.out.print("\n");
    }

    // SerieF11..................
    /**
     * El método QuispeSerieF11 realiza una simulación que imprime una escalera con
     * incremento variable hacia el infinito.
     * La escalera se genera utilizando bucles while y se basa en el valor de la
     * variable dimension02.
     * Cada escalón de la escalera tiene un incremento en la cantidad de caracteres
     * y espacios en blanco.
     */
    public void QuispeSerieF11() {
        int i = 0;
        int j = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.print("\n- Serie F11. Escalon + 1 al infierno:\n ");

        while (dimension02 >= i) {

            while (a < b) {
                a++;
                System.out.print("_");
            }
            System.out.print("\n");
            a = 0;
            b++;

            while (c < j) {
                c++;
                System.out.print(" ");
            }
            c = 0;
            if (b > i) {
                c = c - b;
            }
            i++;
            j = i + j;
            System.out.print("  |");

        }
        System.out.print("\n");
    }

    /**
     * El método QuispeSerieF12 realiza una simulación que imprime una serie
     * numérica en forma descendente.
     * La serie se genera utilizando bucles while y se basa en el valor de la
     * variable dimension02.
     * Cada número en la serie está separado por un espacio en blanco y sigue un
     * patrón específico de decremento.
     */
    public void QuispeSerieF12() {
        int j = 1;
        int i = 1;
        int k = dimension02;

        System.out.print("\n- Serie F12. Descenso n-1:\n");

        while (k >= j) {
            System.out.print(i + " ");
            if (j == k) {
                k--;
                j = 0;
                System.out.print("\n");
                i = 0;
            }
            j++;
            i++;
            if (k == 0) {
                k = 0;
                j = 1;
            }
        }
    }

    /**
     * El método QuispeSerieF13 realiza una simulación que imprime una serie
     * numérica en forma ascendente.
     * La serie se genera utilizando bucles while y se basa en el valor de la
     * variable dimension02.
     * Cada número en la serie está separado por un espacio en blanco y sigue un
     * patrón específico de incremento.
     */
    public void QuispeSerieF13() {
        int j = 1;
        int i = 1;
        int k = dimension02 + 1;

        System.out.print("\n- Serie F13. Ascenso n+1:\n");

        while (k >= j) {
            while (j >= i) {
                System.out.print(+i + " ");
                i++;
            }
            i = 1;
            j++;
            if (k == j) {
                k = 0;
                j = 1;
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    // SerieF14..................
    /**
     * El método QuispeSerieF14 genera una simulación de la Pirámide de no Pascal
     * (1) y (1).
     * La pirámide se imprime utilizando una matriz bidimensional de tamaño
     * dimension02.
     * Cada número en la pirámide se calcula siguiendo las reglas del triángulo de
     * Pascal.
     * Se utiliza un bucle for para llenar la matriz con los valores
     * correspondientes.
     * Luego se imprime la matriz generada.
     */
    public void QuispeSerieF14() {
        int a = 0;
        int b = dimension02;

        System.out.print("\n- Serie F14. Pirámide de no Pascal (1) y (1):\n");

        int[][] matrix = new int[dimension02][dimension02];

        for (int i = 0; i < dimension02; i++) {
            matrix[i][0] = 1; // Primer elemento de cada fila es 1
            matrix[i][i] = 1; // Último elemento de cada fila es 1

            for (int j = 1; j < i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j]; // Suma de los dos números superiores
            }
        }

        // Imprimir la matriz generada
        for (int i = 0; i < dimension02; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    while (a < b) {
                        System.out.print(" ");
                        a++;
                    }
                    b--;
                    a = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // SerieF15..................
    /**
     * El método QuispeSerieF15 genera una simulación del Triángulo de Pascal (1) y
     * (1).
     * El triángulo se imprime utilizando una matriz bidimensional de tamaño
     * dimension02.
     * Cada número en el triángulo se calcula siguiendo las reglas del triángulo de
     * Pascal.
     * Se utiliza un bucle for para llenar la matriz con los valores
     * correspondientes.
     * Luego se imprime la matriz generada.
     */
    public void QuispeSerieF15() {
        System.out.print("\n- Serie F15. Triángulo de Pascal (1) y (1):\n");

        int[][] matrix = new int[dimension02][dimension02];

        for (int i = 0; i < dimension02; i++) {
            matrix[i][0] = 1; // Primer elemento de cada fila es 1
            matrix[i][i] = 1; // Último elemento de cada fila es 1

            for (int j = 1; j < i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j]; // Suma de los dos números superiores
            }
        }

        // Imprimir la matriz generada
        for (int i = 0; i < dimension02; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // SerieF16..................
    /**
     * El método QuispeSerieF16 genera una simulación de una X con (+) y (-).
     * La X se imprime utilizando una matriz bidimensional de tamaño dimension02.
     * Se utiliza un bucle for para llenar la matriz con los caracteres
     * correspondientes.
     * Si la posición (i, j) coincide con la diagonal principal o la diagonal
     * secundaria de la matriz,
     * se asigna el carácter '+' si i es par y '-' si i es impar. En otras
     * posiciones, se asigna el carácter espacio.
     * Luego se imprime la matriz generada.
     */
    public void QuispeSerieF16() {
        System.out.print("\n- Serie F16. Una X con (+) y (-):\n");

        char[][] matriz = new char[dimension02][dimension02];

        for (int i = 0; i < dimension02; i++) {
            for (int j = 0; j < dimension02; j++) {
                if (i == j || i == (dimension02 - 1 - j)) {
                    matriz[i][j] = (i % 2 == 0) ? '+' : '-';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        // Imprimir la matriz en forma de X
        for (int i = 0; i < dimension02; i++) {
            for (int j = 0; j < dimension02; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // SerieF17..................
    /**
     * El método QuispeSerieF17 genera una simulación de una X con ('1') y ('0').
     * La X se imprime utilizando una matriz bidimensional de tamaño dimension02.
     * Se utiliza un bucle for para llenar la matriz con los caracteres
     * correspondientes.
     * Si la posición (i, j) coincide con la diagonal principal o la diagonal
     * secundaria de la matriz,
     * se asigna el carácter '1' si i es par y '0' si i es impar. En otras
     * posiciones, se asigna el carácter espacio.
     * Luego se imprime la matriz generada.
     */
    public void QuispeSerieF17() {
        System.out.print("\n- Serie F17. Una X con (+) y (-):\n");

        char[][] matriz = new char[dimension02][dimension02];

        for (int i = 0; i < dimension02; i++) {
            for (int j = 0; j < dimension02; j++) {
                if (i == j || i == (dimension02 - 1 - j)) {
                    matriz[i][j] = (i % 2 == 0) ? '1' : '0';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }

        // Imprimir la matriz en forma de X
        for (int i = 0; i < dimension02; i++) {
            for (int j = 0; j < dimension02; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // SerieF18..................
    /**
     * El método QuispeSerieF18 genera un Triángulo de Pascal utilizando los números
     * 1 y 2.
     * El triángulo se imprime utilizando una matriz bidimensional de tamaño
     * dimension02.
     * Se utiliza un bucle for para llenar la matriz con los números
     * correspondientes.
     * El primer elemento de cada fila se establece como 1, y el último elemento de
     * cada fila se establece como 2.
     * Luego, se calcula el valor de los números en las posiciones intermedias
     * utilizando la suma de los dos números superiores.
     * Finalmente, se imprime la matriz generada en forma de triángulo.
     */
    public void QuispeSerieF18() {
        System.out.print("\n- Serie F18. Triángulo de Pascal (1) y (2):\n");

        int[][] matrix = new int[dimension02][dimension02];

        for (int i = 0; i < dimension02; i++) {
            matrix[i][0] = 1; // Primer elemento de cada fila es 1
            matrix[i][i] = 2; // Último elemento de cada fila es 2

            for (int j = 1; j < i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j]; // Suma de los dos números superiores
            }
        }

        // Imprimir la matriz generada
        for (int i = 0; i < dimension02; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // SerieF19..................
    /**
     * El método QuispeSerieF19 genera un Triángulo de Pascal utilizando los
     * caracteres '+' y '*'.
     * El triángulo se imprime utilizando una matriz bidimensional de tamaño
     * dimension02.
     * Se utiliza un bucle for para llenar la matriz con los números
     * correspondientes.
     * El primer elemento de cada fila se establece como '+', el último elemento de
     * cada fila se establece como '*',
     * y los valores intermedios se calculan utilizando la suma de los dos números
     * superiores.
     * Luego, se imprime la matriz generada en forma de triángulo, reemplazando los
     * valores especiales de '+' y '*'.
     */
    public void QuispeSerieF19() {
        System.out.print("\n- Serie F19. Triángulo de Pascal (+) y (*):\n");

        int[][] matrix = new int[dimension02][dimension02];

        for (int i = 0; i < dimension02; i++) {
            matrix[i][0] = 1; // Primer elemento de cada fila es 1
            matrix[i][i] = 2; // Último elemento de cada fila es 2

            for (int j = 1; j < i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j]; // Suma de los dos números superiores
            }
        }

        // Imprimir la matriz generada
        for (int i = 0; i < dimension02; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 && j != i) {
                    System.out.print("+ ");
                }

                if (matrix[i][j] != 2 && matrix[i][j] != 1) {
                    System.out.print(matrix[i][j] + " ");
                }

                if (i == j) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.print(
                "................................................................................................\n");
    }

}
