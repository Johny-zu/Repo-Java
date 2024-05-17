package Objetos.Tarjeta;
public class Cuenta {
    public String titular;
    public double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        String s = "";
        s += "El titular de la tarjeta es: " + getTitular();
        s += "\nLa cantidad de credito de la tarjeta es: " + getCantidad() + "\n";
        return s;
    }
}
