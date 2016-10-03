public class Anillo extends Lan {

  ListaCircularDoble anillo;
  Device device;

  public Anillo(String tipoDeComunicacion, int capacidad, String pass){
    super(tipoDeComunicacion, capacidad, pass);
    anillo = new ListaCircularDoble();
  }

  public void insertarNodo(String id, String tipo) {
    device = new Device(id, tipo);
    anillo.insertar(device);
  }

}
