import java.util.*;
public class Estrella extends Lan {

  private LinkedList <Device> devices  = new LinkedList<Device>();
  private int countId = 0;

  public Estrella(String tipoDeComunicacion, int capacidad, String pass){
    super(tipoDeComunicacion, capacidad, pass);
  }

  protected void addDevice(String tipo){
    Device d = new Device("00"+countId, tipo);
    countId++;
    devices.add(d);
  }
  protected void removeDevice(int index){
    devices.remove(index);
  }
  protected void removeDevice(String id){
    for (int i = 0;i <= devices.size();i++) {
      if (devices.get(i).getId().equals(id)==true)
      devices.remove(i);
    }
  }

  protected void enviarDato(int index,String dato){
    devices.get(index).setDato(dato);
  }

  protected String recibirDato(int index){
    return devices.get(index).getDato();
  }

  protected void printDevices(){
    for(int i = 0; i < devices.size(); i++){
      System.out.println(i+" Dispositivo: "+devices.get(i).getTipo()+" Id: "+devices.get(i).getId()+" Dato: "+devices.get(i).getDato());
    }
  }


}
