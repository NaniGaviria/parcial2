public class Bus (){

  protected String pass = "";


    public Bus(tipoDeComunicacion,String capacidad,String pass, String medio){
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
