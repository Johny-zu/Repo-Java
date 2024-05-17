package EstructuraDeDatos.Un2.Practica2;
import javax.swing.JOptionPane;
public class PilaStringApp
{
    public static void main(String[] args)
    {
        //Declaracion de variables

        //Declaracion del menu
        String menu = "1.- Capturar el nombre de un amigo" +
                "\n2.- Mostrar pila de amigos" +
                "\n3.- Eliminar un amigo" +
                "\n4.- Amigo en el tope de la pila" +
                "\n5.- Salida";
        char op;

        //declaracion de la pila
        PilaString amigos = new PilaString(3);

        //funcionamiento de menu
        do {
            op = JOptionPane.showInputDialog(menu).charAt(0);
            switch (op)
            {
                case '1' : String ami = JOptionPane.showInputDialog(null, "Inserta el nombre de tu amigo");
                    if(! amigos.isFull())
                    {
                        amigos.push(ami);
                    } else {
                        JOptionPane.showMessageDialog(null, "La pila esta llena");
                    }
                    break;
                case '2' : JOptionPane.showMessageDialog(null, amigos.toString() + "El numero de amigos son: " + amigos.size());
                    break;
                case '3' : if(! amigos.isEmpty()) {
                    String borrado = amigos.pop();
                    JOptionPane.showMessageDialog(null, "El amigos eliminado fue: " + borrado);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay amigos en la pila");
                }
                    break;
                case '4' : JOptionPane.showMessageDialog(null, "El ultimo amigo puesto fue: " + amigos.getP()[amigos.getTope()]);
                    break;
                case '5' : JOptionPane.showMessageDialog(null, "salir");
                    break;
                default : JOptionPane.showConfirmDialog(null, "Opcion Inexistente");
                    break;
            }
        }while(op != '5');
    }
}



















