package EstructuraDeDatos.Un1Arreglos.ExPractico;
public class Cono
{
    private float radio;
    private float altura;

    public Cono()
    {
        radio = 0.0f;
        altura = 0.0f;
    }
    public Cono(float radio, float altura)
    {
        this.radio = radio;
        this.altura = altura;
    }
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float areaBase()
    {
        float area;
        area = (radio*altura)/2;
        return area;
    }

    public float volumen()
    {
        float area = 0f, pi = 3.1416f;
        area = ((pi*(radio*radio))*altura)/3;
        return area;
    }

    public String toString()
    {
        String s = "";
        s += "El radio del cono es: " + radio;
        s += "\nLa altura del cono es: " + altura;
        s += "\nLa area base del cono es: " + areaBase();
        s += "\nEl volumen del cono es: " + volumen();
        return s;
    }

}