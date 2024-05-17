package Objetos.Arreglos;

import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in).useLocale(Locale.US);
        String menu = "1.- Datos de los productos" +
                    "\n2.- Lista de productos" +
                    "\n3.- Total de las compras" +
                    "\n4.- Producto mas caro y barato" +
                    "\n5.- Salida";
        String descripcion = "";
        double precio = 0;
        char op;

        System.out.printf("Ingrese el numero de productos: ");
        int n = en.nextInt();

        ListaCompras [] listaA = new ListaCompras[n];
        boolean listaVacia = true;

        do{
            System.out.printf(menu + "\nIngrese una opcion: ");
            op = en.next().charAt(0);
            switch (op)
            {
                case '1' : //hacemos un metodo para verificar el estado de la lista
                    boolean listaLlena = true; // Ponemos la variable lleno para usarlo despues
                    for (int i = 0; i < listaA.length; i++) {
                        if (listaA[i] == null) { // Revisamos que la lista este vacia
                            listaLlena = false;
                            break; // Salimos del bucle porque no esta lleno el arreglo
                        }
                    }

                    if (listaLlena) {
                        System.out.println("La lista ya está llena.");
                    } else {
                        for (int i = 0; i < listaA.length; i++) {
                            if (listaA[i] == null) { //
                                System.out.printf("Ingrese el nombre del producto " + (i + 1) + ": ");
                                descripcion = en.next();
                                System.out.printf("Ingrese el precio de " + descripcion + ": ");
                                precio = en.nextDouble();
                                listaA[i] = new ListaCompras(descripcion, precio);
                            }
                        }
                    }
                    break;
                case '2' : //mostramos la lista revisando que no este vacia
                    for (int i = 0; i < listaA.length; i++) {
                        if (listaA[i] != null && !listaA[i].estaVacio()) {
                            System.out.println(listaA[i].toString());
                            listaVacia = false;
                        }
                    }
                    if (listaVacia)
                        System.out.println("La lista de productos está vacía.");
                    break;
                case '3' : if (listaA == null || listaA.length == 0) {
                    System.out.println("La lista de productos está vacía.");
                } else {
                    double total = 0;
                    for (int i = 0; i < listaA.length; i++) {
                        if (listaA[i] != null) { // Verificar si el elemento actual no es null antes de acceder a su precio
                            total += listaA[i].getPrecio();
                        }
                    }
                    System.out.printf("No hay productos en la lista\n");
                }
                    break;
                case '4' :
                    if (listaA == null || listaA.length == 0) {
                        System.out.println("La lista de productos está vacía.");
                    } else {
                        double max = listaA[0].getPrecio();
                        double min = listaA[0].getPrecio();

                        for (int i = 1; i < listaA.length; i++) {
                            double precioActual = listaA[i].getPrecio();
                            if (precioActual > max)
                                max = precioActual;
                            if (precioActual < min)
                                min = precioActual;
                        }
                        System.out.printf("El precio más alto es: %.2f\n", max);
                        System.out.printf("El precio más bajo es: %.2f\n", min);
                    }
                    break;
                case '5' : System.out.printf("Saliendo...");
                    break;
                default: System.out.printf("Ingrese una opcion valida");
                    break;
            }
        } while(op != '5');
        en.close();
    }
}