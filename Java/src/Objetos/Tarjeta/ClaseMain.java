package Objetos.Tarjeta;

import java.util.Scanner;

public class ClaseMain {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        String menu = "1.- Ingresar dinero" +
                "\n2.- Retirar dinero" +
                "\n3.- Datos" +
                "\n4.- Salir";
        char op;

        String titular;
        double cantidad = 0;

        System.out.printf("Ingresa el nombre de la tarjeta: ");
        titular = en.next();
        Cuenta c = new Cuenta(titular, cantidad);

        do{
            System.out.printf(menu + "\nIngrese una opcion: ");
            op = en.next().charAt(0);
            switch (op)
            {
                case '1' :
                    System.out.printf("Ingresa la cantidad a meter: ");
                    cantidad = en.nextDouble();
                    c.setCantidad(c.getCantidad() + cantidad);
                break;
                case '2' : if(c.getCantidad() <= 0)
                    System.out.printf("El tarjeta no tiene credito\n");
                else {
                    System.out.printf("Ingresa la cantidad a retirar: ");
                    cantidad = en.nextDouble();
                    if (cantidad > c.getCantidad())
                        System.out.printf("No se puede retirar");
                    else
                        c.setCantidad(c.getCantidad() - cantidad);
                    System.out.printf("\n");
                }
                break;
                case '3' : System.out.printf(c.toString());
                    break;
                case '4' : System.out.printf("Saliendo...");
                break;
                default : System.out.printf("Ingrese una opcion valida");
                break;
            }
        }while(op != '4');
        en.close();
    }
}
