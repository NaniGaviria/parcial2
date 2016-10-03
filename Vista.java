import java.util.Scanner;

public class Vista {

  Scanner input = new java.util.Scanner(System.in);
  Estrella redEstrella;
  Anillo redAnillo;
  Bus redBus;
  int opcion;

  public void iniciar () {

    System.out.println ("Seleccione el tipo de red a crear \n"+"1. Estrella \n"+"2.Anillo" +
    "\n3.Bus" + "\n4.Hub");
    opcion = input.nextInt();
    switch (opcion) {
      case 1: crearEstrella();
      //   case 2:
      //   case 3:
      //   case 4:
    }
  }

  public void crearEstrella () {

    String tipoCom;
    int capacidad;
    String pass;
    input.nextLine();
    System.out.println("Digite el tipo de comunicación");
    tipoCom = input.nextLine();

    System.out.println("Digite la capacidad de la red");
    capacidad = input.nextInt();
    input.nextLine();
    System.out.println ("Digita una contraseña para la red");
    pass = input.nextLine();

    redEstrella = new Estrella(tipoCom, capacidad, pass);
  }

}
