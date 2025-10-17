package models;
import java.util.Scanner;

public class Court {
  private static int id = 0;
  private String name;
  private boolean isVisible;
  private int idCategory;
  private int idClub;

  public Court(int idCourt, String nameCourt, boolean isVisibleCourt, int idCategoryCourt, int idClubCourt){
    id = idCourt;
    name = nameCourt;
    isVisible = isVisibleCourt;
    idCategory = idCategoryCourt;
    idClub = idClubCourt;
  }

  public int getId(){
   return id;
  }
  public String getName(){
    return name;
  }
  public static int setId(){
    id++;
    return id;
  }
  public int getIdCategory(){
    return idCategory;
  }
  public int getIdClub(){
    return idClub;
  }
  public static String getNameByConsole(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el nombre de la cancha: ");

    return scanner.nextLine();
  }
  public static boolean getVisibilityByConsole(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("""
        Elegí la visibilidad de la cancha:
        1 - Visible
        2 - Oculta
        """);

    int numberEntered = scanner.nextInt();
    if (numberEntered == 1) return true;
    return false;
  }
  public static int getIdCategoryByConsole(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("""
        Elegí la categoría de la cancha:
        1 - Futbol
        2 - Basquet
        3 - Voley
        """);

    return scanner.nextInt();
  }
  public static int getIdClubByConsole(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("""
        Elegí el club de la cancha:
        1 - Araoz Futbol
        2 - Club Larrazabal
        3 - El anden
        """);

    return scanner.nextInt();
  }
  public static String formatCourtData (int order, String nameCourt, String nameCategory, String nameClub){
    return String.format("%s - Nombre de la cancha: %s, nombre del club: %s, la categoria es: %s", order, nameCourt, nameClub, nameCategory);
  }

}
