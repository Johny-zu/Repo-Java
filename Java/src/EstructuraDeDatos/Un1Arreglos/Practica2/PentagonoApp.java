package EstructuraDeDatos.Un1Arreglos.Practica2;
import javax.swing.JOptionPane;
public class PentagonoApp
{
    public static void main(String[] args)
    {
        float lado = 0f, apotema = 0f;
        Pentagono vpent[] = new Pentagono[6];

        vpent[0] = new Pentagono(3.4f, 2.9f);

        for(int i=0; i <= vpent.length; i++)
        {
            if(i % 2 == 1)
            {
                lado = Float.parseFloat(JOptionPane.showInputDialog("Cuál es la longitud de los lados del pentágono " + i + "?"));
                apotema = Float.parseFloat(JOptionPane.showInputDialog("Cuál es la longitud del apotema de pentágono " + i + "?"));
                vpent[i] = new Pentagono(lado, apotema);
            }
        }
        JOptionPane.showMessageDialog(null, "");
        String ResumenGeneral = "", AreasPerimetros = "";

        for (int i = 0; i < vpent.length; i++) {
            if (vpent[i] != null) {

                String ladoS = Float.toString(vpent[i].getLado());
                String apotemaS = Float.toString(vpent[i].getApotema());
                String perimetroS = Float.toString(vpent[i].CalcularPerimetro());
                String areaS = Float.toString(vpent[i].CalcularArea());

                ResumenGeneral += "\nPentágono " + i + ": (Lado = " + ladoS + ", Apotema = " + apotemaS + ")";
                AreasPerimetros += "\nPentágono " + i + ": (Area = " + areaS + ", Perimetro = "
                        + perimetroS + ")";
            }
        }

        String[] opciones = { "Datos generales", "Área y perímetro", "Salir" };

        String opcionSeleccionada = "Salir";
        do {
            opcionSeleccionada = JOptionPane.showInputDialog(null, "¿Qué desea visualizar de los pentágonos?",
                    "Visualizar pentágonos", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]).toString();
            switch (opcionSeleccionada) {
                case "Datos generales":
                    JOptionPane.showMessageDialog(null, ResumenGeneral);
                    break;
                case "Área y perímetro":
                    JOptionPane.showMessageDialog(null, AreasPerimetros);
                    break;
                case "Salir":
                    break;
            }
        } while (!opcionSeleccionada.equals("Salir"));
    }
}