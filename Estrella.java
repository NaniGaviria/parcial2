
import java.util.*;
public class Estrella extends Lan {

  private ArrayList <Device> devices  = new ArrayList<Device>();
  private String pass = "";
  private String  medio = "";//medio de transmision alambrico o inalambrico
  private int countId=0;

  public Estrella(String tipoDeComunicacion,int capacidad,String pass, String medio){
    super(tipoDeComunicacion,capacidad);
    this.pass = pass;
    this.medio = medio;
  }

  protected String getPass(){
    return pass;
  }
  protected void setPass(){
    this.pass = pass;
  }
  protected String getMedio(){
    return medio;
  }
  protected void setMedio(){
    this.medio = medio;
  }

  protected void addDevice(String tipo){
    Device d = new Device(tipo,countId);
    countId++;
    devices.add(d);
  }
  protected void removeDevice(int index){
    devices.remove(index);
  }

  protected void enviarDato(int index,String dato){
    devices.get(index).setDato(dato);
  }
  protected String recibirDato(int index){
    return devices.get(index).getDato();
  }
  protected void printDevices(){

    for(int i = 0; i < devices.size(); i++){
      System.out.println(i+" Dispositivo: "+devices.get(i).getTipo()+" Dato: "+devices.get(i).getDato());
    }
  }


}
