package prjQuispe_Jairo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SeriesDelay {

    /**
     * Muestra una animación de la letra "o" moviéndose a la derecha en la consola.
     *
     * @param space El número de espacios antes de que la letra "o" comience a
     *              moverse.
     */
    public void QuispeSerieD01(int space) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("- Serie D01. Animacion de la letra \"o\" moviendose a la derecha:");
        System.out.println("----------------------------------------------------------------");

        for (int m = 0; m < space; m++) {
            for (int i = 0; i < m; i++) {
                System.out.print(" ");
            }
            System.out.print("o");
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
            for (int i = 0; i <= m; i++) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    /**
     * Muestra una animación de la letra "o" moviéndose a la izquierda en la
     * consola.
     *
     * @param space El número de espacios antes de que la letra "o" comience a
     *              moverse.
     */
    public void QuispeSerieD02(int space) {
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("- Serie D02. Animacion de la letra \"o\" moviendose a izquierda:");
        System.out.println("---------------------------------------------------------------");

        for (int m = space - 1; m >= 0; m--) {
            for (int i = 0; i < m; i++) {
                System.out.print(" ");
            }
            System.out.print("o ");
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
        }
        System.out.println();
    }

    /**
     * Muestra una animación con caracteres especiales y porcentajes hasta el 100%
     * en la consola.
     */
    public void QuispeSerieD03() {
        String signos = "\\|/-|";

        System.out.println("---------------------------------------------------------------");
        System.out.println("- Serie D03. Animacion con \\|/-| y porcentajes hasta el 100%:");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 1)
                System.out.print("\r" + signos.charAt(0) + " " + i + "%");
            else if (i % 5 == 2)
                System.out.print("\r" + signos.charAt(1) + " " + i + "%");
            else if (i % 5 == 3)
                System.out.print("\r" + signos.charAt(2) + " " + i + "%");
            else if (i % 5 == 4)
                System.out.print("\r" + signos.charAt(3) + " " + i + "%");
            else if (i % 5 == 0)
                System.out.print("\r" + signos.charAt(4) + " " + i + "%");

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Muestra una animación con un nombre ingresado por el usuario y porcentajes
     * hasta el 100% en la consola.
     */
    public void QuispeSerieD04() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nDigite un nombre: ");
        String nombre = scanner.nextLine();
        int a = nombre.length();
        double b = a > 1 ? ((100.00 / (a - 1)) + 0.01) : 100.00;

        System.out.println("------------------------------------------------------------------------");
        System.out.println("- Serie D04. Animacion de frase alfanumérica y porcentaje hasta el 100%:");
        System.out.println("------------------------------------------------------------------------");
        scanner.nextLine();

        for (int i = 0; i < a; i++) {
            for (int f = 0; f <= i; f++) {
                System.out.print(nombre.charAt(f));
            }
            for (int j = 0; j < (a + 5) - i; j++) {
                System.out.print(" ");
            }
            System.out.print((int) (i * b) + "%\r");
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        scanner.close();
    }

    /**
     * Muestra una animación final con un personaje hasta que desaparezca en la
     * consola.
     */
    public void QuispeSerieD05() {
        int m = 0;

        System.out.println("\n---------------------------------------------------------------");
        System.out.println("- Serie D05. Animacion final con personaje hasta desaparecer...");
        System.out.println("---------------------------------------------------------------");

        do {
            m++;
            System.out.print(getSpaces(m) + "   \\|||/\n");
            System.out.print(getSpaces(m) + "   (> <)\n");
            System.out.print(getSpaces(m) + "ooO-(_)-Ooo\n");
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clearScreen();
        } while (m != 100);
    }

    /**
     * Genera una cadena que contiene la cantidad especificada de espacios en
     * blanco.
     *
     * @param count El número de espacios en blanco a generar.
     * @return Una cadena con la cantidad especificada de espacios en blanco.
     */
    public String getSpaces(int count) {
        StringBuilder spaces = new StringBuilder();
        for (int i = 0; i < count; i++) {
            spaces.append(" ");
        }
        return spaces.toString();
    }

    /**
     * Borra la pantalla de la consola.
     */
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
