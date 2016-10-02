
import java.util.*;
public class Estrella extends Lan {

ArrayList <Device> devices  = new ArrayList<Device>();
private String pass = "";
private String  medio = "";//medio de transmision alambrico o inalambrico

  public Estrella(String tipoDeComunicacion,int capacidad,String pass, String medio){
    super(tipoDeComunicacion,capacidad);
    this.pass = pass;
    this.medio = medio;
  }

private String getPass(){
  return pass;
}
private void setPass(){
  this.pass = pass;
}
private String getMedio(){
  return medio;
}
private void setMedio(){
  this.medio = medio;
}

private void addDevice(String tipo){
  Device d = new Device(tipo);
  devices.add(d);
}
private void removeDevice(int index){
  devices.remove(index);
}

private void enviarDato(int index,String dato){
  devices.get(index).setDato(dato);
}
private String recibirDato(int index){
  return devices.get(index).getDato();
}
private void printDevices(){

   for(int i = 0; i < devices.size(); i++){
     System.out.println(i+" Dispositivo: "+devices.get(i).getTipo()+" Dato"+devices.get(i).getTipo());
  }
}


}
