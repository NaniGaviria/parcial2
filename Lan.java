public class Lan {

  protected String tipoDeComunicacion;
  protected int capacidad;
  protected int numNodos;

  public Lan(String tipoDeComunicacion, int capacidad, String pass){
    this.tipoDeComunicacion = tipoDeComunicacion;
    this.capacidad = capacidad;
    this.pass = pass;
  }

  protected String getTipoDeComunicacion(){
    return tipoDeComunicacion;
  }
  protected int getCapacidad(){
    return capacidad;
  }
}
