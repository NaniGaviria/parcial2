public class MainListaCircularDoble {

  public static void main(String[]args) {

    ListaCircularDoble x=new ListaCircularDoble();
    int a = 5;
    int b = 10;
    int c = 15;
    int d = 20;
    int e = 25;
    int f = 30;

    /* Esto sirve para medir el tiempo de ejecución.
    long time_start, time_end;
    time_start = System.nanoTime();
    // aquí va el método a medir
    time_end = System.nanoTime();
    System.out.println("the task has take "+ (( time_end - time_start )/1000) +" milliseconds");
    */

    x.alta(a);
    x.alta(b);
    x.alta(c);
    x.alta(d);
    x.alta(e);
    x.alta(f);

    System.out.println("Valores iniciales:\n");
    x.imprimir();
    x.bajaxposicion(0);
    System.out.println("\nDespues de borrar la Posicion 3:\n");
    x.imprimir();

  }
}
