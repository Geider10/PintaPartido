import data.DBMock;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import models.Court;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    DBMock db = new DBMock();
    Negocio negocio = new Negocio();
    ArrayList<Court> courts = db.getCourts();

    label:
    while (true){
      cargarMenu();
      int numeroValido = validarNumeroElegido();

      switch (numeroValido) {
        case 1 -> {
          negocio.addCourt(courts);
          cleanConsole();
        }
        case 2 -> System.out.println("Listar Canchas");
        case 3 -> System.out.println("Buscar un club por nombre");
        case 4 -> System.out.println("Editar datos de cancha");
        case 5 -> System.out.println("Eliminar cancha");
        case 0 -> {
          System.out.println("Finalizar el programa");
          break label;
        }
        default -> System.out.println("Opción incorrecta, intente de nuevo.");
      }
    }
  }
  public static void cargarMenu(){
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
  public static int validarNumeroElegido(){
    Scanner scanner = new Scanner(System.in);
    int opcionMin = 0;
    int opcionMax = 5;
    int numeroValido;

    while (true){
      System.out.print("Ingrese un número para elegir una opción: ");
      try {
        int numeroOpcion = scanner.nextInt();
        boolean estaNumeroOpciones = numeroOpcion >= opcionMin && numeroOpcion <= opcionMax;
        if (estaNumeroOpciones) {
          numeroValido = numeroOpcion;
          break;
        } else {
          System.out.println("El número esta fuera del rango.");
        }
      }catch (InputMismatchException e){
        System.out.println("Error, ingrese un número, no letras ni símbolos.");
        scanner.nextLine();
      }
    }

    return numeroValido;
  }
  public static void cleanConsole(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Pulse ENTER para continuar...");
    scanner.nextLine();

    for (int i = 0; i < 30; i++) {
      System.out.println();
    }
  }
}