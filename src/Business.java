import data.DBMock;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import models.Category;
import models.Court;
import models.SportsClub;

public class Business {
  public void addCourt(ArrayList<Court> courts){
    String name = getNameCorutByConsole();
    boolean isVisible = getVisibilityCourtByConsole();
    int idCategory = getIdCategoryByConsole();
    int idClub = getIdClubByConsole();

    //TODO: crear metodo para validar consistencia de datos
    //validateNewCourt(id, name, isVisible,idCategory, idClub);
    courts.add(new Court(name, isVisible,idCategory, idClub));
  }
  //private void validateNewCourt (int id, String name, boolean isVisible, int idCategory, int idClub){}

  public void getCourts (ArrayList<Court> courts){
    //TODO: crear metodo para validar canchas segun filtros
    for (Court court : courts){
      int id = court.getId();
      String nameCourt = court.getName();
      String nameCategory = getNameCategoryById(court.getIdCategory());
      String nameClub = getNameClubById(court.getIdClub());

      String showCourt = Court.formatCourtData(id, nameCourt, nameCategory, nameClub);
      System.out.println(showCourt);
    }
  }
  public void updateCourt(ArrayList<Court> courts){
    //listar todas las cancchas
    //elegir y obetener la cancha por id
    //obtener datos cancha por consola
    //actualizar la cancha en el listado
    this.getCourts(courts);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Elegí una cancha por su indice: ");
    int idEntered = scanner.nextInt();
    Court court = getCourtById(idEntered, courts);

    String name = getNameCorutByConsole();
    boolean isVisible = getVisibilityCourtByConsole();
    int idCategory = getIdCategoryByConsole();

    court.setName(name);
    court.setVisibility(isVisible);
    court.setIdCategory(idCategory);
  }
  private String getNameCorutByConsole(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el nombre de la cancha: ");

    return scanner.nextLine();
  }
  private boolean getVisibilityCourtByConsole(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("""
        Elegí la visibilidad de la cancha:
        1 - Visible
        2 - Oculta
        """);

    int numberEntered = scanner.nextInt();
    if (numberEntered == 1) {
      return true;
    }else{
      return false;
    }
  }
  private int getIdCategoryByConsole(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("""
        Elegí la categoría de la cancha:
        1 - Futbol
        2 - Basquet
        3 - Voley
        """);

    return scanner.nextInt();
  }
  private int getIdClubByConsole(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("""
        Elegí el club de la cancha:
        1 - Araoz Futbol
        2 - Club Larrazabal
        3 - El anden
        """);

    return scanner.nextInt();
  }
  private String getNameCategoryById(int idCategory){
    ArrayList<Category> categories = DBMock.getCategories();
    Optional<Category> category = categories.stream().filter(c -> c.getId() == idCategory).findFirst();
    if (category.isPresent()){
      return category.get().getName();
    }else {
      return "Futbol DEFAULT";
    }
  }
  private String getNameClubById(int idClub){
    ArrayList<SportsClub> clubs = DBMock.getClubs();
    Optional<SportsClub> club = clubs.stream().filter(c -> c.getId() == idClub).findFirst();
    if(club.isPresent()){
      return club.get().getName();
    }else{
      return "Club Larrazabl DEFAULT";
    }
  }
  private Court getCourtById(int id, ArrayList<Court> courts){
    Optional<Court> court = courts.stream().filter(c -> c.getId() == id).findFirst();
    if (court.isPresent()){
      return court.get();
    }
    return null;
  }
}
