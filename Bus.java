public class Bus extends Lan {

  protected String pass = "";

    public Bus(tipoDeComunicacion,String capacidad,String pass){
      super(tipoDeComunicacion,capacidad);
      this.pass = pass;
    }

}
