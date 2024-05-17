package EstructuraDeDatos.Un4.Practica1;
public class NodoAlumno {
    // 3 atributos: los 2 datos y la liga o enlace al siguiente nodo
    private String nombre;
    private char grupo;
    private float calif1, calif2;
    private NodoAlumno liga;  // La liga SIEMPRE será del mismo tipo de la
    // clase que lo contiene,
    // porque guarda la dirección de memoria del siguiente nodo

    // 1er. Constructor, crea un nodo con datos vacíos (NO recibe parámetros)
    public NodoAlumno () {
        nombre = "";
        grupo = ' ';
        calif1 = 0;
        calif2 = 0;
        liga = null;
    }

    // 2do. Constructor, recibe como parámetros los 2 datos, el liga NO se recibe, sino
    // que se pone en null porque todos los nodos nuevos está DESCONECTADOS de la lista
    public NodoAlumno (String nombre, char grupo, float calif1, float calif2) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.calif1 = calif1;
        this.calif2 = calif2;
        liga = null;
    }

    // Métodos get...
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public float getCalif1() {
        return calif1;
    }

    public void setCalif1(float calif1) {
        this.calif1 = calif1;
    }

    public float getCalif2() {
        return calif2;
    }

    public void setCalif2(float calif2) {
        this.calif2 = calif2;
    }

    public NodoAlumno getLiga() {
        return liga;
    }

    public void setLiga(NodoAlumno liga) {
        this.liga = liga;
    }

    /* Método toString
     Solamente se devuelven los datos, NO el enlace,
    ya que es una dirección de memoria para ligar nodos,
    NO es un dato que deba ver el usuario.*/
    public String toString( ) {
        String s = "";
        s += nombre + "\n";
        s += grupo + "\n";
        s += calif1 + "\n";
        s += calif2 + "\n";
        return s;
    }
}