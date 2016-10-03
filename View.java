
import java.util.Scanner;
public class View {

  Scanner input = new java.util.Scanner(System.in);
  Star star;
  Ring ring;
  Bus bus;

  int option; //Variable para que almacene el dato digitado del menu

  public void init () {

    System.out.println ("Seleccione el tipo de red a crear \n"+"1. Estrella \n"+"2.Anillo" +
    "\n3.Bus");
    option = input.nextInt();
    switch (option) {
      case 1: crearEstrella();
      case 2: crearAnillo();
      case 3: crearBus();
      //   case 4:
    }
  }

  //Metodo para crear estrella


  public void crearEstrella () {

    String type;
    int capacity;
    String password;

    System.out.println("Digite el tipo de comunicación");
    type = input.nextLine();

    input.nextLine();

    System.out.println("Digite la capacidad de la red");
    capacity = input.nextInt();

    input.nextLine();

    System.out.println ("Digita una contraseña para la red");
    password = input.nextLine();

    star = new Star(type, capacity, password);
    menuEstrella();
  }

  //Método para mostrar el menú de la estrela
  public void menuEstrella () {

    String type; //varables que almacena el tipo de dispositivo
    int pos; //Variable que almacena la posición del dispositivo
    boolean exit = false; //Variable para detener el ciclo

    do {
      System.out.println ("\nSeleccione la acción a ejecutar \n"+"1. Agregar dispositivos a la red \n"+"2.Quitar dispositivo de la red" +
      "\n3.Enviar datos" + "\n4.Recibir datos" + "\n5.Cantidad de dispositivos en la red" +
      "\n6.Salir");


      option = input.nextInt();
      switch (option) {
        case 1:
        System.out.println("Digite tipo de dispositivo a agregar");
        input.nextLine();
        type = input.nextLine();
        star.addDevice(type);
        break;

        case 2:
        System.out.println ("Digite el id del dispositivo a quitar");
        input.nextLine();
        pos = input.nextInt();
        star.removeDevice(pos);
        break;

        case 3:
        System.out.println ("Dato a enviar");
        input.nextLine();
        type = input.nextLine();
        System.out.println ("Posición del dispositivo en la red");
        pos = input.nextInt();
        star.enviarDato(pos, type);
        break;

        case 4:
        System.out.println ("Ubicación del dispositivo");
        input.nextLine();
        pos = input.nextInt();
        System.out.println("Dato recibido: " + star.receiveData(pos));
        break;

        case 5:
        System.out.println ("Listando dispositivos" );
        input.nextLine();
        star.printDevices();
        break;

        case 6:
        exit = true;
        System.exit(0);
        break;

      }
    } while (exit == false);
  }

  //Metodo para crear anillo
  public void crearAnillo() {

    String type, password;
    int capacity;
    input.nextLine();
    System.out.println("Digite el tipo de comunicación");
    type = input.nextLine();
    System.out.println("Digite la capacidad de la red");
    capacity = input.nextInt();
    input.nextLine();
    System.out.println ("Digita una contraseña para la red");
    password = input.nextLine();

    ring = new Ring(type, capacity, password);

  }

  //Metodo para mostrar el menu anilla
  public void menuAnillo() {
    String type; //varables que almacena el tipo de dispositivo
    int pos; //Variable que almacena la posición del dispositivo
    boolean exit = false; //Variable para detener el ciclo

    do {
      System.out.println ("\nSeleccione la acción a ejecutar \n"+"1. Agregar dispositivos a la red \n"+"2.Quitar dispositivo de la red" +
      "\n3.Enviar datos" + "\n4.Recibir datos" + "\n5.Cantidad de dispositivos en la red" +
      "\n6.Salir");

      option = input.nextInt();
      switch (option) {
        case 1:
        System.out.println("Digite tipo de dispositivo a agregar");
        input.nextLine();
        type = input.nextLine();
        ring.addDevice(type);
        break;

        case 2:
        System.out.println ("Digite el id del dispositivo a quitar");
        input.nextLine();
        pos = input.nextInt();
        ring.removeDevice(pos);
        break;

        case 3:
        System.out.println ("Dato a enviar");
        input.nextLine();
        type = input.nextLine();
        System.out.println ("Posición del dispositivo en la red");
        pos = input.nextInt();
        //ring.enviarDato(pos,type);
        break;

        case 4:
        System.out.println ("Ubicación del dispositivo");
        input.nextLine();
        pos = input.nextInt();
        //System.out.println("Dato recibido: " + ring.receiveData(i));
        break;

        case 5:
        System.out.println ("Listando dispositivos" );
        input.nextLine();
        //ring.printDevices();
        break;

        case 6:
        exit = true;
        System.exit(0);
        break;

      }
    } while (exit == false);

  }

  //Metodo que nos crea la red Bus
  public void crearBus (){
    String type, password;
    int capacity;
    input.nextLine();
    System.out.println("Digite el tipo de comunicación");
    type = input.nextLine();

    System.out.println("Digite la capacidad de la red");
    capacity = input.nextInt();

    input.nextLine();

    System.out.println ("Digita una contraseña para la red");
    password = input.nextLine();

    bus = new Bus(type, capacity, password);
    menuBus(); //Llama al metodo que nos muestra el menu de la red Bus
  }

  //Metodo de que nos muestra el menu de la red Bus
  public void menuBus (){
    String type; //varables que almacena el tipo de dispositivo
    int pos; //Variable que almacena la posición del dispositivo
    boolean exit = false; //Variable para detener el ciclo

    do {
      System.out.println ("\nSeleccione la acción a ejecutar \n"+"1. Agregar dispositivos a la red \n"+"2.Quitar dispositivo de la red" +
      "\n3.Enviar datos" + "\n4.Recibir datos" + "\n5.Cantidad de dispositivos en la red" +
      "\n6.Salir");

      option = input.nextInt();
      switch (option) {
        case 1:
        System.out.println("Digite tipo de dispositivo a agregar");
        input.nextLine();
        type = input.nextLine();
        bus.addDevice(type);
        break;

        case 2:
        System.out.println ("Digite el id del dispositivo a quitar");
        input.nextLine();
        pos = input.nextInt();
        bus.removeDevice(pos);
        break;

        case 3:
        System.out.println ("Dato a enviar");
        input.nextLine();
        type = input.nextLine();
        System.out.println ("Posición del dispositivo en la red");
        pos = input.nextInt();
        bus.enviarDato(pos,type);
        break;

        case 4:
        System.out.println ("Ubicación del dispositivo");
        input.nextLine();
        pos = input.nextInt();
        System.out.println("Dato recibido: " + bus.receiveData(pos));
        break;

        case 5:
        System.out.println ("Listando dispositivos" );
        input.nextLine();
        bus.printDevices();
        break;

        case 6:
        exit = true;
        System.exit(0);
        break;

      }
    } while (exit == false);

  }

}
