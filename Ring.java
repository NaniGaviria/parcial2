public class Ring extends Lan {

  DoublyCircularList ring;
  Device device;
  private int countId = 0;

  public Ring(String tipoDeComunicacion, int capacidad, String pass){
    super(tipoDeComunicacion, capacidad, pass);
    ring = new DoublyCircularList();
  }

  protected void addDevice(String tipo){
    device = new Device("00"+countId, tipo);
    countId++;
    ring.add(device);
  }

  // public void addDevice(String id, String tipo) {
  //   device = new Device(id, tipo);
  //   ring.insertar(device);
  // }

  public void removeDevice(int index) {
    ring.eliminarPorPosicion(index);
  }

}
