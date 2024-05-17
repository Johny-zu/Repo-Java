package EstructuraDeDatos.Un3.Practica2;
import javax.swing.JOptionPane;
public class ColaCircularStringApp
{
    public static void main(String[] args)
    {
        //Declaracion de variables
        String nombre = "";

        //Declaracion del menu
        String menu = "1.- Agrega una cancion" +
                "\n2.- Mostrar fila de canciones" +
                "\n3.- Eliminar una cancion" +
                "\n4.- Cancion del inicio" +
                "\n5.- Cancion de final" +
                "\n6.- Buscar una cancion" +
                "\n7.- Terminar";
        char op;

        //Declaracion de arreglo
        ColaCircularString playlist = new ColaCircularString(5);

        //funcionamiento de menu
        do {
            op = JOptionPane.showInputDialog(menu).charAt(0);
            switch (op)
            {
                case '1' : if(! playlist.estaLlena()) {
                    nombre = JOptionPane.showInputDialog(null, "Inserta el nombre de una cancion");
                    playlist.insertar(nombre);
                } else {
                    JOptionPane.showMessageDialog(null, "La cola circular esta llena");
                }
                    break;
                case '2' : if(! playlist.estaVacia()) {
                    JOptionPane.showMessageDialog(null, "Las canciones son: \n" + playlist);
                } else {
                    JOptionPane.showMessageDialog(null, "La cola circular esta vacia");
                }
                    break;
                case '3' : if(! playlist.estaVacia()) {
                    String borrado = playlist.eliminar();
                    JOptionPane.showMessageDialog(null, "Se borro \n" + borrado);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay cancion para eliminar");
                }
                    break;
                case '4' : if(! playlist.estaVacia()) {
                    JOptionPane.showMessageDialog(null, "La cancion al inicio es\n" + playlist.elementoEnFrente());
                } else {
                    JOptionPane.showMessageDialog(null, "La cola circular esta vacia");
                }
                    break;
                case '5' : if(! playlist.estaVacia()) {
                    JOptionPane.showMessageDialog(null, "La cancion al final es\n" + playlist.elementoEnFin());
                } else {
                    JOptionPane.showMessageDialog(null, "La cola circular esta vacia");
                }
                    break;
                case '6' : if(! playlist.estaVacia()) {
                    int indice = playlist.busqueda(JOptionPane.showInputDialog(null, "Ingresa el nombre a buscar: "));
                    if (indice != -1) {
                        JOptionPane.showMessageDialog(null, "se encontro el nombre en la posicion: " + indice);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro la cancion");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La cola circular esta vacia");
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