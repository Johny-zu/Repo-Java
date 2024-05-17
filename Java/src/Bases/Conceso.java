package Bases;
import java.util.Arrays;
import java.util.Scanner;

public class Conceso {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int n;

        System.out.print("Ingresa el numero de estudiantes: ");
        n = en.nextInt();
        en.nextLine();

        String [] estudiantes = new String [n];
        int [][] calificaciones = new int[n][3];
        for(int i = 0; i < n; i++)
        {
            System.out.printf("Ingrese el nombre del estudiante " + (i+1) + ": ");
            estudiantes[i] = en.next();
            for (int s = 0; s < 3; s++) {
                System.out.printf("Ingrese la calificacion %d :", (s + 1));
                calificaciones[i][s] = en.nextInt();
            }//Fin del for de calificaciones
            en.nextLine();
        }//Fin del ingreso del arreglo

        //calculamos promedio de calificacoines
        for(int i = 0; i < n; i++)
        {
            int suma = 0;
            for(int j = 0; j < 3;j++)
            {
                suma += calificaciones[i][j];
            }
            double promedio = suma/3.0;
            System.out.printf("El promedio de calificaciones de %s es %.2f\n", estudiantes[i], promedio);
        }

        for(int i = 0; i < n; i++)
        {
            int max = calificaciones[i][0];
            int min = calificaciones[i][0];
            for(int j = 0;j < 3; j++)
            {
                if (calificaciones[i][j] > max) {
                    max = calificaciones[i][j];
                }
                if (calificaciones[i][j] < min) {
                    min = calificaciones[i][j];
                }
            }
            System.out.printf("Para %s, la calificación más alta es %d y la más baja es %d\n", estudiantes[i], max, min);
        }

        double maxPromedio = Double.MIN_VALUE;
        double minPromedio = Double.MAX_VALUE;
        String estudianteMaxPromedio = "";
        String estudianteMinPromedio = "";

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += calificaciones[i][j];
            }
            double promedio = sum / 3.0;
            if (promedio > maxPromedio) {
                maxPromedio = promedio;
                estudianteMaxPromedio = estudiantes[i];
            }
            if (promedio < minPromedio) {
                minPromedio = promedio;
                estudianteMinPromedio = estudiantes[i];
            }
        }

        System.out.println("El estudiante con el promedio más alto es: " + estudianteMaxPromedio);
        System.out.println("El estudiante con el promedio más bajo es: " + estudianteMinPromedio);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (calificaciones[i][j] < 60) {
                    System.out.printf("%s necesita mejorar en la asignatura %d\n", estudiantes[i], (j + 1));
                    break;
                }
            }
        }
        en.close();
    }
}