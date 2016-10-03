public class Anillo extends Lan {

  ListaCircularDoble anillo;
  Device device;
  private int countId = 0;

  public Anillo(String tipoDeComunicacion, int capacidad, String pass){
    super(tipoDeComunicacion, capacidad, pass);
    anillo = new ListaCircularDoble();
  }

  protected void addDevice(String tipo){
    device = new Device("00"+countId, tipo);
    countId++;
    anillo.insertar(device);
  }

  // public void addDevice(String id, String tipo) {
  //   device = new Device(id, tipo);
  //   anillo.insertar(device);
  // }

  public void removeDevice(int index) {
    anillo.eliminarPorPosicion(index);
  }

}
