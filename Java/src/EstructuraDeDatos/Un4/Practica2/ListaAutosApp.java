package EstructuraDeDatos.Un4.Practica2;
import javax.swing.JOptionPane;

public class ListaAutosApp
{
    public static void main(String[] args)
    {
        //Declaracion de variables
        String placa, propietario;
        int kilometraje;

        //Declaracion del menu
        String menu = "1.- Insertar un automovil al inicio" +
                "\n2.- Insertar un automovil al final" +
                "\n3.- Mostrar todos los autos" +
                "\n4.- Auto con mayor kilometraje" +
                "\n5.- Buscar por propietario" +
                "\n6.- Eliminar el auto del inicio" +
                "\n7.- Eliminar el auto del final" +
                "\n8.- Terminar";
        char op;

        //Declaracion de arreglo
        ListaAutos vehiculos = new ListaAutos();

        //funcionamiento de menu
        do {
            op = JOptionPane.showInputDialog(menu).charAt(0);
            switch (op)
            {
                case '1' : placa = JOptionPane.showInputDialog("Ingresa la placa de un vehiculo");
                    propietario = JOptionPane.showInputDialog("Ingresa el nombre del propietario");
                    kilometraje = Integer.parseInt(JOptionPane.showInputDialog("Inserta el kilometraje del vehiculo"));
                    NodoAuto datosInicio = new NodoAuto(placa, propietario, kilometraje);
                    vehiculos.insertaInicio(datosInicio);
                    break;
                case '2' : placa = JOptionPane.showInputDialog("Ingresa la placa de un vehiculo");
                    propietario = JOptionPane.showInputDialog("Ingresa el nombre del propietario");
                    kilometraje = Integer.parseInt(JOptionPane.showInputDialog("Inserta el kilometraje del vehiculo"));
                    NodoAuto datosFinal = new NodoAuto(placa, propietario, kilometraje);
                    vehiculos.insertaFinal(datosFinal);
                    break;
                case '3' : if(! vehiculos.listaVacia()) {
                    JOptionPane.showMessageDialog(null, vehiculos.recorreToString());
                } else {
                    JOptionPane.showMessageDialog(null, "La lista esta vacia");
                }
                    break;
                case '4' : if(! vehiculos.listaVacia()) {
                    vehiculos.kilometrajeMasAlto();
                } else {
                    JOptionPane.showMessageDialog(null, "La lista esta vacia");
                }
                    break;
                case '5' : if (!vehiculos.listaVacia()) {
                    String vehiculoEncontrado = vehiculos.buscarPropietario(JOptionPane.showInputDialog("Ingrese el nombre del propietario\n"));
                    if (vehiculoEncontrado != null) {
                        JOptionPane.showMessageDialog(null, "Auto del propietario:\n" + vehiculoEncontrado.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "AUTOMÓVIL DE ESE PROPIETARIO NO ENCONTRADO");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "NO HAY VEHICULOS PARA BUSCAR");
                }
                    break;
                case '6' : if (!vehiculos.listaVacia()) {
                    JOptionPane.showMessageDialog(null,"primer auto eliminado de la lista:\n" + vehiculos.eliminaPrimerNodo());
                } else {
                    JOptionPane.showMessageDialog(null, "LISTA VACÍA: NO HAY AUTOMÓVILES PARA ELIMINAR");
                }
                    break;
                case '7' : if (!vehiculos.listaVacia()) {
                    JOptionPane.showMessageDialog(null, "Último auto eliminado de la lista:\n" + vehiculos.eliminaUltimo());
                } else {
                    JOptionPane.showMessageDialog(null, "LISTA VACÍA: NO HAY AUTOMÓVILES PARA ELIMINAR");
                }
                    break;
                case '8' : JOptionPane.showMessageDialog(null, "Terminando...");
                    break;
                default : JOptionPane.showConfirmDialog(null, "Opcion Inexistente");
                    break;
            }
        }while(op != '8');
    }
}