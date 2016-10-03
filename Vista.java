
import java.util.Scanner;
public class Vista {

  Scanner input = new java.util.Scanner(System.in);
  Estrella redEstrella;
  Anillo redAnillo;
  Bus redBus;
  //Hub redHub;

  int opcion; //Variable para que almacene el dato digitado del menu

  public void iniciar () {

    System.out.println ("Seleccione el tipo de red a crear \n"+"1. Estrella \n"+"2.Anillo" +
    "\n3.Bus");
    opcion = input.nextInt();
    switch (opcion) {
      case 1: crearEstrella();
      case 2: crearAnillo();
      case 3: crearBus();
      //   case 4:
    }
  }

  //Metodo para crear estrella


  public void crearEstrella () {

    String tipoCom;
    int capacidad;
    String pass;

    System.out.println("Digite el tipo de comunicación");
    tipoCom = input.nextLine();

    input.nextLine();

    System.out.println("Digite la capacidad de la red");
    capacidad = input.nextInt();

    input.nextLine();

    System.out.println ("Digita una contraseña para la red");
    pass = input.nextLine();

    redEstrella= new Estrella(tipoCom, capacidad, pass);
    menuEstrella();
  }

  //Método para mostrar el menú de la estrela
  public void menuEstrella () {

    String t; //varables que almacena el tipo de dispositivo
    int i; //Variable que almacena la posición del dispositivo
    boolean salir = false; //Variable para detener el ciclo

    do {
      System.out.println ("\nSeleccione la acción a ejecutar \n"+"1. Agregar dispositivos a la red \n"+"2.Quitar dispositivo de la red" +
      "\n3.Enviar datos" + "\n4.Recibir datos" + "\n5.Cantidad de dispositivos en la red" +
      "\n6.Salir");


      opcion = input.nextInt();
      switch (opcion) {
        case 1:
        System.out.println("Digite tipo de dispositivo a agregar");
        input.nextLine();
        t = input.nextLine();
        redEstrella.addDevice(t);
        break;

        case 2:
        System.out.println ("Digite el id del dispositivo a quitar");
        input.nextLine();
        i = input.nextInt();
        redEstrella.removeDevice(i);
        break;

        case 3:
        System.out.println ("Dato a enviar");
        input.nextLine();
        t = input.nextLine();
        System.out.println ("Posición del dispositivo en la red");
        i = input.nextInt();
        redEstrella.enviarDato(i,t);
        break;

        case 4:
        System.out.println ("Ubicación del dispositivo");
        input.nextLine();
        i = input.nextInt();
        System.out.println("Dato recibido: " + redEstrella.recibirDato(i));
        break;

        case 5:
        System.out.println ("Listando dispositivos" );
        input.nextLine();
        redEstrella.printDevices();
        break;

        case 6:
        salir=true;
        System.exit(0);
        break;

      }
    } while (salir==false);
  }

  //Metodo para crear anillo
  public void crearAnillo() {

    String tipoCom, pass;
    int capacidad;
    input.nextLine();
    System.out.println("Digite el tipo de comunicación");
    tipoCom = input.nextLine();
    System.out.println("Digite la capacidad de la red");
    capacidad = input.nextInt();
    input.nextLine();
    System.out.println ("Digita una contraseña para la red");
    pass = input.nextLine();

    redAnillo = new Anillo(tipoCom, capacidad, pass);

  }

  //Metodo para mostrar el menu anilla
  public void menuAnillo() {

  }

  //Metodo que nos crea la red Bus
  public void crearBus (){
    String tipoCom;
    int capacidad;
    String pass;

    System.out.println("Digite el tipo de comunicación");
    tipoCom = input.nextLine();

    System.out.println("Digite la capacidad de la red");
    capacidad = input.nextInt();

    input.nextLine();

    System.out.println ("Digita una contraseña para la red");
    pass = input.nextLine();

    redBus= new Bus(tipoCom, capacidad, pass);
    menuBus(); //Llama al metodo que nos muestra el menu de la red Bus
  }

  //Metodo de que nos muestra el menu de la red Bus
  public void menuBus (){
    String t; //varables que almacena el tipo de dispositivo
    int i; //Variable que almacena la posición del dispositivo
    boolean salir = false; //Variable para detener el ciclo

    System.out.println ("Seleccione la acción a ejecutar \n"+"1. Agregar dispositivos a la red \n"+"2.Quitar dispositivo de la red" +
    "\n3.Enviar datos" + "\n4.Recibir datos" + "\n5.Cantidad de dispositivos en la red" +
    "\n6.Salir");
    do {
      opcion = input.nextInt();
      switch (opcion) {
        case 1:
        System.out.println("Digite tipo de dispositivo a agregar");
        input.nextLine();
        t = input.nextLine();
        redBus.addDevice(t);
        break;

        case 2:
        System.out.println ("Digite el id del dispositivo a quitar");
        input.nextLine();
        i = input.nextInt();
        redBus.removeDevice(i);
        break;

        case 3:
        System.out.println ("Dato a enviar");
        input.nextLine();
        t = input.nextLine();
        System.out.println ("Posición del dispositivo en la red");
        i = input.nextInt();
        redBus.enviarDato(i,t);
        break;

        case 4:
        System.out.println ("Ubicación del dispositivo");
        input.nextLine();
        i = input.nextInt();
        System.out.println("Dato recibido: " + redBus.recibirDato(i));
        break;

        case 5:
        System.out.println ("Listando dispositivos");
        input.nextLine();
        redBus.printDevices();
        break;

        case 6:
        salir = true;
        break;

      }
    }while (salir==false);

  }

}
