public class Anillo extends Lan {

  protected String pass = "";
  ListaCircularDoble anillo;

  public Anillo(String tipoDeComunicacion,int capacidad,String pass){
    super(tipoDeComunicacion,capacidad);
    this.pass = pass;
    anillo = new ListaCircularDoble();
  }

  

}
