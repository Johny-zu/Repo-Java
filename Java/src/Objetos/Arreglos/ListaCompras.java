package Objetos.Arreglos;

public class ListaCompras {
    public String descripcion;
    public double precio;
    public ListaCompras(String descripcion, double precio)
    {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString()
    {
        String s = "";
        s += "El nombre del articulo es: " + getDescripcion();
        s += "\nEl precio del articulo es: " + getPrecio() + "\n";
        return s;
    }

    public boolean estaVacio() {
        return getDescripcion() == null || getPrecio() == 0;
    }
}