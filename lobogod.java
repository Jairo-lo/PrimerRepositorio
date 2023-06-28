import java.util.Scanner;

public class lobogod {
    public static void main(String[] args) {
        int a = 0, go = 0;
        System.out.print(
                "-------------------------\n\t0. Caperucita.\n\t1. Lobo.\n\t2. Uvitas.\n\t3. Nadie.\n-------------------------\n");
        while (a < 10) {
            int number = solicitarNumero(a);
            a++;
            if (number == go) {
                System.out.print("\n\tLo has hecho bien, continuemos...\n");
                if (a == 7) {
                    System.out.print("\n\tNo se debe llevar a nadie más. ¡Ganaste, felicitaciones!");
                    a = 100;
                }
            } else {
                System.out.print("\n\tDevoraron a alguien, perdiste...\n\n\t- Fin del juego -");
                a = 100;
            }
            if (number == 0)
                go = 3;
            if (number == 3)
                go = 2;
            if (number == 2)
                go = 0;
            if (number == 0 && a == 4)
                go = 1;
            if (number == 1)
                go = 3;
            if (number == 3 && a == 6)
                go = 0;
        }
    }

    public static int solicitarNumero(int a) {
        Scanner scanner = new Scanner(System.in);
        int number;
        if (a % 2 == 0)
            System.out.print("\n\tA quien debe llevar el observador al otro lado del río: ");
        if (a % 2 != 0)
            System.out.print("\n\tCon quién debe volver del otro lado del río: ");
        do {
            number = scanner.nextInt();
            if (number == 0)
                System.out.print("\n\tEl observador se llevó a Caperucita...\n");
            if (number == 1)
                System.out.print("\n\tEl observador se llevó al lobo...\n");
            if (number == 2)
                System.out.print("\n\tEl observador se levó las uvitas.\n");
            if (number == 3)
                System.out.print("\n\tEl observador no se llevó a nadie...\n");
            if (number < 0 || number > 3)
                System.out.print("\n\t\"Número no válido. Inténtalo nuevamente.\"\n");
        } while (number < 0 || number > 3);
        return number;
    }
}