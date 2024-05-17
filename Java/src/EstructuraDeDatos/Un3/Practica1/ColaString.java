package EstructuraDeDatos.Un3.Practica1;
public class ColaString
{
    private String c[];
    private int frente;
    private int fin;

    public ColaString() {
        c = new String[5];
        frente = 0;
        fin = -1;
    }

    public ColaString(int n) {
        c = new String[n];
        frente = 0;
        fin = -1;
    }
    public String[] getC() {
        return c;
    }

    public void setC(String[] c) {
        this.c = c;
    }

    public int getFrente() {
        return frente;
    }

    public void setFrente(int frente) {
        this.frente = frente;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public boolean estaVacia() {
        if (frente > fin)
            return true;
        else
            return false;
    }

    public boolean estaLlena() {
        if (fin == c.length - 1)
            return true;
        else
            return false;
    }

    public void insertar(String x) {
        if (!estaLlena()) {
            fin++;
            c[fin] = x;
        }
    }

    public String eliminar() {
        String borrado = null;
        if (!estaVacia()) {
            borrado = c[frente];
            c[frente] = null;
            frente++;
            if (estaVacia()) { // si al eliminar un dato, la fila queda VACÍA, se ajustan los
                frente = 0; // apuntadores para reutilizar las casillas del principio
                fin = -1; // y optimizar espacio
            }
        }
        return borrado;
    }

    public int numElementos() {
        return fin - frente + 1;
    }

    public String datoEnFrente() {
        if (estaVacia())
            return null;
        else
            return c[frente];
    }

    public String datoEnFin() {
        if(estaVacia()) {
            return null;
        }else {
            return c[fin];
        }
    }

    public boolean verificacion(String nombre)
    {
        for(int i = frente; i <= fin; i++)
        {
            if(nombre.equalsIgnoreCase(c[i]))
            {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String s = "";
        for (int i = frente; i <= fin; i++)
            s += c[i] + "\n";
        return s;
    }
}
