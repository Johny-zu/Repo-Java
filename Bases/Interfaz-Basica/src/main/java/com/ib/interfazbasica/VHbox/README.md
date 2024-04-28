# Informacón del código.
En esta ocacion hablaremos sobre VBox, que organiza los nodos o componentes uno debajo de otro como si fuera un stock, es como una matriz de n filas.

Tambien hablaremos sobre el HBox que en ve de organizar verticalmente se hara horizontalmente.

### Actividad.
En esta ocacion haremos un pequeño login que servira para implementar lo que haremos y asi entender de manera practica que se va a hacer.

### Componentes que usaremos.
#### -Label.
Esta de aqui sirve para poner etiquetas.
#### -TextField.
Este sirve para recolectar la informacion del input.

Cada textfield puede cambiar dependiendo los parametros que les llegues a dar como se ve en el codigo.
#### -Button.
boton para aceptar y salir.
#### -GetChildren()
Nos dejara tener el listado de todos los nodos hijos pertenecientes a ese nodo.
(Se parece a un constructor)

La diferencia seria que se puede estar metiendo en el orden que quieras para un acomodo mejor de los elementos.
El que usamos ahora es un vertical Box.
#### -setPromptText
Muestra un texto informativo de lo que debe tener el textfield.
#### -InputStream e Image
Con estos dos se pueden argar una imagen para que esta pueda ser vista dentro del login.
#### -HBox.setHgrow
Con esto hacemos que se redmensionar cada vez que se acrualiza las dimenciones de las ventanas.
#### -setPreserveRatio();
Con esta propiedad tenemos control sobre  la relación de aspecto