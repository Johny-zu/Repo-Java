package Bases;

import java.util.Scanner;

public class InserccionConsola {
    public static void main(String[] args) {
        int a;
        double b;
        boolean c;
        char d;

        Scanner en = new Scanner(System.in);

        System.out.printf("Ingrese un valor entero: ");
        a = en.nextInt();
        System.out.printf("Ingrese un valor decimal: ");
        b = en.nextDouble();
        System.out.printf("Ingrese true o false: ");
        c = en.nextBoolean();
        System.out.printf("Ingrese un caracter: ");
        d = en.next().charAt(0);

        System.out.println("Valor entero: " + a +
                            "\nValor decimal: " + b +
                            "\nRespuesta: " + c +
                            "\nCaracter: " + d);
        // Usando \n se hace un salto de linea
    }
}
