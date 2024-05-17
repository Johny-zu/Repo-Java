# Ciclos de vida
Hablaremos aqui de como son ingresados paso a paso los metodos y como son ejecutados por el programa en tema de prioridad.

## Constructor
Este es el primero que se carga puesto que hace el trabajo de construccion de los metodos que seran usados en la clase

## Init
Este metodo es el segundo en inicializarse a la hora de hacer un trabajo en la clase principal.

En esta se hace primero algunas funciones de metodos como configuraciones iniciales o inicializar una BD entro otros.

Otra cosa cosa a remarcar es que en el metodo initi no se puede ingresar la parte grafica porque la instancia aun no esta preparado para su visualización.

## Start
Aqui el api de javaFX esta lista para trabar los componentes de interfaz grafica y es lo que principalmente hace, el trabajar con la parte grafica.

Crea las cosas como las imagenes, formato, nodos y lo que se ocupe dentro de la interfaz grafica.

Tambien vermos que en start funciona con el controlador que se encuntra por default dentro de la clase.

El metodo start se maneja metodos como el stage que es lo que hace la ventana, esta maneja un titulo, una escena y muestra en una ventana que es el stage.

Los nodos son las funciones como los botones, los textFields entre otros.

El metodo title, le da un titulo a la ventana, el metodo de scene le da una vista a esta parte visual para que se pueda ver lo que contiene cada nodo y la estructura de la pagina como va quedando y por ultimo vemos el meotod show que hara que esto pueda ser visible para el usuario, es una impresion de ventana.

## Stop
Este como se puede observar sera el ultimo metodo en ejecutarse para terminar los procesos.

Esta por lo general ya esta activa en la interfaz grafica que es cuando pulsamos la tacha de la esquina superior derecha para cerrar el programa y terminar la ejecucion de este.

Sirve para hacer .close() de las cosas que trabajanmos, como cerrar una BD, o asi.

Esta hace solo el metodo que se encuentra mensajeado en el public void Stop

## Main
Despues de ver como funciona y hacer ejercicios basicos nos damos cuenta que pues no correra la clase y no hara nada para que funcione a menos que tengamos el metodo main, este metodo contiene ciertas cosas que debemos conocer para hacer uso correcto de esta.

Los metodos que usa la clase main varios, estos haran funcoinar las cosas de manera correcta para que no halla conflictos y el codigo pueda ser ejecutado de manera correcta, los metodos que usa o puede usar la clase main serian los siguientes:

launch: este metodo hace que podamos lanzar la parte grafica y todo.