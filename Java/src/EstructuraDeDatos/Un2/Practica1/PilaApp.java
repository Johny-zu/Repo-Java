package EstructuraDeDatos.Un2.Practica1;
import javax.swing.JOptionPane;
public class PilaApp
{
    public static void main(String[] args)
    {
        //Declaracion del menu
        String menu = "1.- Captura un numero entero" +
                "\n2.- Mostrar datos en pilas pares" +
                "\n3.- Mostrar datos en pilas nones" +
                "\n4.- Eliminar de pilas pares" +
                "\n5.- Salida";
        char op;

        //Declaracion de la pila
        Pila pares = new Pila(4);
        Pila nones = new Pila(4);
        //funcionamiento de menu
        do {
            op = JOptionPane.showInputDialog(menu).charAt(0);
            switch (op)
            {
                case '1' : int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor entero"));
                    if(valor%2 == 0)
                    {
                        if(! pares.isFull())
                        {
                            pares.push(valor);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila pares esta llena");
                        }
                    } else {
                        if(! nones.isFull())
                        {
                            nones.push(valor);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila nones esta lLena");
                        }
                    }
                    break;
                case '2' : JOptionPane.showMessageDialog(null, "Los pares son: \n" + pares.toString());
                    break;
                case '3' : JOptionPane.showMessageDialog(null, "Los nones son: \n" + nones.toString());
                    break;
                case '4' :  int borrado = pares.pop();
                    JOptionPane.showMessageDialog(null, pares.toString() + "\nEl dato eliminado fue: \n" + borrado);
                    break;
                case '5' : JOptionPane.showMessageDialog(null, "salir");
                    break;
                default : JOptionPane.showConfirmDialog(null, "Opcion Inexistente");
                    break;
            }
        }while(op != '5');
    }
}