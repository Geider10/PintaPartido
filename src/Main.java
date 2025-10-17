import data.DBMock;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import models.Court;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    Business business = new Business();
    ArrayList<Court> courts = DBMock.getCourts();

    label://nombre del bucle
    while (true){
      loadMenu();
      int numberEntered = validateNumberEntered();

      switch (numberEntered) {
        case 1 -> {
          business.addCourt(courts);
          cleanConsole();
        }
        case 2 -> {
          business.getCourts(courts);
          cleanConsole();
        }
        case 3 -> System.out.println("Buscar un club por nombre");
        case 4 -> System.out.println("Editar datos de cancha");
        case 5 -> System.out.println("Eliminar cancha");
        case 0 -> {
          System.out.println("Fin");
          break label;
        }
        default -> System.out.println("Opción incorrecta, intente de nuevo.");
      }
    }
  }
  public static void loadMenu(){
    System.out.println("""
        Menu PintaPartido
        0 - Finalizar el programa
        1 - Crear una cancha
        2 - Listar canchas
        3 - Buscar un club por nombre
        4 - Editar datos cancha 
        5 - Eliminar cancha
        """);
  }
  public static int validateNumberEntered(){
    Scanner scanner = new Scanner(System.in);
    int minimumOption = 0;
    int maximumOption = 5;
    int numberValid;

    while (true){
      System.out.print("Ingrese un número del menu (0-5): ");
      try {
        int numberOption = scanner.nextInt();
        boolean isOptionRange = numberOption >= minimumOption && numberOption <= maximumOption;
        if (isOptionRange) {
          numberValid = numberOption;
          break;
        } else {
          System.out.println("El número esta fuera del rango.");
        }
      }catch (InputMismatchException e){
        System.out.println("Error,número ingresado invalido.");
        scanner.nextLine();
      }
    }

    return numberValid;
  }
  public static void cleanConsole(){
    Scanner scanner = new Scanner(System.in);
    System.out.println();
    System.out.println("Pulse ENTER para continuar...");
    scanner.nextLine();

    for (int i = 0; i < 30; i++) {
      System.out.println();
    }
  }
}