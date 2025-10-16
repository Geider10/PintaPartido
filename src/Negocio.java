import java.util.ArrayList;
import java.util.Scanner;
import models.Category;
import models.Court;

public class Negocio {
  public void addCourt(ArrayList<Court> courts){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el nombre de la cancha: ");
    String nameEntered = scanner.nextLine();
    System.out.print("""
        Eliga la categoria de la cancha
        1 - Futbol
        2 - Basquet
        2 - Voley
        """);
    int numberEntered = scanner.nextInt();
    int idCourt = Court.getId();
    int idCategory = getIdCategory(numberEntered);

    courts.add(new Court(idCourt, nameEntered, true,idCategory, 1));
  }
  private int getIdCategory(int numberEntered)  {
    if (numberEntered == 1) return numberEntered;
    if (numberEntered == 2) return numberEntered;
    if (numberEntered == 3) return numberEntered;
    return 1;
  }
  public void getCourts (ArrayList<Court> courts){
    //ArrayList<Court> courtsEnabled = courts.stream()
    int order = 1;
    for (Court court : courts){
      System.out.println(formatCourtData(order,court.getName()));
      order++;
    }
  }
  private String formatCourtData (int order, String name){
    return String.format("%s - Nombre : %s", order, name);
  }

}
