package EstructuraDeDatos.Un4.Practica2;
public class NodoAuto
{
    private String placa, propietario;
    private int kilometraje;
    private NodoAuto liga;

    public NodoAuto () {
        placa = "";
        propietario = "";
        kilometraje = 0;
        liga = null;
    }

    public NodoAuto (String placa, String propietario, int kilometraje) {
        this.placa = placa;
        this.propietario = propietario;
        this.kilometraje = kilometraje;
        liga = null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public NodoAuto getLiga() {
        return liga;
    }

    public void setLiga(NodoAuto liga) {
        this.liga = liga;
    }

    public float calcularPromedio()
    {
        return kilometraje/2;
    }

    public String toString( ) {
        String s = "";
        s += "La placa del vehicuo es: " + placa + "\n";
        s += "El propietario del vehiculo es: " + propietario + "\n";
        s += "El kilometraje del vehiculo es: " + kilometraje + " km";
        s += "\n\n";
        return s;
    }
}