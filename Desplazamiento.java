import javax.swing.JOptionPane;

public class Desplazamiento {
    public static void main(String[] args) {
        int validar = -1; // Valor inicial inválido para entrar al bucle

        while (validar < 0 || validar > 15) {
            String dimension = JOptionPane.showInputDialog("Ingrese dimension para todas sus series numericas...");

            try {
                validar = Integer.parseInt(dimension);

                if (validar < 0 || validar > 15) {
                    JOptionPane.showMessageDialog(null, "Número inválido. Debe estar entre 0 y 15.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.");
            }
        }
    }
}
