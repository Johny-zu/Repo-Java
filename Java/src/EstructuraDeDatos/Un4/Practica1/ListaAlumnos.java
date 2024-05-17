package EstructuraDeDatos.Un4.Practica1;
public class  ListaAlumnos
{
    // Atributos
    private NodoAlumno inicio;
    private int numNodos;

    /* Constructor que crea una lista vacía SIN NODOS,
    por eso el contador de nodos queda en CERO y el apuntador
    inicio que va a guardar la dirección del primer nodo (cuando exista)
    se inicializa de momento en null*/
    public ListaAlumnos() {
        inicio = null;
        numNodos=0;
    }

    // get...
    public NodoAlumno getInicio ( ) {
        return inicio;
    }

    public int getNumNodos ( ) {
        return numNodos;
    }

    public void setInicio(NodoAlumno inicio) {
        this.inicio = inicio;
    }

    public void setNumNodos(int numNodos) {
        this.numNodos = numNodos;
    }

    // Método que devuelve true si la lista está vacía
    public boolean listaVacia() {
        if (inicio == null)
            return true;
        else
            return false;
    }

    // Método que inserta un nodo al inicio de la lista
    public void insertaInicio (NodoAlumno nuevo) {
        nuevo.setLiga(inicio);
        inicio = nuevo;
        numNodos++;
    }

    //Metodo que inserta un nodo al final de la lista
    public void insertaFinal(NodoAlumno nuevo) {
        NodoAlumno r = inicio;
        if(listaVacia()) {
            inicio = nuevo;
        } else {
            while(r.getLiga() != null) { //Para  "r" en el ultimo nodo
                r = r.getLiga(); //Avanza al siguiente nodo
            }
            r.setLiga(nuevo); //liga el ultimo nodo con el nuevo
        }
        numNodos++;
    }

    //Elimna el primer nodo de la lista y devuelve el eliminado
    public NodoAlumno eliminaPrimerNodo()
    {
        NodoAlumno borrado = inicio;
        if(! listaVacia())
        {
            inicio = inicio.getLiga(); //Mueve el inicio hacia el 2do nodo
            numNodos--;
            borrado.setLiga(null); //desligar el nodo eliminado
        }
        return borrado;
    }

    //Método importante para RECORRER la lista (visitar TODOS los nodos)
    public Object recorreLista()
    {
        NodoAlumno r = inicio; //R es para recorrer la lista
        System.out.println("Empieza la lista:\n");
        while (r != null) {
            System.out.println (r.toString());
            r = r.getLiga(); //Con esta vamos a avanzar al siguiente nodo y tiene que estar dentro del ciclo
        }
        System.out.println("Fin de la lista");
        return null;
    }
}






























