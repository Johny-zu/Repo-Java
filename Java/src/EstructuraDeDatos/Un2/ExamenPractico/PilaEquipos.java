package EstructuraDeDatos.Un2.ExamenPractico;
public class PilaEquipos
{
    private Equipo p[];
    private int tope;

    public PilaEquipos()
    {
        p = new Equipo[5];
        tope = -1;
    }

    public PilaEquipos(int n)
    {
        p = new Equipo[n];
        tope = -1;
    }

    //Metodos get and set
    public Equipo[] getP() {
        return p;
    }
    public void setP(Equipo[] nuevoP) {
        p = nuevoP;
    }
    public int getTope() {
        return tope;
    }
    public void setTope(int NuevoTope) {
        tope = NuevoTope;
    }

    //Elementos pila
    public void push(Equipo nuevo)
    {
        if(!isFull())
        {
            tope++;
            p[tope] = nuevo;
        }
    }

    public Equipo pop()
    {
        Equipo borrado = null;
        if(!isEmpty())
        {
            borrado = p[tope];
            p[tope] = null;
            tope--;
        }
        return borrado;
    }


    public boolean isEmpty()
    {
        if(tope == -1)
        {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull()
    {
        if(tope == p.length -1)
        {
            return true;
        } else {
            return false;
        }
    }


    public int size()
    {
        return tope+1;
    }

    public int sumaJugadores()
    {
        int s = 0;
        for(int i = tope; i >= 0; i--)
        {
            s += p[i].getJugadores();
        }
        return s;
    }

    //Metodo que devuelve los datos de la pila
    public String toString()
    {
        String s = "";
        int i;
        for(i = tope; i >= 0; i--)
        {
            s += p[i].toString() + "\n";
        }
        return s;
    }
}