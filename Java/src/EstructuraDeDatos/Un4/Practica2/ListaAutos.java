package EstructuraDeDatos.Un4.Practica2;

import javax.swing.JOptionPane;

public class ListaAutos
{
    // Atributos
    private NodoAuto inicio;
    private int numNodos;

    /* Constructor que crea una lista vacía SIN NODOS,
    por eso el contador de nodos queda en CERO y el apuntador
    inicio que va a guardar la dirección del primer nodo (cuando exista)
    se inicializa de momento en null*/
    public ListaAutos () {
        inicio = null;
        numNodos=0;
    }

    // get...
    public NodoAuto getInicio ( ) {
        return inicio;
    }

    public int getNumNodos ( ) {
        return numNodos;
    }

    public void setInicio(NodoAuto inicio) {
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

    // Método importante para RECORRER la lista (visitar TODOS los nodos)
    public void recorreLista()
    {
        NodoAuto r = inicio; //R es para recorrer la lista
        System.out.println("Empieza la lista:\n");
        while (r != null) {
            System.out.println (r.toString());
            r = r.getLiga(); //Con esta vamos a avanzar al siguiente nodo y tiene que estar dentro del ciclo
        }
        System.out.println("Fin de la lista");
    }

    public String recorreToString()
    {
        NodoAuto r = inicio;
        String datos = "";
        while(r != null)
        {
            datos += r.toString() + "\n";
            r = r.getLiga();
        }
        return datos;
    }

    public void kilometrajeMasAlto()
    {
        NodoAuto mayor = inicio;
        NodoAuto r = inicio;
        if(mayor!= null) {
            while(r.getLiga() != null)
            {
                if(mayor.calcularPromedio() < r.getLiga().calcularPromedio())
                {
                    mayor = r.getLiga();
                }
                r = r.getLiga();
            }
            if(!listaVacia())
                JOptionPane.showMessageDialog(null, mayor.toString());
        } else {
            mayor = null;
        }
    }

    public String buscarPropietario(String propietario) {
        NodoAuto r = inicio;
        while (r != null) {
            if (r.getPropietario().equalsIgnoreCase(propietario)) {
                return r.getPropietario();
            }
            r = r.getLiga();
        }
        return null;
    }

    //Primer metodo del dia 27/04/2023
    public NodoAuto buscarPlaca(String placa)
    {
        NodoAuto r = inicio;
        while (r != null) {
            if (r.getPlaca().equalsIgnoreCase(placa)) {
                return r;
            }
            r = r.getLiga();
        }
        return null;
    }

    public boolean aumentaKilometraje(String placa, int aumentoKM)
    {
        NodoAuto r = buscarPlaca(placa);
        if(r != null)
        {
            r.setKilometraje(r.getKilometraje() + aumentoKM);
            return true;
        }
        return false;
    }
    //Segundo metod del dia 27/04/2023
    public void intercambiar1ocon2do()
    {
        if(numNodos > 2)
        {
            NodoAuto primeroInicial = inicio; //r = inicio(primer nodo)
            NodoAuto terceroInicial = inicio.getLiga().getLiga();
            inicio = inicio.getLiga(); //Segundo nodo, que sera tambien el primero
            inicio.setLiga(primeroInicial);//Modificamos el segundo como primero  y el primero en segundo
            inicio.getLiga().setLiga(terceroInicial);
        } else if (numNodos == 2) {
            NodoAuto primeroInicial = inicio; //r = inicio(primer nodo)
            inicio = inicio.getLiga(); //Segundo nodo, que sera tambien el primero
            inicio.setLiga(primeroInicial);//Modificamos el segundo como primero  y el primero en segundo
        } else {
            JOptionPane.showMessageDialog(null, "Solo hay un nodo o lista vacia");
        }
    }

    // Método que inserta un nodo al inicio de la lista
    public void insertaInicio (NodoAuto nuevo) {
        nuevo.setLiga(inicio);
        inicio = nuevo;
        numNodos++;
    }

    //Metodo que inserta un nodo al final de la lista
    public void insertaFinal(NodoAuto nuevo) {
        NodoAuto r = inicio;
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
    public NodoAuto eliminaPrimerNodo()
    {
        NodoAuto borrado = inicio;
        if(! listaVacia())
        {
            inicio = inicio.getLiga(); //Mueve el inicio hacia el 2do nodo
            numNodos--;
            borrado.setLiga(null); //desligar el nodo eliminado
        }
        return borrado;
    }

    public NodoAuto eliminaUltimo()
    {
        NodoAuto borrado = null;
        NodoAuto aux = inicio;
        if(!listaVacia())
        {
            for(int i=1; true; i++)
            {
                if(i == (numNodos-1) && numNodos > 1)
                {
                    borrado = aux.getLiga();
                    aux.setLiga(null);
                    numNodos--;
                    break;
                }
                if(numNodos == 1)
                {
                    borrado = aux;
                    inicio = null;
                    numNodos--;
                    break;
                }
                aux = aux.getLiga();
            }
        }
        return borrado;
    }
}