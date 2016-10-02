public class Anillo extends Lan {

  protected String pass = "";
  ListaCircularDoble anillo;

  public Anillo(String tipoDeComunicacion, int capacidad, String pass){
    super(tipoDeComunicacion, capacidad, pass);
    anillo = new ListaCircularDoble();
  }

  public void insertarNodo() {

  }

}
