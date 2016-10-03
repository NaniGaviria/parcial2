import java.util.ArrayList;
public class Bus extends Lan {

  private ArrayList <Device> devices  = new ArrayList<Device>();
  //Creo las variables private (únicas de esta clase)
  private String pass = "";
  private String  medio = "";//medio de transmision alambrico o inalambrico
  private int countId = 0;

  public Bus(String type, int capacity, String password){

    super(type, capacity, password);
  }

  //Método para agregar un dispositivo a la red
  protected void addDevice(String type){
    Device d = new Device(type,"00"+countId);
    countId++;
    devices.add(d);
  }

  //Método para quitar un dispositivo
  protected void removeDevice(int index){
    devices.remove(index);
  }

  //Método para enviar datos
  protected void enviarDato(int index, String data){
    devices.get(index).setData(data);
  }

  //Método para recibir datos
  protected String receiveData(int index){
    return devices.get(index).getData();
  }

  //Método para imprimir la cantidad de dispositivos
  protected void printDevices(){

    for(int i = 0; i < devices.size(); i++){
      System.out.println(i + " Dispositivo: "+ devices.get(i).getType()+" Id: "+ devices.get(i).getId()+" Dato: " + devices.get(i).getData());
    }
  }



}
