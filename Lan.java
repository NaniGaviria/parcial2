//Autor: Ana María Gaviria
//CLase Lan: Esta es mi clase padre llamada lan, tiene varios atributos que heredaran los hijos
public class Lan {

  //Creo mis variables protected para que puedan ser heredadas
  protected String tipoDeComunicacion;
  protected String pass;
  protected int capacidad;
  protected int numNodos;

  //Creo el constructor de mi clase padre
  public Lan(String tipoDeComunicacion, int capacidad, String pass){
    this.tipoDeComunicacion = tipoDeComunicacion;
    this.capacidad = capacidad;
    this.pass = pass;
  }

  //Creo dos metodos protected que retornan
  protected String getTipoDeComunicacion(){
    return tipoDeComunicacion;
  }
  protected int getCapacidad(){
    return capacidad;
  }
}
