package EstructuraDeDatos.Un4.ListaLinealnodo;
/** CLASE INSTANCIABLE PARA MANEJAR UNA LISTA ENLAZADA LINEAL Ó SIMPLE
 * La lista que vamos a estar manejando tiene 2 atributos:
 * - el apuntador al primer nodo (inicio) del mismo tipo de la clase Nodo
 * - un contador de nodos (numNodos) que SIEMPRE va a ser ENTERO */
public class ListaLineal {
    // Atributos
    private Nodo inicio;
    private int numNodos;

    /* Constructor que crea una lista vacía SIN NODOS,
    por eso el contador de nodos queda en CERO y el apuntador
    inicio que va a guardar la dirección del primer nodo (cuando exista)
    se inicializa de momento en null*/
    public ListaLineal () {
        inicio = null;
        numNodos=0;
    }

    // get...
    public Nodo getInicio ( ) {
        return inicio;
    }

    public int getNumNodos ( ) {
        return numNodos;
    }

    public void setInicio(Nodo inicio) {
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
    public void insertaInicio (Nodo nuevo) {
        nuevo.setLiga(inicio);
        inicio = nuevo;
        numNodos++;
    }

    // Método importante para RECORRER la lista (visitar TODOS los nodos)
    public void recorreLista()
    {
        Nodo r = inicio; //R es para recorrer la lista
        System.out.println("Empieza la lista:\n");
        while (r != null) {
            System.out.println (r.toString());
            r = r.getLiga(); //Con esta vamos a avanzar al siguiente nodo y tiene que estar dentro del ciclo
        }
        System.out.println("Fin de la lista");
    }

    //Metodo que inserta un nodo al final de la lista
    public void insertaFinal(Nodo nuevo) {
        Nodo r = inicio;
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

    // FALTAN MUCHOS MÁS MÉTODOS
}