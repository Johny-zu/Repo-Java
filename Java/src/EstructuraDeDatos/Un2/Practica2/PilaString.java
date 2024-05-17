package EstructuraDeDatos.Un2.Practica2;
public class PilaString
{
    private String p[]; //Vector para guardar datos en la pila
    private int tope; //apuntador al ultimo elemento de la pila

    //1er constrcutor, Genera una pila de 5 casillas
    public PilaString()
    {
        p = new String[5];//Se crea el vector pila
        tope = -1; //Pila vacia
    }
    //2do Constructor, genera una pula de tamaño n
    public PilaString(int n)
    {
        p = new String[n]; //Se crea el vector de n valores
        tope = -1; //Inicializacion de tope
    }

    //Metodos get and set
    public String[] getP() {
        return p;
    }
    public void setP(String[] nuevoP) {
        p = nuevoP;
    }
    public int getTope() {
        return tope;
    }
    public void setTope(int NuevoTope) {
        tope = NuevoTope;
    }

    //Inserta elementos en la pila
    public void push(String nuevo)
    {
        if(!isFull()) //Revisa que la pila no este llena
        {
            tope++; //Mueve el tope a la siguiente casilla libre
            p[tope] = nuevo; //Guarda el dato en el tope de la pila
        }
    }
    //Elimina un elemento de la pila
    public String pop()
    {
        String borrado = ""; //Devuelve el dato borrado
        if(!isEmpty())
        {
            borrado = p[tope]; //Saca datos del tope
            p[tope] = ""; //Se borra fisicamente de la casilla
            tope--; //Se decrementa el tope
        }
        return borrado; //se devuelve el valor eliminado
    }

    //Metodo que checa si la pila esta vacia
    public boolean isEmpty()
    {
        if(tope == -1) //Si el tope no señala a ninguna casilla
        {
            return true;
        } else {
            return false;
        }
    }
    //Metodo que checa si la pila esta llena
    public boolean isFull()
    {
        if(tope == p.length -1) //Si el tope esta en la ultima casilla
        {
            return true;
        } else {
            return false;
        }
    }

    //Devuelve el numero de elementos que hay actualmente en la pila
    public int size()
    {
        return tope+1;
    }

    //Metodo que devuelve los datos de la pila
    public String toString()
    {
        String s = "";
        int i;
        for(i = tope; i >= 0; i--)
        {
            s += p[i] + "\n";
        }
        return s;
    }
}