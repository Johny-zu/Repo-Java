package EstructuraDeDatos.Un1Arreglos.Practica1;
public class LibroApp {

    public static void main(String[] args)
    {
        Libro lib1, lib2; //Solo crea la referencia pero aun no existe el objeto
        lib1 = new Libro();
        lib2 = new Libro("El principito", "Antonio", 'A', 345.0f);
        System.out.println("1er. libro: \n" + lib1);
        System.out.println("\n \n2do. libro: \n" + lib2);
    }
}
