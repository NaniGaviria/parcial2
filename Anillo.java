public class Anillo extends Lan {

  ListaCircularDoble anillo;

  public Anillo(String tipoDeComunicacion, int capacidad, String pass){
    super(tipoDeComunicacion, capacidad, pass);
    anillo = new ListaCircularDoble();
  }

  public void insertarNodo() {
    anillo.insertar();
  }

}
