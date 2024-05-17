package EstructuraDeDatos.Un4.Practica3;
import javax.swing.JOptionPane;
public class ListaCanciones
{
    private NodoCancion inicio;
    private int numNodos;

    public ListaCanciones () {
        inicio = null;
        numNodos=0;
    }

    public NodoCancion getInicio ( ) {
        return inicio;
    }

    public int getNumNodos ( ) {
        return numNodos;
    }

    public void setInicio(NodoCancion inicio) {
        this.inicio = inicio;
    }

    public void setNumNodos(int numNodos) {
        this.numNodos = numNodos;
    }

    public boolean listaVacia() {
        if (inicio == null)
            return true;
        else
            return false;
    }

    //Metodos ue se usaran para insertar nodos nuevos
    public void insertaInicio (NodoCancion nuevo) {
        nuevo.setLiga(inicio);
        inicio = nuevo;
        numNodos++;
    }

    public void insertaFinal(NodoCancion nuevo) {
        NodoCancion r = inicio;
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

    //Metodos de eliminacion de nodos
    public NodoCancion eliminaPrimerNodo()
    {
        NodoCancion borrado = inicio;
        if(! listaVacia())
        {
            inicio = inicio.getLiga(); //Mueve el inicio hacia el 2do nodo
            numNodos--;
            borrado.setLiga(null); //desligar el nodo eliminado
        }
        return borrado;
    }

    public NodoCancion eliminaUltimo()
    {
        NodoCancion borrado = null;
        NodoCancion aux = inicio;
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

    //Metodos que recorren la lista
    public void recorreLista()
    {
        NodoCancion r = inicio; //R es para recorrer la lista
        System.out.println("Empieza la lista:\n");
        while (r != null) {
            System.out.println (r.toString());
            r = r.getLiga(); //Con esta vamos a avanzar al siguiente nodo y tiene que estar dentro del ciclo
        }
        System.out.println("Fin de la lista");
    }

    public String recorreToString()
    {
        NodoCancion r = inicio;
        String datos = "";
        while(r != null)
        {
            datos += r.toString() + "\n";
            r = r.getLiga();
        }
        return datos;
    }

    //Metodos que hacen opciones de nodos
    //opcion 3
    public float duracionTotal()
    {
        NodoCancion r = inicio;
        float suma = 0.0f;
        while(r != null)
        {
            suma += r.getDuracion();
            r = r.getLiga();
        }
        return suma;
    }

    //opcion 4
    public String buscarTitulo(String titulo) {
        NodoCancion r = inicio;
        while (r != null) {
            if (r.getTitulo().equalsIgnoreCase(titulo)) {
                return r.getTitulo();
            }
            r = r.getLiga();
        }
        return null;
    }

    //Opcion 5
    public int buscarInterprete(int interprete) {
        NodoCancion r = inicio;
        while (r != null) {
            if (r.getInterprete() == interprete) {
                return r.getInterprete();
            }
            r = r.getLiga();
        }
        return 0;
    }

    /*public void kilometrajeMasAlto()
    {
    	NodoCancion mayor = inicio;
    	NodoCancion r = inicio;
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

    public String buscarInterprete(String interprete) {
    	NodoCancion r = inicio;
		while (r != null) {
			if (r.getInterprete().equalsIgnoreCase(interprete)) {
				return r.getInterprete();
			}
			r = r.getLiga();
		}
		return null;
	}

    //Primer metodo del dia 27/04/2023

    public NodoCancion buscarPlaca(String placa)
    {
    	NodoCancion r = inicio;
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
    } */

    //intercambio de apuntadores para cambiar orden de la lista
    public void intercambiar1ocon2do()
    {
        if(numNodos > 2)
        {
            NodoCancion primeroInicial = inicio; //r = inicio(primer nodo)
            NodoCancion terceroInicial = inicio.getLiga().getLiga();
            inicio = inicio.getLiga(); //Segundo nodo, que sera tambien el primero
            inicio.setLiga(primeroInicial);//Modificamos el segundo como primero  y el primero en segundo
            inicio.getLiga().setLiga(terceroInicial);
        } else if (numNodos == 2) {
            NodoCancion primeroInicial = inicio; //r = inicio(primer nodo)
            inicio = inicio.getLiga(); //Segundo nodo, que sera tambien el primero
            inicio.setLiga(primeroInicial);//Modificamos el segundo como primero  y el primero en segundo
        } else {
            JOptionPane.showMessageDialog(null, "Solo hay un nodo o lista vacia");
        }
    }
}