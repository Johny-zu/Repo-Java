package EstructuraDeDatos.Un4.ListaLinealnodo;
public class ListaLinealNodoApp {
    public static void main(String[] args)
    {
        ListaLineal alumnos = new ListaLineal(); //Se crea la lista

        alumnos.recorreLista(); //Recorre lista
        alumnos.insertaInicio(new Nodo("Hugo", 87));
        alumnos.insertaInicio(new Nodo("Lulu", 97));
        alumnos.insertaInicio(new Nodo("Bety", 100));
        System.out.print("\n\n");
        alumnos.recorreLista();
    }
}


