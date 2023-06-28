package prjQuispe_Jairo;

import java.util.Scanner;

public class SeriesString {
    private static final String ANSWER = "mora";

    /**
     * El método QuispeSerieS01 solicita al usuario que ingrese una frase y cuenta
     * el número de vocales en ella.
     * Luego imprime el resultado.
     */
    public void QuispeSerieS01() {
        String nombreUsuario;
        nombreUsuario = pedirDatoss();
        System.out.print("\n El número de vocales en su frase es: " + contandoVocales(nombreUsuario));
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println();
    }

    /**
     * El método pedirDatoss solicita al usuario que ingrese una frase y la devuelve
     * como una cadena de texto.
     * 
     * @return la frase ingresada por el usuario.
     */
    public static String pedirDatoss() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Serie S01. Digite frase alfanumérica (contador vocales):\n ");
        return scanner.nextLine();
    }

    /**
     * El método contandoVocales cuenta el número de vocales en una frase.
     * 
     * @param nombre la frase en la que se contarán las vocales.
     * @return el número de vocales en la frase.
     */
    public static int contandoVocales(String nombre) {
        int cont = 0;
        for (char c : nombre.toCharArray()) {
            switch (Character.toLowerCase(c)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cont++;
            }
        }
        return cont;
    }

    /**
     * El método QuispeSerieS02 solicita al usuario que ingrese una frase y cuenta
     * el número de consonantes en ella.
     * Luego imprime el resultado.
     */
    public void QuispeSerieS02() {
        String nombreUsuario;
        nombreUsuario = pedirDatos();
        System.out.print("\n El número de consonantes en su frase es: " + contandoConsonantes(nombreUsuario));
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    /**
     * El método pedirDatos solicita al usuario que ingrese una frase y la devuelve
     * como una cadena de texto.
     * 
     * @return la frase ingresada por el usuario.
     */
    public static String pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("- Serie S02. Digite frase alfanumérica (contador consonantes):\n ");
        return scanner.nextLine();
    }

    /**
     * El método contandoConsonantes cuenta el número de consonantes en una frase.
     * 
     * @param nombre la frase en la que se contarán las consonantes.
     * @return el número de consonantes en la frase.
     */
    public static int contandoConsonantes(String nombre) {
        int cont = 0;
        for (char c : nombre.toCharArray()) {
            if (Character.isLetter(c) && !isVowel(c)) {
                cont++;
            }
        }
        return cont;
    }

    /**
     * El método isVowel verifica si un carácter es una vocal.
     * 
     * @param c el carácter a verificar.
     * @return true si el carácter es una vocal, false de lo contrario.
     */
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    /**
     * El método QuispeSerieS03 solicita al usuario que ingrese una frase y un
     * carácter vocal.
     * Luego elimina todas las ocurrencias del carácter vocal en la frase y muestra
     * el resultado.
     */
    public void QuispeSerieS03() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Serie S03. Ingrese frase alfanumérica para modificarla (desaparece vocal):\n ");
        String word = scanner.nextLine();
        System.out.print("\n Ingrese una vocal para borrarla de su ingreso previo:\n ");
        char vocal = scanner.next().charAt(0);
        System.out.print("\n La frase o palabra que ingresaste aparecerá sin la vocal \"" + vocal + "\":\n ");
        String modifiedWord = removeVocal(word, vocal);
        System.out.println(modifiedWord);
    }

    /**
     * El método removeVocal elimina todas las ocurrencias de un carácter vocal en
     * una frase.
     * 
     * @param word  la frase en la que se eliminarán las vocales.
     * @param vocal el carácter vocal a eliminar.
     * @return la frase modificada sin las ocurrencias del carácter vocal.
     */
    public static String removeVocal(String word, char vocal) {
        StringBuilder modifiedWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(vocal)) {
                modifiedWord.append(' ');
            } else {
                modifiedWord.append(word.charAt(i));
            }
        }
        return modifiedWord.toString();
    }

    /**
     * El método QuispeSerieS04 solicita al usuario que ingrese una frase y un
     * carácter.
     * Luego elimina todas las ocurrencias del carácter en la frase y muestra el
     * resultado.
     */
    public void QuispeSerieS04() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Serie S04. Ingrese frase alfanumérica para modificarla (desaparece caracter):\n ");
        String word = scanner.nextLine();
        System.out.print("\n Ingrese un caracter para borrarlo de su ingreso previo:\n ");
        char bruh = scanner.next().charAt(0);
        System.out.print("\n La frase o palabra que ingresaste aparecerá sin el caracter \"" + bruh + "\":\n ");
        String modifiedWord = removeLetra(word, bruh);
        System.out.println(modifiedWord);
    }

    /**
     * El método removeLetra elimina todas las ocurrencias de un carácter en una
     * frase.
     * 
     * @param word la frase en la que se eliminarán los caracteres.
     * @param bruh el carácter a eliminar.
     * @return la frase modificada sin las ocurrencias del carácter.
     */
    public static String removeLetra(String word, char bruh) {
        StringBuilder modifiedWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(bruh)) {
                modifiedWord.append(' ');
            } else {
                modifiedWord.append(word.charAt(i));
            }
        }
        return modifiedWord.toString();
    }

    /**
     * El método QuispeSerieS05 solicita al usuario que ingrese una frase y la
     * invierte.
     * Luego modifica la frase invirtiendo las vocales en mayúsculas y muestra el
     * resultado.
     */
    public void QuispeSerieS05() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Serie S05. Ingrese una frase alfanumérica (vocales minuscu. a mayuscu.):\n ");
        String frase = scanner.nextLine();
        System.out.print("\n Su frase sera invertida y modificada con las vocales en mayusculas:\n ");
        frase = invertirYModificar(frase);
        System.out.println(frase);
    }

    /**
     * El método invertirYModificar invierte una frase y modifica las vocales en
     * mayúsculas.
     * 
     * @param frase la frase a invertir y modificar.
     * @return la frase invertida con las vocales en mayúsculas.
     */
    public static String invertirYModificar(String frase) {
        StringBuilder builder = new StringBuilder(frase);
        builder.reverse();
        for (int i = 0; i < builder.length(); i++) {
            char c = builder.charAt(i);
            if (c == 'a') {
                builder.setCharAt(i, 'A');
            } else if (c == 'e') {
                builder.setCharAt(i, 'E');
            } else if (c == 'i') {
                builder.setCharAt(i, 'I');
            } else if (c == 'o') {
                builder.setCharAt(i, 'O');
            } else if (c == 'u') {
                builder.setCharAt(i, 'U');
            }
        }
        return builder.toString();
    }

    /**
     * El método QuispeSerieS06 solicita al usuario que ingrese una frase y la
     * invierte.
     * Luego modifica la frase convirtiendo las consonantes en mayúsculas y muestra
     * el resultado.
     */
    public void QuispeSerieS06() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Serie S06. Ingrese una frase alfanumérica (consonantes minuscu. a mayuscu.):\n ");
        String frase = scanner.nextLine();
        System.out.print("\n Su frase sera invertida y modificada con las consonantes en mayusculas:\n ");
        frase = invertir(frase);
        System.out.println(frase);
    }

    /**
     * El método invertir invierte una frase y modifica las consonantes en
     * mayúsculas.
     * 
     * @param frase la frase a invertir y modificar.
     * @return la frase invertida con las consonantes en mayúsculas.
     */
    public static String invertir(String frase) {
        StringBuilder builder = new StringBuilder(frase);
        builder.reverse();
        for (int i = 0; i < builder.length(); i++) {
            char c = builder.charAt(i);
            if (esConsonante(c)) {
                builder.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return builder.toString();
    }

    /**
     * El método esConsonante verifica si un carácter es una consonante.
     * 
     * @param c el carácter a verificar.
     * @return true si el carácter es una consonante, false de lo contrario.
     */
    public static boolean esConsonante(char c) {
        c = Character.toLowerCase(c);
        return c >= 'b' && c <= 'z' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }

    /**
     * El método QuispeSerieS07 solicita al usuario que ingrese una frase y elimina
     * todas las ocurrencias de 'j' o 'J'.
     * Luego convierte la frase a mayúsculas y muestra el resultado.
     */
    public void QuispeSerieS07() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Serie S07, Ingrese una frase alfanumérica con 'j' o 'J' para borrarla:\n ");
        String frase = scanner.nextLine();
        System.out.print("\n Su frase aparecerá en mayúsculas y sin la letra previa:\n ");
        frase = modificarFrase(frase);
        System.out.println(frase);
    }

    /**
     * El método modificarFrase elimina todas las ocurrencias de 'j' o 'J' en una
     * frase y la convierte a mayúsculas.
     * 
     * @param frase la frase a modificar.
     * @return la frase modificada sin las ocurrencias de 'j' o 'J' y en mayúsculas.
     */
    public static String modificarFrase(String frase) {
        StringBuilder builder = new StringBuilder(frase.toUpperCase());
        for (int i = 0; i < builder.length(); i++) {
            char c = builder.charAt(i);
            if (c == 'J') {
                builder.setCharAt(i, ' ');
            }
        }
        return builder.toString();
    }

    /**
     * El método QuispeSerieS08 implementa un juego de anagrama en el que el usuario
     * debe adivinar la palabra correcta.
     * El usuario tiene un máximo de 3 intentos para adivinar y se le proporciona un
     * conjunto de palabras anagrama.
     */
    public void QuispeSerieS08() {
        Scanner scanner = new Scanner(System.in);
        String word;
        int contador = 1;
        boolean ingresa = false;
        System.out.print("\n- Serie S08, Anagrama de palabras...\n");
        do {
            System.out.print(" Anagrama: amor - mora - roma - ramo.-\n");
            System.out.print(" Escriba una de las 4 palabras hasta dar con la correcta.\n");
            System.out.print(" Tienes 3 intentos totales, let's go!\n ");
            word = scanner.nextLine();
            if (word.equals(ANSWER)) {
                ingresa = true;
                System.out.print("________________________________________________________\n");
            } else {
                System.out.print("________________________________________________________\n");
                System.out.println("\n La palabra \"" + word + "\" es incorrecta, elige otra del anagrama.\n");
                System.out.println("\n Vas \"" + contador + "\" intentos.");
                contador++;
            }
        } while (!ingresa && contador <= 3);
        if (!ingresa) {
            System.out.println("\n La respuesta era \"mora\", se acabaron tus intentos. ¡Perdiste!");
        } else {
            System.out.print("\n Su respuesta es correcta, \"mora\" era la palabra. ¡Ganaste! :)");
        }
        scanner.nextLine();
    }

    /**
     * El método QuispeSerieS09 solicita al usuario que ingrese una frase y alterna
     * las letras entre mayúsculas y minúsculas.
     * Luego muestra la frase alternada.
     */
    public void QuispeSerieS09() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n- Serie S09. Ingrese una frase alfanumérica (alterna mayus. y minus.):\n ");
        String frase = scanner.nextLine();
        StringBuilder fraseAlternada = new StringBuilder();
        boolean mayuscula = true;
        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                if (mayuscula) {
                    fraseAlternada.append(Character.toUpperCase(c));
                } else {
                    fraseAlternada.append(Character.toLowerCase(c));
                }
                mayuscula = !mayuscula;
            } else {
                fraseAlternada.append(c);
            }
        }
        System.out.print("\n Frase alternada:\n " + fraseAlternada.toString());
        System.out.print(
                "\n................................................................................................\n");
    }
}