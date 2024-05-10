# Información necesaria
Al crear un nuevo apartado primero creamos 2 clases, main y controller, y un archivo FXML, cada uno ira en su lugar correspondientes de carpetas.

Siguiente de este se debe actualizar también el module-info.java para que pueda aceptar una nueva GUI y pueda hacer correr de manera correcta el main.

Los pasos que se tienen que tener en cuenta son los suiuientes:
1.  module.info: en esta seccion se le pondra la referencia que hara posible el reconocmiento de las clases que les quereamos insertar, en caso de esta nueva carpteta contenedora escribi.
- opens com.isb.ComponentesGUI to javafx.fxml;
-  exports com.isb.ComponentesGUI;

Se usaron con el fin de que open pueda abrir y reconocer el directorio donde estamos trabajanod el FXML, en caso de el export estamos haciendo que las clases se agregen al modulo de informacion, si no ponemos ambas, no funcionaran. 

2. En la clase FXML se tiene que hacer uso de lo suiguiente.
- xmlns="http://javafx.com/javafx/17.0.2-ea"
   - xmlns:fx="http://javafx.com/fxml/1"
   - fx:controller="com.isb.ComponentesGUI.ControladorGUI"

Esto ira en el code de Scene builder con el fin de que se pueda responder, dentro de los primeros dos se pone por defecto, pero se tiene que escribir el fx:controller con el controlador que eestaras dandole uso en tu programa.

 3. En la clase de controlador para hacer que se pueda interactuar con la interfaz grafica se usara
    - FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("componentes-view.fxml"))

 En este objeto se hace con el fin de que pueda tomar del directorio de resourse el FXML y lo que viene en comiilas como se puede intuir, es el nombre del archivo FXML.

# Información del codigo
En esta practica haremos una interfaz usando los controladores basicos