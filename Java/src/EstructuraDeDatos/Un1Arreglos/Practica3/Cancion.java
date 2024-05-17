package EstructuraDeDatos.Un1Arreglos.Practica3;
public class Cancion
{
    private String nombre, interprete;
    private float duracion;

    //Constructor
    public Cancion()
    {
        nombre = "";
        interprete = "";
        duracion = 0f;
    }
    //Constructor con parametros
    public Cancion(String nombre, String interprete, float duracion)
    {
        this.nombre = nombre;
        this.interprete = interprete;
        this.duracion = duracion;
    }

    //Metodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    public String getInterprete() {
        return interprete;
    }
    public void setInterprete(String nuevoInterprete) {
        interprete = nuevoInterprete;
    }
    public float getDuracion() {
        return duracion;
    }
    public void setDuracion(float nuevaDuracion) {
        duracion = nuevaDuracion;
    }

    //Metodo toString() para regresar valores
    public String toString()
    {
        String s = "";
        s += "Nombre de la cancion: " + nombre;
        s += "\nNombre del interprete " + interprete;
        s += "\nTiempo que dura la cancion: " + duracion;
        return s;
    }

}