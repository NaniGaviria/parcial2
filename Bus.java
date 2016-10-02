import java.util.*;
public class Bus extends Lan {

  private ArrayList <Device> devices  = new ArrayList<Device>();
  //Creo las variables private (únicas de esta clase)
  private String pass = "";
  private String  medio = "";//medio de transmision alambrico o inalambrico
  private int countId=0;

    public Bus(String tipoDeComunicacion,int capacidad,String pass, String medio){

      super(tipoDeComunicacion,capacidad);
      this.pass = pass;
      this.medio = medio;
    }

    
    //Método para agregar un dispositivo a la red
    protected void addDevice(String tipo){
      Device d = new Device(tipo,"00"+countId);
      countId++;
      devices.add(d);
    }

    //Método para quitar un dispositivo
    protected void removeDevice(int index){
      devices.remove(index);
    }

    //Método para enviar datos
    protected void enviarDato(int index,String dato){
      devices.get(index).setDato(dato);
    }

    //Método para recibir datos
    protected String recibirDato(int index){
      return devices.get(index).getDato();
    }

    //Método para imprimir la cantidad de dispositivos
    protected void printDevices(){

      for(int i = 0; i < devices.size(); i++){
        System.out.println(i+" Dispositivo: "+devices.get(i).getTipo()+" Id: "+devices.get(i).getId()+" Dato: "+devices.get(i).getDato());
      }
    }



}
