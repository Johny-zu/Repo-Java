# Información del código
En esta ocación hablaremos sobre el uso de GRIDPANE LAYOUT

Es un componente de diseño que presenta sus componente secundarios en una cuadirucla, el tamaño de las celdas depende de los componentes que se muestran en el gridpane.

Las reglas que siguen son:

- Todas las celdas de la misma fila tendran la misma altura.
- todas las celdas de la misma columna tendran el mismo ancho.
- diferentes filas pueden tener diferenes alturas y diferentes columnas diferentes anchos.

Metodos que usaremos

- Usaremos .setColumnIndex() y setRowIndex o podemos sustituirlo por setConstraint()
- Usando setRowSpan podemos hacer que haga espcios especiales
- En caso de que lo hagamos con constraint, podemos aumetarlos porque vemos que usa: Nodo, la posision que tomara, y la fila, entonces le ponermos otras dos de, cuando ocupara y si se expande
- 