package EstructuraDeDatos.Un4.Practica3;
import javax.swing.JOptionPane;
public class CancionApp
{
    public static void main(String[] args)
    {
        //Declaracion de variables
        String titulo;
        int interprete;
        float duracion;

        //Declaracion del menu
        String menu = "1.-  Agregar una canción" +
                "\n2.- Mostrar lista de canciones" +
                "\n3.- Duración total de la playlist" +
                "\n4.- Eliminar una canción por su TÍTULO" +
                "\n5.- Canciones de un intérprete" +
                "\n6.- Intercambiar primera canción con la 2da." +
                "\n7.- Buscar canción" +
                "\n8.- Pasar la canción del final al inicio" +
                "\n9.- Terminar";
        char op;

        //Declaracion de arreglo
        ListaCanciones playlist = new ListaCanciones();

        //funcionamiento de menu
        do {
            op = JOptionPane.showInputDialog(menu).charAt(0);
            switch (op)
            {
                case '1' : titulo = JOptionPane.showInputDialog(null, "Ingresar titulo de la cancion");
                    interprete = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero del interprete"));
                    duracion = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa la duracion de la cancion"));
                    NodoCancion datos = new NodoCancion(titulo, interprete, duracion);
                    playlist.insertaFinal(datos);
                    break;
                case '2' : if(!playlist.listaVacia())
                    JOptionPane.showMessageDialog(null, playlist.recorreToString());
                else
                    JOptionPane.showMessageDialog(null, "la playlist esta vacia");
                    break;
                case '3' : if(!playlist.listaVacia())
                    JOptionPane.showMessageDialog(null, playlist.duracionTotal());
                else
                    JOptionPane.showMessageDialog(null, "la playlist esta vacia");
                    break;
                case '4' : if(!playlist.listaVacia()) {
                    String buscarTitulo = playlist.buscarTitulo(JOptionPane.showInputDialog(null, "Ingrese el titulo que esta buscando"));
                    if(buscarTitulo != null) {

                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el titulo de la cancion");
                    }
                } else
                    JOptionPane.showMessageDialog(null, "la playlist esta vacia");
                    break;
                case '5' : if(!playlist.listaVacia()) {
                    int buscarInterprete = playlist.buscarInterprete(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el titulo que esta buscando")));
                    if(buscarInterprete != 0) {

                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el titulo de la cancion");
                    }
                } else
                    JOptionPane.showMessageDialog(null, "La playlist esta vacia");
                    break;
                case '6' : if(!playlist.listaVacia())
                    playlist.intercambiar1ocon2do();
                else
                    JOptionPane.showMessageDialog(null, "La playlist esta vacia");
                    break;
                case '7' : if(!playlist.listaVacia()) {
                    String buscarTitulo = playlist.buscarTitulo(JOptionPane.showInputDialog(null, "Ingrese el titulo que esta buscando"));
                    if(buscarTitulo != null) {
                        JOptionPane.showMessageDialog(null, "Los datos de la cancion son: \n" + buscarTitulo.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro el titulo de la cancion");
                    }
                } else
                    JOptionPane.showMessageDialog(null, "la playlist esta vacia");
                    break;
                case '8' :
                    break;
                case '9' : JOptionPane.showMessageDialog(null, "Terminando...");
                    break;
                default : JOptionPane.showConfirmDialog(null, "Opcion Inexistente");
                    break;
            }
        }while(op != '9');
    }
}