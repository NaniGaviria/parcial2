public class Lan {

  protected String type;
  protected String password;
  protected int capacity;
  protected int numNodes;

  public Lan(String type, int capacity, String password){
    this.type = type;
    this.capacity = capacity;
    this.password = password;
  }

  protected String getType(){
    return type;
  }
  protected int getCapacity(){
    return capacity;
  }
}
