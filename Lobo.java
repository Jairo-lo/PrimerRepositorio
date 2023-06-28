import java.util.Scanner;

public class Lobo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\t\t\t-Juego, cruzar el rio- \n\n");
        System.out.println(
                "Un vigilante debe cruzar el rio en un bote, y debe llevar uno por uno a un lobo, caperucita y unas uvitas...\n\n");
        System.out.println("Evita que se queden dos personajes y el uno se coma al otro!\n\n");
        System.out.println("Para lobo seleccione: 1");
        System.out.println("Para Caperucita seleccione: 2");
        System.out.println("Para las uvitas seleccione: 3\n");
        System.out.println("Para nadie seleccione: 4\n");

        System.out.print("A quien debe llevar primero el vigilante?\nOpcion: ");
        int n = scanner.nextInt();
        System.out.println();

        if (n > 4 || n < 0) {
            System.out.println("Error, ingrese solo los comandos 1, 2, 3 y 4.\nFin del juego...");
        } else {
            if (n == 1) {
                System.out.println(
                        "El vigilante se lleva al lobo, pero Caperucita se quedo y se comio las uvitas...\n\n");
                System.out.println("\t\t\t\t\t     -Perdiste-");
            } else {
                if (n == 3) {
                    System.out.println(
                            "El vigilante se llevo las uvitas, pero el lobo se quedo y se comio a Caperucita...\n\n");
                    System.out.println("\t\t\t\t\t     -Perdiste-");
                } else {
                    if (n == 4) {
                        System.out.print("El vigilante deberá ir y regresar solo.");
                    } else {
                        System.out.println(
                                "El vigilante se llevo a Caperucita, asi que el lobo no se comera las uvitas...");
                        System.out.println("El vigilante dejo a Caperucita al otro lado, y luego regreso...\n\n");
                        System.out.print("A quien debe llevar ahora el vigilante?\nOpcion: ");
                    }
                    int f = scanner.nextInt();
                    System.out.println();

                    if (f == 3) {
                        System.out.println(
                                "El vigilante se llevo las uvitas, asi que al llegar Caperucita se las comera...\n\n");
                        System.out.println("\t\t\t\t\t     -Perdiste-");
                    } else {
                        if (f == 1) {
                            System.out.println("El vigilante se llevo al lobo, asi que nadie se comera las uvitas...");
                            System.out.println("El vigilante regresa y se lleva las uvitas...\n\n");
                            System.out.println("\t\t\t\t\t     -Ganaste!-");
                        } else {
                            System.out.println("Error, ingresa solo opcion 1 = lobo, u opcion 3 = uvitas");
                            System.out.println("Vuelve a intentarlo correctamente");
                        }
                    }
                }
            }
        }
    }
}
