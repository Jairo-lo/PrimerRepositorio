package prjQuispe_Jairo;

import java.util.Scanner;

import javax.swing.JOptionPane;

import pkUtility.Utility;

public class MainEjecutar {

    /**
     * Punto de entrada para ejecutar el programa.
     * 
     * Se encarga de mostrar información personal, inicializar las series numéricas,
     * de caracteres, de figuras, de cadenas y las series con delay. Luego, se
     * solicita al usuario ingresar valores mediante TextBox (Caja de text5
     * 5o) o
     * escáner.
     * 
     * @param args Los argumentos de línea de comandos (no se utilizan).
     */

    public static void main(String[] args) {

        // Mostrar información personal
        System.out.print("\n  - Nombre: Jairo Quispe.\n");
        System.out.print("\n  - Cedula: 1751405570.\n");
        System.out.print("\n  - Plus: Numéricas, caracteres y figuras tienen un \"n\" general para sus series...\n");
        System.out
                .print("\n  - Recomendacion: Dar enter en series string y extras para continuar si hiciese falta...\n");
        System.out.print(
                "\n................................................................................................\n");

        // Inicializar objetos de las series
        SeriesNumericas num = new SeriesNumericas();
        SeriesCaracteres car = new SeriesCaracteres();
        SeriesFiguras fig = new SeriesFiguras();
        SeriesString str = new SeriesString();
        SeriesDelay del = new SeriesDelay();

        Scanner scanner = new Scanner(System.in);

        // Ejecutar las series numéricas
        num.LectorDatos();
        num.QuispeSerie01();
        num.QuispeSerie02();
        num.QuispeSerie03();
        num.QuispeSerie04();
        num.QuispeSerie05();
        num.QuispeSerie06();
        num.QuispeSerie07();
        num.QuispeSerie08();
        num.QuispeSerie09();
        num.QuispeSerie10();
        num.QuispeSerie12();

        // Ejecutar las series de caracteres
        car.LectorDatosC01();
        car.QuispeSerieC01();
        car.QuispeSerieC02();
        car.QuispeSerieC03();
        car.QuispeSerieC04();
        car.QuispeSerieC05();
        car.QuispeSerieC06();
        car.QuispeSerieC07();
        car.QuispeSerieC08();
        car.QuispeSerieC09();
        car.QuispeSerieC10();

        // Ejecutar las series de figuras
        fig.LectorF02();
        fig.QuispeSerieF01();
        fig.QuispeSerieF02();
        fig.QuispeSerieF03();
        fig.QuispeSerieF04();
        fig.QuispeSerieF05();
        fig.QuispeSerieF06();
        fig.QuispeSerieF07();
        fig.QuispeSerieF08();
        fig.QuispeSerieF09();
        fig.QuispeSerieF10();
        fig.QuispeSerieF11();
        fig.QuispeSerieF12();
        fig.QuispeSerieF13();
        fig.QuispeSerieF14();
        fig.QuispeSerieF15();
        fig.QuispeSerieF16();
        fig.QuispeSerieF17();
        fig.QuispeSerieF18();
        fig.QuispeSerieF19();

        // Ejecutar las series de cadenas
        str.QuispeSerieS01();
        str.QuispeSerieS02();
        str.QuispeSerieS03();
        str.QuispeSerieS04();
        str.QuispeSerieS05();
        str.QuispeSerieS06();
        str.QuispeSerieS07();
        str.QuispeSerieS08();
        str.QuispeSerieS09();

        int validar01 = -1, validar02 = -1;

        // Solicitar valores al usuario para ejecutar las animaciones
        // System.out.print("\n Ingrese un valor del 1 al 50 para animación:\n ");
        // int space1 = scanner.nextInt();
        scanner.nextLine();
        // del.QuispeSerieD01(space1);

        /**
         * System.out.print(" Ingrese un valor del 1 al 50 para animación:\n ");
         * int space2 = scanner.nextInt();
         * scanner.nextLine();
         * del.QuispeSerieD02(space2);
         */

        while (validar01 < 0 || validar01 > 50) {
            System.out.print("\n  Ingresa un número del 0 al 50:\n  ");
            String input = scanner.nextLine();

            try {
                validar01 = Integer.parseInt(input);

                if (validar01 < 0 || validar01 > 50) {
                    System.out.print("\n  Número inválido. Debe estar entre 0 y 50.\n  ");
                }
            } catch (NumberFormatException e) {
                System.out.print("\n  Error. Ingresa un número válido:\n  ");
            }
        }
        del.QuispeSerieD01(validar01);

        while (validar02 < 0 || validar02 > 50) {
            System.out.print("\n  Ingresa un número del 0 al 50:\n  ");
            String input = scanner.nextLine();

            try {
                validar02 = Integer.parseInt(input);

                if (validar02 < 0 || validar02 > 50) {
                    System.out.print("\n  Número inválido. Debe estar entre 0 y 50.\n  ");
                }
            } catch (NumberFormatException e) {
                System.out.print("\n  Error. Ingresa un número válido:\n  ");
            }
        }
        del.QuispeSerieD02(validar02);

        scanner.nextLine();
        // Ejecutar las series de retardo
        del.QuispeSerieD03();
        del.QuispeSerieD04();
        del.QuispeSerieD05();

        scanner.close();

    }
}
