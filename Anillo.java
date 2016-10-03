//Autor: Ana María Gaviria
//Clase Anillo: Creo mi clase anillo que heredara parametros de Lan
public class Anillo extends Lan {

  ListaCircularDoble anillo; //Objeto de tipo ListaCircularDoble
  Device equipo; //Objeto tipo Device
  private int countId = 0;

  //Mi constructor de la clase anillo que hereda los parametros de lan
  public Anillo(String tipoDeComunicacion, int capacidad, String pass){
    super(tipoDeComunicacion, capacidad, pass);
    anillo = new ListaCircularDoble();
  }

  //Metodo que permite agregar un equipo (Este me los enumera)
  protected void addEquipo(String tipo){
    equipo = new Device("00"+countId, tipo);
    countId++;
    anillo.insertar(equipo);
  }

  //Metodo que permite remover el equipo
  public void removeEquipo(int index) {
    anillo.eliminarPorPosicion(index);
  }

}
