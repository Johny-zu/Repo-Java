# Información de la estructura del código
En esta seccion hablaremos sobre el controler, mas que informacion que se requiere para hacer uso del controler y este conectado correctamente el FXML para que la GUI pueda ser usada de manera correcta.


## Clase controller
Se agraga una adicion a la clase controller lo siguiente.
    
1. implements Initializable
2. public void initialize(URL location, ResourceBundle resources) {}
3. @FXML
4. FXMLLoader

La primera sirve con el fin de aplicar la clase de Initializable para trabajar en conjunto con el XFML.

La segunda servira para hacer los procesos que queramos hacer en la clase como los componentes de la gui, como colores o cualquie cosa que se pueda hacer, no se llama al metodo constructor porque se trata de un init y no del start.
Los parametros que se ven en este metodo los voy a explicar.
- URL location: Esta sera la ubicacion de nuestra interfaz grafica que es el FXML.
- ResourceBundle: Este es utilizado en caso de ser una aplicacion multiidioma y siele ser util para internacionalizar el programa.

El tercer punto es una notacion @FXML este sirve para hacer una llamada al a GUI y tomando los nombres de los ID para hacer trabajar, se debe tener en cuenta las cosas como la privacitacion o las cosas que se requieran como los nombres y las especificaciones del objeto.

La propiedad de FXMLLoader sirve para traer desde el resource la GUI y pueda ser vista en el programa que corre el main para poder tener la vista de lo que hay en la GUI, dependiendo de como este estructurado se debe ir actualizando en caso de tener una nueva interfaz y sea necesario cambiar la ruta con el fin de que se pueda ver correctamente o simplemente se necesiten hacer varios controlers y clases y con ello, nuevos archivos FXML.