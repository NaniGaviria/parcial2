//Autor: Ana María Gaviria
//Clase estrella: Creo mi clase Estrella que heredará parametros de Lan
import java.util.*;
public class Estrella extends Lan {

  //Lista de tipo dispositivo
  private LinkedList <Device> devices  = new LinkedList<Device>();
  private int countId = 0; //Aqui asigno el numero del dispositivo

  //Constructor de mi clase estrella que hereda parametros de lan
  public Estrella(String tipoDeComunicacion, int capacidad, String pass){
    super(tipoDeComunicacion, capacidad, pass);
  }

  protected void addEquipo(String tipo){
    Device d = new Device("00"+countId, tipo);
    countId++;
    devices.add(d);
  }

  protected void removeEquipo(int index){
    devices.remove(index);
  }

  protected void removeEquipo(String id){
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

  protected void printEquipo(){
    for(int i = 0; i < devices.size(); i++){
      System.out.println(i+" Dispositivo: "+devices.get(i).getTipo()+" Id: "+devices.get(i).getId()+" Dato: "+devices.get(i).getDato());
    }
  }


}
