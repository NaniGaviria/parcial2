public class Device {

  String type;
  String data;
  String id;

  protected Device(String id, String type){
    this.type = type;
    this.id = id;
  }
  protected String getId(){
    return id;
  }
  protected void setData(String data){
    this.data = data;
  }
  protected String getData(){
    return data;
  }
  protected String getType(){
    return type;
  }

}
