package Bases;
import java.util.Scanner;
public class Condicionales {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int a,b,c;

        System.out.print("Ingresa el valor de a: ");
        a = en.nextInt();
        System.out.print("Ingresa el valor de b: ");
        b = en.nextInt();
        System.out.print("Ingresa el valor de c: ");
        c = en.nextInt();

        if(a > b && a > c)
            System.out.print("El mayor es: " + a);
        else if (b > a && b > c)
            System.out.print("El mayor es: " + b);
        else
            System.out.print("El mayor es: " + c);

        en.close();
    }
}
