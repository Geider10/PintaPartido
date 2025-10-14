package models;

public class Court {
  int id;
  String name;
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
}
