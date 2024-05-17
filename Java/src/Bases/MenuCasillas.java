package Bases;
import javax.swing.JOptionPane;
public class MenuCasillas {
    public static void main(String[] args) {
        String menu = "1.- Solo texto" +
                "\n2.- Suma" +
                "\n3.- Resta" +
                "\n4.- Multiplicacion" +
                "\n5.- Division" +
                "\n6.- Salida";
        String texto = "";
        int a = 0, b = 0, c = 0;
        char opcion = 0;

        do {
            opcion = JOptionPane.showInputDialog(null, menu).charAt(0);
            switch (opcion) {
                case '1':
                    texto = JOptionPane.showInputDialog(null, "Ingresa un texto");
                    JOptionPane.showMessageDialog(null, texto);
                    break;
                case '2':
                    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer valor: "));
                    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo valor: "));
                    c = a + b;
                    JOptionPane.showMessageDialog(null, "La suma de " + a + " y " + b + " es: " + c);
                    break;
                case '3':
                    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer valor: "));
                    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo valor: "));
                    c = a - b;
                    JOptionPane.showMessageDialog(null, "La resta de " + a + " y " + b + " es: " + c);
                    break;
                case '4':
                    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer valor: "));
                    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo valor: "));
                    c = a * b;
                    JOptionPane.showMessageDialog(null, "La multiplicacion de " + a + " y " + b + " es: " + c);
                    break;
                case '5':
                    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer valor: "));
                    b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo valor: "));
                    double d = a / (double) b;
                    JOptionPane.showMessageDialog(null, "La division de " + a + " y " + b + " es: " + d);
                    break;
                case '6':
                    JOptionPane.showMessageDialog(null, "Saliendo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresa una opcion valida");
                    break;
            }
        } while (opcion != '6');
    }
}
