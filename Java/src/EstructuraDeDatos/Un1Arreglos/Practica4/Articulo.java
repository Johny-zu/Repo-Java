package EstructuraDeDatos.Un1Arreglos.Practica4;
public class Articulo
{
    private String descripcion;
    private int cantidad;
    private float precio;

    //Constructor
    public Articulo()
    {
        descripcion = "";
        cantidad = 0;
        precio = 0.0f;
    }
    //Constructor para diferenciar
    public Articulo(String descripcion, int cantidad, float precio)
    {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    //Metodos get and set
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String nuevaDescripcion) {
        descripcion = nuevaDescripcion;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int nuevaCantidad) {
        cantidad = nuevaCantidad;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float nuevoPrecio) {
        precio = nuevoPrecio;
    }

    //Metodo toString()
    public String toString()
    {
        String s = "";
        s += "\nDescripción: : " + descripcion;
        s += "\nLa cantidad es: " + cantidad;
        s += "\nEl precio es: " + precio;
        return s;
    }
}
