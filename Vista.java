
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
      case 2: crearAnillo();
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



  }



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

  public void menuAnillo() {
    
  }

}
