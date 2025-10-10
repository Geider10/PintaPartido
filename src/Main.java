import java.util.InputMismatchException;
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
        Menu PintaPartido
        0 - Finalizar el programa
        1 - Crear una Cancha
        2 - Listar Canchas
        3 - Buscar una Cancha por nombre
        4 - Editar una Cancha
        5 - Eliminar una Cancha
        """);
  }
  public static void elegirOpcionMenu(){
    int numeroValido = validarNumeroElegido();

    switch (numeroValido) {
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
}