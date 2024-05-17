package Objetos.Atributos;
import java.util.Locale;
import java.util.Scanner;
public class Clase_principal {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in).useLocale(Locale.US);//Usando el .useLocale se puede aceptar en doubles puntos decimales

        String menu = "1.- Ingresa los datos de la persona" +
                    "\n2.- Estado de peso" +
                    "\n3.- Rango de edad" +
                    "\n4.- Datos generales" +
                    "\n5.- Salida";

        String nombre = "", DNI = "";
        int edad = 0;
        char sexo = 0;
        double peso = 0.0, altura = 0.0;
        System.out.printf("Ingresa el nombre del paciente: ");
        nombre = en.next();
        char op;

        //objeto
        Persona per = new Persona(nombre, DNI, edad, sexo, peso, altura);
        do {
            System.out.printf(menu + "\nIngrese una opcion a tomar: ");
            op = en.next().charAt(0);
            switch (op)
            {
                case '1' :
                    System.out.printf("Ingrese DNI: ");
                    DNI = en.next();
                    System.out.printf("Ingrese edad: ");
                    edad = en.nextInt();
                    System.out.printf("Ingrese sexo m(masculino) f(femenino): ");
                    sexo = en.next().charAt(0);
                    System.out.printf("Ingrese peso: ");
                    peso = en.nextDouble();
                    System.out.printf("Ingrese altura: ");
                    altura = en.nextDouble();
                    per.setNombre(nombre);
                    per.setDNI(DNI);
                    per.setEdad(edad);
                    per.setSexo(sexo);
                    per.setPeso(peso);
                    per.setAltura(altura);
                    break;
                case '2' : per.caluclarImc();
                    break;
                case '3' :per.rangoEdad();
                    break;
                case '4' : System.out.printf(per.toString());
                    break;
                case '5' : System.out.printf("Saliendo...");
                    break;
                default: System.out.printf("Ingrese una opcion valida");
                break;
            }
        } while (op != '5');

        en.close();
    }
}