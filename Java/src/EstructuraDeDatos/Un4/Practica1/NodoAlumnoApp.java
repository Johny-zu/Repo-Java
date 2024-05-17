package EstructuraDeDatos.Un4.Practica1;

import javax.swing.JOptionPane;
public class NodoAlumnoApp {

    public static void main(String[] args)
    {
        //Declaracion de variables
        String nombre = "";
        char grupo = 0;
        float calif1 = 0, calif2 = 0;
        NodoAlumno estudiante4 = null, estudiante6 = null;

        //Declaracion del menu
        String menu = "1.- Insertar un alumno" +
                "\n2.- Mostrar alumnos de 4to" +
                "\n3.- Mostrar alumnso de 6to" +
                "\n4.- Alumnos con ambas calificaciones reprobadas" +
                "\n5.- Termianr";
        char op;

        //Declaracion de la lista
        ListaAlumnos grupo4to = new ListaAlumnos();
        ListaAlumnos grupo6to = new ListaAlumnos();

        //funcionamiento de menu
        do {
            op = JOptionPane.showInputDialog(menu).charAt(0);
            switch (op)
            {
                case '1' : grupo = Character.toUpperCase(JOptionPane.showInputDialog(null, "Inserta el grupo donde se insertara el alumno: "
                        + "\nCuarto grupo: 4 \nSexto grupo: 6").charAt(0));
                    if(grupo == '4') {
                        nombre = JOptionPane.showInputDialog(null, "Ingresa un nombre");
                        calif1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la primera calificacion del alumno"));
                        calif2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la primera calificacion del alumno"));
                        estudiante4 = new NodoAlumno(nombre, grupo, calif1, calif2);
                        grupo4to.insertaFinal(estudiante4);
                    } else if(grupo == '6') {
                        nombre = JOptionPane.showInputDialog(null, "Ingresa un nombre");
                        calif1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la primera calificacion del alumno"));
                        calif2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la primera calificacion del alumno"));
                        estudiante6 = new NodoAlumno(nombre, grupo, calif1, calif2);
                        grupo6to.insertaFinal(estudiante6);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingresa un grupo existente");
                    }
                    break;
                case '2' : if(! grupo4to.listaVacia()) {
                    JOptionPane.showMessageDialog(null, grupo4to.recorreLista());
                } else {
                    JOptionPane.showMessageDialog(null, "El grupo esta vacio");
                }
                    break;
                case '3' : if(! grupo6to.listaVacia()) {
                    JOptionPane.showMessageDialog(null, estudiante6);
                } else {
                    JOptionPane.showMessageDialog(null, "El grupo esta vacio");
                }
                    break;
                case '4' : if(! grupo4to.listaVacia() || !grupo6to.listaVacia()) {

                } else {
                    JOptionPane.showMessageDialog(null, "El grupo esta vacio");
                }
                    break;
                case '5' : JOptionPane.showMessageDialog(null, "Terminando...");
                    break;
                default : JOptionPane.showMessageDialog(null, "Opcion Inexistente");
                    break;
            }
        }while(op != '5');
    }
}