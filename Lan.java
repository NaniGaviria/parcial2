public class Lan {

  protected String tipoDeComunicacion;
  protected String capacidad;
  protected int numNodos;

public Lan(String tipoDeComunicacion,String capacidad){
  this.tipoDeComunicacion = tipoDeComunicacion;
  this.capacidad = capacidad;
}

protected String getTipoDeComunicacion(){
  return tipoDeComunicacion;
}
protected String getCapacidad(){
  return capacidad;
}
protected void setTipoDeComunicacion(){
  this.tipoDeComunicacion = tipoDeComunicacion;
}
protected void setCapocidad(){
  this.capacidad = capacidad;
}

}
