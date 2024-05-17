package Objetos.Atributos;

public class Persona {
    public String nombre, DNI;
    public int edad;
    char sexo;
    double peso, altura;

    public Persona(String nombre, String DNI, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String genero()
    {
        String obternerGenero = "";
        if(getSexo() == 'm' )
            obternerGenero = "Masculino";
            else if(getSexo() == 'f')
                obternerGenero = "Femenino";
            else
                obternerGenero = "Sin genero";

        return obternerGenero;
    }

    public void caluclarImc()
    {
        double imc;
        imc = getPeso()/Math.pow(getAltura(),2);
        if (imc < 20)
            System.out.printf("Por debajo del recomendado\n");
        else if (imc >= 20 && imc <= 25)
            System.out.printf("Peso ideal");
        else
            System.out.printf("Por encima del recomendado\n");
    }

    public void rangoEdad()
    {
        if (getEdad() < 18)
            System.out.printf("Es menor de edad\n");
        else if (getEdad() >= 18 && getEdad() <= 60)
            System.out.printf("Edad adulta\n");
        else if(getEdad() > 60)
            System.out.printf("tercera edad\n");
        else
            System.out.printf("no nacido o rango no identificado\n");
    }

    public String toString()
    {
        String s = "";
        s += "El nombre del ciudadano es: " + getNombre();
        s += "\nTiene " + getEdad();
        s += "\nSu DNI es: " + getDNI();
        s += "\nSu genero es: " + genero();
        s += "\nSu peso es: " + getPeso();
        s += "\nSu altura es: " + getAltura() + "\n";
        return s;
    }
}
