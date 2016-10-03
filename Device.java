public class Device {

  String tipo = "";
  String dato = "";
  String id = "";

  public Device(int id, String tipo){
    this.tipo = tipo;
    this.id = id;
  }
  public String getId(){
    return id;
  }
  public void setDato(String dato){
    this.dato = dato;
  }
  public String getDato(){
    return dato;
  }
  public String getTipo(){
    return tipo;
  }

}
