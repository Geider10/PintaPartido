import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    cargarMenuOpciones();
    elegirOpcionMenu();
  }
  public static void cargarMenuOpciones(){
    System.out.println("""
        Ingrese un número para elegir una opción:
        0 - Finalizar el programa
        1 - Crear una Cancha
        2 - Listar Canchas
        3 - Buscar una Cancha por nombre
        4 - Editar una Cancha
        5 - Eliminar una Cancha
        """);
  }
  public static void elegirOpcionMenu(){
    Scanner scanner = new Scanner(System.in);
    int numeroOpcion = scanner.nextInt();

    switch (numeroOpcion) {
      case 0:
        System.out.println("Finalizar el programa");
        break;
      case 1:
        System.out.println("Crear una Cancha");
        break;
      case 2:
        System.out.println("Listar Canchas");
        break;
    }
  }
}