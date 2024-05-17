package EstructuraDeDatos.Un1Arreglos.Practica2;
public class Pentagono
{
    private float lado, apotema;

    //Primer constructor
    public Pentagono()
    {
        float lado = 0f;
        float apotema = 0f;
    }
    public Pentagono(float lado, float apotema)
    {
        this.lado = lado;
        this.apotema = apotema;
    }
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    public float getApotema() {
        return apotema;
    }
    public void setApotema(float apotema) {
        this.apotema = apotema;
    }
    public String toString()
    {
        String s = "";
        s += "El lado del pentagono es: " +  lado;
        s += "El apotema del pentagono es: " + apotema;
        return s;
    }

    public float CalcularPerimetro()
    {
        float perimetro = lado++;
        return perimetro;
    }

    public float CalcularArea()
    {
        float a;
        a = (CalcularPerimetro() * apotema) / 2;
        return a;
    }
}