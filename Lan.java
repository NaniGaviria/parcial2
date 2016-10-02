public class Lan {

  protected String tipoDeComunicacion;
  protected int capacidad;
  protected int numNodos;

public Lan(String tipoDeComunicacion,int capacidad){
  this.tipoDeComunicacion = tipoDeComunicacion;
  this.capacidad = capacidad;
}

protected String getTipoDeComunicacion(){
  return tipoDeComunicacion;
}
protected int getCapacidad(){
  return capacidad;
}
protected void setTipoDeComunicacion(){
  this.tipoDeComunicacion = tipoDeComunicacion;
}
protected void setCapacidad(){
  this.capacidad = capacidad;
}

}
