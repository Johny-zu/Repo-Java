package Bases;
import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int n = 0;

        System.out.print("Ingrese un valor para el arreglo: ");
        n = en.nextInt();
        int [] edades = new int [n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Ingresa edades: ");
            edades[i] = en.nextInt();
        }

        String impresionArreglo = Arrays.toString(edades);
        System.out.println("Las edades son: " + impresionArreglo);
    }
}
