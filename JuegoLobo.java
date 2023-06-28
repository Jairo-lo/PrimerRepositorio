import java.util.Scanner; // Autor: Jairo Quispe

public class JuegoLobo {
    public static void main(String[] args) {
        int go = 0;
        for (int a = 1; a <= 7; a++) {
            System.out.print(
                    "\n-----------------------------------------------------------\n\t0.Caperucita - 1.Lobo - 2.Uvitas - 3.Nadie\n-----------------------------------------------------------\n");
            Scanner scanner = new Scanner(System.in);
            int number;
            if (a % 2 != 0)
                System.out.print("\n\\_Obs_,_?_/ Con quién cruzarás al otro lado del río: ");
            if (a % 2 == 0)
                System.out.print("\n\\_Obs_,_?_/ Con quién debes regresar del otro lado: ");
            number = scanner.nextInt();
            String name = "";
            if (number == 0)
                name = "Caperucita";
            if (number == 1)
                name = "___Lobo___";
            if (number == 2)
                name = "__Uvitas__";
            if (number == 3)
                name = "__________";
            if (a % 2 != 0) {
                for (int m = 0; m < 40; m++) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    StringBuilder animation = new StringBuilder();
                    for (int i = 0; i < m; i++)
                        animation.append(" ");
                    animation.append("\\_Obs_,_" + name + "_/");
                    System.out.print("\r" + animation.toString());
                    try {
                        Thread.sleep(40);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                for (int m = 40; m >= 0; m--) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    StringBuilder animation = new StringBuilder();
                    for (int i = 0; i < m; i++)
                        animation.append(" ");
                    animation.append("\\_Obs_,_" + name + "_/");
                    System.out.print("\r" + animation.toString());
                    try {
                        Thread.sleep(40);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (number == go) {
                if (a == 7) {
                    System.out.print("\n\n      - No se debe llevar a nadie más. ¡Felicitaciones! -\n\n");
                }
            } else {
                if (number == 2)
                    System.out.print("\n\n\tSe comieron a Caperucita, perdiste.\n\n\t- Fin del juego -");
                if (number == 1)
                    System.out.print("\n\n\tSe comieron a las uvitas, perdiste.\n\n\t- Fin del juego -");
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
}