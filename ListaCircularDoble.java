public class ListaCircularDoble {
  Nodo primero;
  Nodo ultimo;

  ListaCircularDoble() {
    primero = null;
    ultimo = null;
  }

  public boolean vacio() {
    if(primero == null) return true;
    else return false;
  }

  public void insertar(Device dato) {
    if(vacio()) {
      Nodo nuevo = new Nodo(dato);
      primero = nuevo;
      ultimo = nuevo;
      nuevo.next = nuevo;
      nuevo.ant = nuevo;
    } else {
      Nodo nuevo = new Nodo(dato);
      ultimo.next = nuevo;
      nuevo.ant = ultimo;
      primero.ant = nuevo;
      nuevo.next = primero;
      ultimo = nuevo;
    }
  }

  public boolean eliminarPorPosicion(int dato) {
    Nodo actual = primero;
    Nodo anterior;
    Nodo siguiente;
    for(int i = 0;i <= dato;i++) {
      if(actual == ultimo) {
        if(i < dato) return false;
        else {
          if(i == dato) {
            anterior = actual.ant;
            anterior.next = primero;
            primero.ant = anterior;
            ultimo = anterior;
            return true;
          }

        }

      } else {
        if(dato == 0) {
          siguiente = actual.next;
          siguiente.ant = ultimo;
          ultimo.next = siguiente;
          primero = siguiente;
          return true;
        }
        if(dato == i) {
          anterior = actual.ant;
          siguiente = actual.next;
          anterior.next = siguiente;
          siguiente.ant = anterior;
          return true;
        }
      }
      actual = actual.next;
    }
    return false;
  }


  public void imprimir() {
    Nodo actual;
    actual = primero;
    while(actual != ultimo) {
      System.out.println(actual.dato);
      actual=actual.next;
    }
    System.out.println(actual.dato);

  }

}
