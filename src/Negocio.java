import java.util.ArrayList;
import java.util.Scanner;
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
    int idCategory = getIdCourt(numberEntered);
    int indexCourt = courts.size() + 1;

    courts.add(new Court(indexCourt, nameEntered, true,idCategory, 1));
  }
  private int getIdCourt(int numberEntered)  {
    if (numberEntered == 1) return 1;
    if (numberEntered == 2) return 2;
    if (numberEntered == 3) return 3;
    return 1;
  }

}
