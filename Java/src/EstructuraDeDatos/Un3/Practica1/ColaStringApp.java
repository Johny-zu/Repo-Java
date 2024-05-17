package EstructuraDeDatos.Un3.Practica1;
import javax.swing.JOptionPane;
public class ColaStringApp
{
    public static void main(String[] args)
    {
        //Declaracion de variables
        String nombre = "";

        //Declaracion del menu
        String menu = "1.- Captura de una persona" +
                "\n2.- Mostrar fila de personas" +
                "\n3.- Eliminar una persona" +
                "\n4.- Persona en el frente" +
                "\n5.- Persona al final" +
                "\n6.- Buscar una persona" +
                "\n7.- Terminar";
        char op;

        //Declaracion de la cola
        ColaString colaNombres = new ColaString(8);

        //funcionamiento de menu
        do {
            op = JOptionPane.showInputDialog(menu).charAt(0);
            switch (op)
            {
                case '1' : if(! colaNombres.estaLlena()) {
                    nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre de la persona");
                    colaNombres.insertar(nombre);
                } else {
                    JOptionPane.showMessageDialog(null, "La fila esta llena");
                }
                    break;
                case '2' : if(! colaNombres.estaVacia()) {
                    colaNombres.toString();
                } else {
                    JOptionPane.showMessageDialog(null, "La fila esta vacia");
                }
                    break;
                case '3' : if(! colaNombres.estaVacia()) {
                    String borrado = colaNombres.eliminar();
                    JOptionPane.showMessageDialog(null, "El nombre de la persona que salio de la fila es \n" + borrado);
                } else {
                    JOptionPane.showMessageDialog(null, "La fila esta vacia");
                }
                    break;
                case '4' : if(! colaNombres.estaVacia()) {
                    JOptionPane.showMessageDialog(null, "La persona que esta al frente es\n" + colaNombres.datoEnFrente());
                } else {
                    JOptionPane.showMessageDialog(null, "La fila esta vacia");
                }
                    break;
                case '5' : if(! colaNombres.estaVacia()) {
                    JOptionPane.showMessageDialog(null, "La persona que esta al final es\n" + colaNombres.datoEnFin());
                } else {
                    JOptionPane.showMessageDialog(null, "La fila esta vacia");
                }
                    break;
                case '6' : if(! colaNombres.estaVacia()) {
                    nombre = JOptionPane.showInputDialog(null, "La persona");
                    JOptionPane.showMessageDialog(null, colaNombres.verificacion(nombre));
                } else {
                    JOptionPane.showMessageDialog(null, "La fila esta vacia");
                }
                    break;
                case '7' : JOptionPane.showMessageDialog(null, "Terminando...");
                    break;
                default : JOptionPane.showConfirmDialog(null, "Opcion Inexistente");
                    break;
            }
        }while(op != '7');
    }
}