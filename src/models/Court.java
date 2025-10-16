package models;

public class Court {
  private static int id = 0;
  private String name;
  boolean isVisible;
  int idCategory;
  int idClub;
  public Court(int idCourt, String nameCourt, boolean isVisibleCourt, int idCategoryCourt, int idClubCourt){
    id = idCourt;
    name = nameCourt;
    isVisible = isVisibleCourt;
    idCategory = idCategoryCourt;
    idClub = idClubCourt;
  }
  public String getName(){
    return name;
  }
  public static int getId(){
    id++;
    return id;
  }
}
