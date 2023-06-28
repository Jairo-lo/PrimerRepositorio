package POO.consola;

import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {

        System.out.print("\t\t-Ingreso de numeros enteros-\n\n");

        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.print("Digite numero 1: ");
        numero1 = entrada.nextInt();
        System.out.print("Digite numero 2: ");
        numero2 = entrada.nextInt();
        System.out.print("Digite numero 3: ");
        numero3 = entrada.nextInt();

        System.out.print("\nEl numero es: " + numero1);
        System.out.print("\nEl numero es: " + numero2);
        System.out.print("\nEl numero es: " + numero3);

        System.out.print("\n\n\t\t-Ingreso de cadenas-\n\n");
        String cadena;
        char letra;

        System.out.print("Digite una cadena: ");

        Scanner text = new Scanner(System.in);
        cadena = text.nextLine();

        System.out.print("\nLa cadena es: " + cadena);

        System.out.print("\n\t\t-Registro de una sola letra-\n");

        System.out.print("\nIngrese una palabra: ");
        letra = text.next().charAt(0);
        System.out.print("\nLa primera letra es: " + letra);

        System.out.print("\n\t\t-Registro del quinto caracter-\n");

        System.out.print("\nIngrese una nueva palabra: ");
        letra = text.next().charAt(4);
        System.out.print("\nLa quinta letra es: " + letra);
    }
}
