package Bases;
import java.util.Scanner;
public class Ciclos {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int numero;
        System.out.print("Ingresa la tabla que quieras ver: ");
        numero = en.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + " * " + numero + ": " + (i * numero));
        }
    }
}
