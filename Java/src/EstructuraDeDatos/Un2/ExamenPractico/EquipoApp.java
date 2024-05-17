package EstructuraDeDatos.Un2.ExamenPractico;

import javax.swing.JOptionPane;
public class EquipoApp
{
    public static void main(String[] args)
    {
        //Declaracion de variables
        String nombre = "";
        int jugadores = 0, division = 0;

        //Declaracion del menu
        String menu = "1.- Insertar equipo" +
                "\n2.- Mostrar equipos de futbol" +
                "\n3.- Mostrar equipos de basquetbol" +
                "\n4.- Cantidad total de jugadores" +
                "\n5.- Terminar";
        char op;

        //Declaracion de pila
        PilaEquipos futbol = new PilaEquipos(3);
        PilaEquipos basquetbol = new PilaEquipos(3);

        //funcionamiento de menu
        do {
            op = JOptionPane.showInputDialog(menu).charAt(0);
            switch (op)
            {
                case '1' : jugadores = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta el numero de jugadores"));
                    if(jugadores >= 11)
                    {
                        if(! futbol.isFull()) {
                            nombre = JOptionPane.showInputDialog(null, "Inserta el nombre del jugador");
                            division = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta el numero de la division"));
                            Equipo equipoDep = new Equipo(nombre, jugadores, division);
                            futbol.push(equipoDep);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pula de futbol esta llena");
                        }
                    }
                    if(jugadores < 11)
                    {
                        if(! futbol.isFull()) {
                            nombre = JOptionPane.showInputDialog(null, "Inserta el nombre del jugador");
                            division = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta el numero de la division"));
                            Equipo equipoDep = new Equipo(nombre, jugadores, division);
                            basquetbol.push(equipoDep);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pula de basquetbol esta llena");
                        }
                    }
                    break;
                case '2' : if(! futbol.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Los datos de futbol son: \n" + futbol.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "La pila de futbol esta vacia");
                }
                    break;
                case '3' : if(! basquetbol.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Los datos de basquetbol son: \n" + basquetbol.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "La pila de basquetbol esta vacia");
                }
                    break;
                case '4' : int suma = futbol.sumaJugadores() + basquetbol.sumaJugadores();
                    JOptionPane.showMessageDialog(null, "La suma de los libros es: " + suma);
                    break;
                case '5' : JOptionPane.showMessageDialog(null, "Saliendo... ");
                    break;
                default : JOptionPane.showMessageDialog(null, "Opcion Inexistente");
                    break;
            }
        }while(op != '5');
    }
}