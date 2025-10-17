import data.DBMock;
import java.util.ArrayList;
import java.util.Optional;
import models.Category;
import models.Court;
import models.SportsClub;

public class Business {
  public void addCourt(ArrayList<Court> courts){
    int id = Court.setId();
    String name = Court.getNameByConsole();
    boolean isVisible = Court.getVisibilityByConsole();
    int idCategory = Court.getIdCategoryByConsole();
    int idClub = Court.getIdClubByConsole();

    //TODO: crear metodo para validar consistencia de datos
    //validateNewCourt(id, name, isVisible,idCategory, idClub);
    courts.add(new Court(id, name, isVisible,idCategory, idClub));
  }
  //private void validateNewCourt (int id, String name, boolean isVisible, int idCategory, int idClub){}

  public void getCourts (ArrayList<Court> courts){
    int order = 1;
    for (Court court : courts){
      String nameCourt = court.getName();
      String nameCategory = getNameCategoryById(court.getIdCategory());
      String nameClub = getNameClubById(court.getIdClub());

      String showCourt = Court.formatCourtData(order, nameCourt, nameCategory, nameClub);
      //TODO: crear metodo para validar canchas segun filtros
      System.out.println(showCourt);
      order++;
    }
  }
  private String getNameCategoryById(int idCategory){
    ArrayList<Category> categories = DBMock.getCategories();
    Optional<Category> category = categories.stream().filter(c -> c.getId() == idCategory).findFirst();
    if (category.isPresent()){
      return category.get().getName();
    }else {
      return "Futbol por defecto";
    }
  }
  private String getNameClubById(int idClub){
    ArrayList<SportsClub> clubs = DBMock.getClubs();
    Optional<SportsClub> club = clubs.stream().filter(c -> c.getId() == idClub).findFirst();
    if(club.isPresent()){
      return club.get().getName();
    }else{
      return "Cancha por defecto";
    }
  }
}
