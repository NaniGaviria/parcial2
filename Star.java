import java.util.LinkedList;
public class Star extends Lan {

  private LinkedList <Device> devices  = new LinkedList<Device>();
  private int countId = 0;

  public Star(String type, int capacity, String password){
    super(type, capacity, password);
  }

  protected void addDevice(String type){
    Device d = new Device("00"+countId, type);
    countId++;
    devices.add(d);
  }
  protected void removeDevice(int index){
    devices.remove(index);
  }
  protected void removeDevice(String id){
    for (int i = 0;i <= devices.size();i++) {
      if (devices.get(i).getId().equals(id) == true)
      devices.remove(i);
    }
  }

  protected void enviarDato(int index, String data){
    devices.get(index).setData(data);
  }

  protected String receiveData(int index){
    return devices.get(index).getData();
  }

  protected void printDevices(){
    for(int i = 0; i < devices.size(); i++){
      System.out.println(i+" Dispositivo: "+devices.get(i).getType()+" Id: "+devices.get(i).getId()+" Dato: "+devices.get(i).getData());
    }
  }


}
