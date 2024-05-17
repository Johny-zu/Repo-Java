package EstructuraDeDatos.Un4.Practica3;
public class NodoCancion
{
    //Declaracion e inicializacion de atributos en constructores
    private String titulo;
    private int interprete;
    private float duracion;
    private NodoCancion liga;

    public NodoCancion () {
        titulo = "";
        interprete = 0;
        duracion = 0.0f;
        liga = null;
    }

    public NodoCancion (String titulo, int interprete, float duracion) {
        this.titulo = titulo;
        this.interprete = interprete;
        this.duracion = duracion;
        liga = null;
    }

    //Metodos get y set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getInterprete() {
        return interprete;
    }

    public void setInterprete(int interprete) {
        this.interprete = interprete;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public NodoCancion getLiga() {
        return liga;
    }

    public void setLiga(NodoCancion liga) {
        this.liga = liga;
    }

    //Metodos extras para la siguientes clases
	/*public float sumaDuracion() {
		float suma = 0.0f;
		suma += duracion;
		return suma;
	}*/

    //Metodo toString
    public String toString( ) {
        String s = "";
        s += "El titulo de la cancion es: " + titulo + "\n";
        s += "El numero del interprete es: " + interprete + "\n";
        s += "La duracion de la canción es: " + duracion;
        s += "\n\n";
        return s;
    }
}