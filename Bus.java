public class Bus extends Lan {

  private String pass = "";
  private String  medio = "";//medio de transmision alambrico o inalambrico
  private int countId=0;

    public Bus(String tipoDeComunicacion,int capacidad,String pass, String medio){

      super(tipoDeComunicacion,capacidad);
      this.pass = pass;
      this.medio = medio;
    }

    //Metodo get y set de Pass
    protected String getPass(){
      return pass;
    }
    protected void setPass(String pass){
      this.pass = pass;
    }

    //Metodo get y set de medio
    protected String getMedio(){
      return medio;
    }
    protected void setMedio(String medio){
      this.medio = medio;
    }




}
