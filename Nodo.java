//Autor: Ana María Gaviria
//Clase Nodo: Esta es mi clase vista donde muestro el menú de opciones y llamo los metodos de las clases
public class Nodo {

  Device dato;
  Nodo next;
  Nodo ant;

  Nodo(Device a) {
    dato = a;
    ant = null;
    next = null;
  }

}
