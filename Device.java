public class Device{

  String tipo = "";
  String dato = "";
  String id = "";

  public Device(String tipo, String id){
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
  public void setTipo(String tipo){
    this.tipo=tipo;
  }
  public String getTipo(){
    return tipo;
  }

}
