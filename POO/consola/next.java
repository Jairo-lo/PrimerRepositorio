package POO.consola;

import java.util.Scanner;

public class next {
    public static void main(String[] args) {
        System.out.print("\n\t\t- Registro de caracteres -\n\n");

        // Primera palabra extraída de una frase ----------------------------
        System.out.print(">> Primera palabra.\n\n");
        System.out.print("Digite una frase: ");

        String palabra;
        Scanner text = new Scanner(System.in);
        palabra = text.next();
        System.out.print("\nLa primera palabra es: " + palabra);

        // Toda la frase ------------------------------
        System.out.print("\n\n>> Toda la frase.\n\n");
        System.out.print("Digite una frase: ");

        String frase;
        Scanner bob = new Scanner(System.in);
        frase = bob.nextLine();
        System.out.print("\nSu misma frase es: " + frase);

    }
}
