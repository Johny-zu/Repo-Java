package EstructuraDeDatos.Un3.ExamenPractico;
import javax.swing.JOptionPane;
public class ExamenApp
{
    public static void main(String[] args)
    {
        //Declaracion de variables
        String nombre = "";
        int divicion = 0, jugadores = 0;

        //Declaracion del menu
        String menu = "1.- Insertar equipo" +
                "\n2.- Mostrar equipos de la liga norte" +
                "\n3.- Mostrar equipos de la liga sur" +
                "\n4.- Pasar un equipo de la liga norte a la sur" +
                "\n5.- Equipos con mas jugadores" +
                "\n6.- Buscar equipo" +
                "\n7.- Terminar";
        char op;

        //Declaracion de cola
        ColaCircularEquipos ligaNorte = new ColaCircularEquipos(12);
        ColaCircularEquipos ligaSur = new ColaCircularEquipos(12);

        //funcionamiento de menu
        do {
            op = JOptionPane.showInputDialog(menu).charAt(0);
            switch (op)
            {
                case '1' : divicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta en que divicion esta: \n1:Norte \n2:sur"));
                    if(divicion == 1)
                    {
                        if(! ligaNorte.estaLlena())
                        {
                            nombre = JOptionPane.showInputDialog(null, "Inserta el nombre del equipo");
                            jugadores = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta  el numero del jugador"));
                            Equipo equipoNorte = new Equipo(nombre, divicion, jugadores);
                            ligaNorte.insertar(equipoNorte);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola de equipos  esta llena");
                        }
                    } else if(divicion == 2)
                    {
                        if(! ligaSur.estaLlena())
                        {
                            nombre = JOptionPane.showInputDialog(null, "Inserta el nombre del equipo");
                            jugadores = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta  el numero de jugadores"));
                            Equipo equipoSur = new Equipo(nombre, divicion, jugadores);
                            ligaSur.insertar(equipoSur);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola de equipos  esta llena");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Inserta una clasificacion correcta");
                    }
                    break;
                case '2' : if(! ligaNorte.estaVacia()) {
                    JOptionPane.showMessageDialog(null, "Los datos de la liga norte son: \n" + ligaNorte);
                } else {
                    JOptionPane.showMessageDialog(null, "Esta vacia la cola de liga norte");
                }
                    break;
                case '3' : if(! ligaSur.estaVacia()) {
                    JOptionPane.showMessageDialog(null, "Los datos de la liga sur son: \n" + ligaSur);
                } else {
                    JOptionPane.showMessageDialog(null, "Esta vacia la cola de liga sur");
                }
                    break;
                case '4' : if(! ligaNorte.estaVacia()) {
                    if(! ligaSur.estaLlena()) {
                        ligaSur.insertar(ligaNorte.eliminar());
                    } else {
                        JOptionPane.showMessageDialog(null, "La liga sur esta llena");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay elementos que mover");
                }
                    break;
                case '5' : if(!ligaNorte.estaVacia() && !ligaSur.estaVacia()) {
                    if(ligaNorte.numElementos() < ligaSur.numElementos())
                    {
                        JOptionPane.showMessageDialog(null, "La liga sur tiene mas equipos");
                    } else if(ligaSur.numElementos() < ligaNorte.numElementos()) {
                        JOptionPane.showMessageDialog(null, "La liga norte tiene mas equipos");
                    } else {
                        JOptionPane.showMessageDialog(null, "Hay la misma cantidad de jugadores en ambas diviciones");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay sufucientes para comparar");
                }
                    break;
                case '6' :
                    if(!ligaNorte.estaVacia() || !ligaSur.estaVacia()) {
                        nombre = JOptionPane.showInputDialog(null, "Inserta un nombre para buscar");
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay datos en las colas que comparar");
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