package EstructuraDeDatos.Un2.Practica4;
public class Libro
{
    private String titulo, autor;
    private char clasificacion;
    private float precio;

    //1er clonstructor de objeto de la clase
    public Libro()
    {
        titulo = "niguno";
        autor = "";
        clasificacion = 0;
        precio = 0;
    }

    //2do constructor
    public Libro(String tit, String aut, char clas, float pre)
    {
        titulo = tit;
        autor = aut;
        clasificacion = clas;
        precio = pre;
    }

    // geter
    public String getTitulo()
    {
        return titulo;
    }

    public String getAutor()
    {
        return autor;
    }

    public char getClasificacion()
    {
        return clasificacion;
    }

    public float getPrecio()
    {
        return precio;
    }

    //setters
    public void setTitulo (String nuevoTitulo)
    {
        titulo = nuevoTitulo;
    }

    public void setAutor (String nuevoAutor)
    {
        titulo = nuevoAutor;
    }

    public void setClasificacion (String nuevoClasificacion)
    {
        titulo = nuevoClasificacion;
    }

    public void setPrecio (String nuevoPrecio)
    {
        titulo = nuevoPrecio;
    }


    //Metodo toString()
    public String toString()
    {
        String s = "";
        s += "Titulo: " + titulo;
        s += "\nAutor: " + autor;
        s += "\nClasificacion: " + clasificacion;
        s += "\nPrecio: " + precio;
        return s;
    }
}
