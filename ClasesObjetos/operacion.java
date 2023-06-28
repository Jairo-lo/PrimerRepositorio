package ClasesObjetos;

import javax.swing.JOptionPane;

public class operacion {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // Método para digitar dos números.
    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2: "));
    }

    public void sumar() {
        suma = numero1 + numero2;
    }

    public void restar() {
        resta = numero1 - numero2;
    }

    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }

    public void dividir() {
        division = numero1 / numero2;
    }

    public void Resultados() {
        System.out.println("\n- La suma es: " + suma);
        System.out.println("- La resta es: " + resta);
        System.out.println("- La multiplicacion es: " + multiplicacion);
        System.out.println("- La division es: " + division);
    }
}
/*
 * Scanner entrada = new Scanner(System.in);
 * numero1 = entrada.nextInt();
 * numero2 = entrada.nextInt();
 * /*
 */
//