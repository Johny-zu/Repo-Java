package EstructuraDeDatos.Un1Arreglos.Practica3;
import javax.swing.JOptionPane;
public class CancionApp
{
    public static void main(String[] args)
    {
        String nombre, interprete;
        float duracion;
        int contador = 0;
        String menu = "1.- Captura una cancion" +
                "\n2.- Mostrar datos de canciones" +
                "\n3.- Duracion Total del playlist" +
                "\n4.- Cancion de menor duración" +
                "\n5.- Salida";
        char op;

        Cancion playlist[] = new Cancion[5];
        playlist[0] = new Cancion("New genesis", "Ado", 4.9f);

        do {
            op = JOptionPane.showInputDialog(menu).charAt(0);
            switch (op) {
                case '1': if(contador < 5)
                {
                    nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la canción");
                    interprete = JOptionPane.showInputDialog(null, "Ingrese el nombre del interprete");
                    duracion = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa la duracion de la canción"));
                    playlist[contador] = new Cancion(nombre, interprete, duracion);
                    contador++;
                } else {
                    JOptionPane.showMessageDialog(null, "No hay mas espacio");
                }
                    break;
                case '2' : for(int i = 0; i < playlist.length; i++)
                {
                    if (playlist[i] != null)
                    {
                        JOptionPane.showMessageDialog(null, playlist[i].toString());
                    }
                }
                    break;
                case '3' :	float duracionTotal = 0f;
                    for(int i = 0; i < playlist.length; i++)
                    {
                        if(playlist[i] != null)
                        {
                            duracionTotal += playlist[i].getDuracion();
                        }
                    }
                    JOptionPane.showMessageDialog(null, "El playlist dura: " + duracionTotal + " minutos");
                    break;
                case '4' :
                    float duracionMenor = 0.0f;
                    Cancion cancionDuracionMenor = null;
                    for (int i = 0; i < playlist.length; i++)
                    {
                        if (playlist[i] != null)
                        {
                            duracionMenor = playlist[i].getDuracion();
                            cancionDuracionMenor = playlist[i];
                            i = playlist.length;
                        }
                    }
                    for (int i = 0; i < playlist.length; i++)
                    {
                        if (playlist[i] != null)
                        {
                            if (playlist[i].getDuracion() < duracionMenor)
                            {
                                duracionMenor = playlist[i].getDuracion();
                                cancionDuracionMenor = playlist[i];
                            }
                        }
                    }
                    if (cancionDuracionMenor != null)
                    {
                        JOptionPane.showMessageDialog(null, "Canción con duración menor: " + cancionDuracionMenor.getNombre());
                    } else {
                        JOptionPane.showMessageDialog(null, "No ha ingresado canciones :c");
                    }
                    break;
                case '5' : JOptionPane.showConfirmDialog(null, "Salida");
                    break;
                default : JOptionPane.showConfirmDialog(null, "Opcion Inexistente");
                    break;
            }
        } while (op != '5');
    }
}
