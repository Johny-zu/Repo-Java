package EstructuraDeDatos.Un1Arreglos.Practica4;
import javax.swing.JOptionPane;
public class ArticuloApp
{
    public static void main(String[] args)
    {
        //Declaracion de variables
        String descripcion;
        int cantidad;
        float precio;
        //Declaracion del menu
        String menu = "1.- Captura de un artículo" +
                "\n2.- Mostrar datos del articulo" +
                "\n3.- Total de inventario" +
                "\n4.- Aumentar 7% a todos los articulos" +
                "\n5.- Salida";
        char op;

        //Declaracion del arreglo
        Articulo abarrotes[] = new Articulo[10];
        abarrotes[0] = new Articulo("Pluma negra", 10, 4.9f); //partiendo con un valor

        //funcionamiento de menu
        do {
            op = JOptionPane.showInputDialog(menu).charAt(0);
            switch (op)
            {
                case '1' : int numCas = 1; //El numero de casilla que tomara el usuario
                    numCas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de casilla que quiere rellenar"));
                    if(numCas >= 0 &&numCas < 10)
                    {
                        if(abarrotes[numCas] == null)
                        {
                            descripcion = JOptionPane.showInputDialog(null, "Ingrese la descripcion del articulo: ");
                            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de unidades del articulo: "));
                            precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Captura el precio del articulo: "));
                            abarrotes[numCas] = new Articulo(descripcion, cantidad, precio);
                            numCas++;
                        } else {
                            JOptionPane.showMessageDialog(null, "La casilla esta ocupada");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe la casilla");
                    }
                    break;
                case '2' : for(int i = 0; i < abarrotes.length;i++) {
                    if(abarrotes[i] != null) {
                        JOptionPane.showMessageDialog(null, abarrotes[i].toString() + "\nLa casilla es: " + i);
                    }
                }
                    break;
                case '3' : float total = 0.0f, suma = 0.0f;
                    for(int i = 0; i < abarrotes.length;i++)
                    {
                        if(abarrotes[i] != null) {
                            total = (abarrotes[i].getPrecio() * abarrotes[i].getCantidad());
                            suma += total;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "La suma total de inventario es: " + suma);
                    break;
                case '4' : float aumento = 0.7f, porcentaje = 0f, total2 = 0;
                    for(int  i = 0; i < abarrotes.length; i++)
                    {
                        if(abarrotes[i] != null)
                        {
                            abarrotes[i].setPrecio(abarrotes[i].getPrecio() * 1.07f);
                        }
                    }
                    break;
                case '5' : JOptionPane.showMessageDialog(null, "salir");
                    break;
                default : JOptionPane.showConfirmDialog(null, "Opcion Inexistente");
                    break;
            }
        }while(op != '5');
    }
}