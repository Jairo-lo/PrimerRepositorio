package POO.aritmetica;

import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {

        // Operadores matemáticos........................

        System.out.print("\n\t\t- Numeritos -\n");
        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, suma, resta, mult, div, resto;

        System.out.print("\nIngrese el primer numerito: ");
        numero1 = entrada.nextFloat();

        System.out.print("\nIngrese el segundo numerito: ");
        numero2 = entrada.nextFloat();

        // Suma - Resta -Multiplicación - División................
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.print("\nLa suma es: " + suma);
        System.out.print("\nLa resta es: " + resta);
        System.out.print("\nLa multiplicacion es: " + mult);
        System.out.print("\nLa division es: " + div);
        System.out.print("\nEl resto es: " + resto);

    }
}
