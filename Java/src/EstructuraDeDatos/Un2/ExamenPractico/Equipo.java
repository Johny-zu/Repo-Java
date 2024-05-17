package EstructuraDeDatos.Un2.ExamenPractico;
public class Equipo
{
    //Declarar variables
    String nombre;
    int division, jugadores;


    //Constructor
    public Equipo()
    {
        nombre = "";
        division = 0;
        jugadores = 0;
    }

    public Equipo(String nombre, int division, int jugadores)
    {
        this.nombre = nombre;
        this.division = division;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDivicion() {
        return division;
    }

    public void setDivicion(int divicion) {
        this.division = divicion;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public String toString()
    {
        String j = "";
        j += "El nombre del equipo es: " + nombre;
        j += "\nLa divicion del equipo es: " + division;
        j += "\nEl numero de jugaadores es: " + jugadores;
        return j;
    }
}
