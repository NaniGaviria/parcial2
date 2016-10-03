//Autor: Ana María Gaviria
//Clase Device: Esta es mi clase device quien tendra las caracteristicas de cada equipo
public class Device {

  //Creo mis atributos
  String tipo;
  String dato = "";
  String id;

  public Device(String id, String tipo){
    this.tipo = tipo;
    this.id = id;
  }

  //Creo los metodos de la clase
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
