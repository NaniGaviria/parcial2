public class Bus extends Lan {

  protected String pass = "";

    public Bus(String tipoDeComunicacion,int capacidad,String pass, String medio){

      super(tipoDeComunicacion,capacidad);
      this.pass = pass;
    }

    //Metodo get y set de Pass
    protected String getPass(){
      return pass;
    }
    protected void setPass(){
      this.pass = pass;
    }


}
