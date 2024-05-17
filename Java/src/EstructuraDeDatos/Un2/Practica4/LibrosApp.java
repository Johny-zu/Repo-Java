package EstructuraDeDatos.Un2.Practica4;

import javax.swing.JOptionPane;
public class LibrosApp
{
    public static void main(String[] args)
    {
        //Declarar variables
        String titulo = "niguno", autor = "";
        char clasificacion = 0;
        float precio = 0;

        //Declaracion del menu
        String menu = "1.- Insertar un libro" +
                "\n2.- Mostrar libros de historia" +
                "\n3.- Mostrar libros de novela" +
                "\n4.- Libros en el tope de las pilas" +
                "\n5.- Eliminar un libro de historia" +
                "\n6.- Precio total de libros" +
                "\n7.- Terminar";

        char op;

        //Funciones de pilas
        PilaLibros historia = new PilaLibros(7);
        PilaLibros novela = new PilaLibros(7);

        //funcionamiento de menu
        do {
            op = JOptionPane.showInputDialog(menu).charAt(0);
            switch (op)
            {
                case '1' : clasificacion = Character.toUpperCase(JOptionPane.showInputDialog(null, "La clasificacion del libro es: "
                        + "\nHistoria: h \nNovela: n").charAt(0));
                    if(clasificacion == 'H')
                    {
                        if(! historia.isFull())
                        {
                            titulo = JOptionPane.showInputDialog(null, "El titulo del libro es: ");
                            autor = JOptionPane.showInputDialog(null, "El autor es: ");
                            precio = Integer.parseInt(JOptionPane.showInputDialog(null, "El precio es: "));
                            Libro libroHistoria = new Libro(titulo, autor, clasificacion, precio);
                            historia.push(libroHistoria);
                        }
                    } else if(clasificacion == 'N')
                    {
                        titulo = JOptionPane.showInputDialog(null, "El tituulo del libro es: ");
                        autor = JOptionPane.showInputDialog(null, "El autor es: ");
                        precio = Integer.parseInt(JOptionPane.showInputDialog(null, "El precio es: "));
                        Libro libroNovela = new Libro(titulo, autor, clasificacion, precio);
                        novela.push(libroNovela);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay librero de este genero");
                    }
                    break;
                case '2' : if(! novela.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Los libros de novela son: " + historia.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "No hay libros en la pila");
                }
                    break;
                case '3' : if(! historia.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Los libros de novela son: " + novela.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "No hay libros en la pila");
                }
                    break;
                case '4' :if(!historia.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El libro del tope de historia es: \nTitulo: " + historia.getP()[historia.getTope()].getTitulo() +
                            "\nAutor: " + historia.getP()[historia.getTope()].getAutor());
                } else {
                    JOptionPane.showMessageDialog(null, "\nNo hay libros en la pila historia");
                }
                    if(!novela.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "El libro del tope de novela es: \nTitulo: " + novela.getP()[novela.getTope()].getTitulo() +
                                "\nAutor:  " + novela.getP()[novela.getTope()].getAutor());
                    } else {
                        JOptionPane.showMessageDialog(null, "\nNo hay libros en la pila novela");
                    }
                    break;
                case '5' : if(! historia.isEmpty()) {
                    Libro borrado = historia.pop();
                    JOptionPane.showMessageDialog(null," El dato elimiando es: " + borrado);
                } else {
                    JOptionPane.showMessageDialog(null, "La pila esta vacia");
                }
                    break;
                case '6' : float suma = historia.sumaPrecio() + novela.sumaPrecio();
                    JOptionPane.showMessageDialog(null, "La suma de los libros es: " + suma);
                    break;
                case '7' : JOptionPane.showMessageDialog(null, "Terminar");
                    break;
                default : JOptionPane.showConfirmDialog(null, "Opcion Inexistente");
                    break;
            }
        }while(op != '7');
    }
}