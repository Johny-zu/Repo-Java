package EstructuraDeDatos.Un1Arreglos.ExPractico;
import javax.swing.JOptionPane;
public class ConoApp
{
    public static void main(String[] args)
    {
        //Declaracion de variables
        float radio, altura;

        //Declaracion del menu
        String menu = "1.- Captura un cono" +
                "\n2.- Mostrar todos los datos de los conos" +
                "\n3.- Suma de valores" +
                "\n4.- Cono con base mayor" +
                "\n5.- Salida";
        char op;


        //Declaracion del vector
        Cono figuras[] = new Cono[5];
        figuras[0] = new Cono(3.0f, 2.0f);

        //funcionamiento de menu
        do {
            op = JOptionPane.showInputDialog(menu).charAt(0);
            switch (op)
            {
                case '1' : int casilla = 1;
                    casilla = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de casilla que quiere llenar"));
                    if(casilla >= 0 && casilla <5)
                    {
                        if(figuras[casilla] == null)
                        {
                            radio = Float.parseFloat(JOptionPane.showInputDialog(null, "Captura el radio del cono: "));
                            altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Captura la altura del cono: "));
                            figuras[casilla] = new Cono(radio, altura);
                            casilla++;
                        } else {
                            JOptionPane.showMessageDialog(null, "La casilla esta ocupada");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Casilla inexistente");
                    }
                    break;
                case '2' : for(int i = 0; i < figuras.length; i++) {
                    if(figuras[i] != null)
                    {
                        JOptionPane.showMessageDialog(null, figuras[i].toString() + "\nLa casilla es: " + i);
                    }
                }
                    break;
                case '3' : float suma = 0.0f;
                    for(int i = 0; i < figuras.length; i++)
                    {
                        if(figuras[i] != null)
                        {
                            suma += figuras[i].volumen();
                        }
                    }
                    JOptionPane.showMessageDialog(null, "La suma de los volumenes es: " + suma);
                    break;
                case '4' : float mayor = 0.0f, menor = 0.0f;
                    for(int i = 0; i < figuras.length; i++)
                    {
                        if(figuras[i] != null)
                        {
                            menor = figuras[i].areaBase();
                            if(menor < figuras[i].areaBase())
                            {
                                mayor = figuras[i].areaBase();
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "El area mayor es: " + mayor);
                    break;
                case '5' : JOptionPane.showMessageDialog(null, "salir");
                    break;
                default : JOptionPane.showConfirmDialog(null, "Opcion Inexistente");
                    break;
            }
        }while(op != '5');
    }
}