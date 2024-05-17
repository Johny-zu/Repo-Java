package EstructuraDeDatos.Un2.Practica3;

public class Articulo
{
    private String descripcion;
    private int cantidad;
    private float precio;

    public Articulo()
    {
        descripcion = "";
        cantidad = 0;
        precio = 0.0f;
    }
    public Articulo(String descripcion, int cantidad, float precio)
    {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }


    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString()
    {
        String s="";
        s += "La  descripcion es: " + descripcion;
        s += "La cantidad es: " + cantidad;
        s += "El precio es: " + precio;
        return s;
    }
}
