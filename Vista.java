
import java.util.Scanner;
public class Vista {

  Scanner input = new java.util.Scanner(System.in);
  Estrella redEstrella;
  Anillo redAnillo;
  Bus redBus;
  //Hub redHub;

  int opcion;

  public void iniciar () {

    System.out.println ("Seleccione el tipo de red a crear \n"+"1. Estrella \n"+"2.Anillo" +
                                                           "\n3.Bus");
    opcion = input.nextInt();
    switch (opcion) {
      case 1: crearEstrella();
    //   case 2:
    //   case 3:
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

    System.out.println("Digite la capacidad de la red");
    capacidad = input.nextInt();

    input.nextLine();

    System.out.println ("Digita una contraseña para la red");
    pass = input.nextLine();

    redEstrella= new Estrella(tipoCom, capacidad, pass);
  }

  //Método para mostrar el menú de la estrela
  public void menuEstrella () {
    String t; //varables que almacena el tipo de dispositivo
    int i; //Variable que almacena la posición del dispositivo
    System.out.println ("Seleccione la acción a ejecutar \n"+"1. Agregar dispositivos a la red \n"+"2.Quitar dispositivo de la red" +
                                                           "\n3.Enviar datos" + "\n4.Recibir datos" + "\n5.Cantidad de dispositivos en la red");
    opcion = input.nextInt();
    switch (opcion) {
      case 1:
      System.out.println("Digite tipo de dispositivo a agregar");
      t = input.nextLine();
      redEstrella.addDevice(t);
      break;

      case 2:
      System.out.println ("Digite el id del dispositivo a quitar");
      t = input.nextLine();
      redEstrella.removeDevice(t);
      break;

     case 3:
     System.out.println ("Dato a enviar");
     t = input.nextLine();
     i = input.nextInt();
     redEstrella.enviarDato(i,t);
     break;

    //   case 4:
    //   case 5:
     }
  }





}
