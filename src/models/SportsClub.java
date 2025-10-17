package models;

public class SportsClub {
  private int id;
  private String name;
  private String address;
  private String location;

  public SportsClub(int idClub, String nameClub, String addressClub, String locationClub){
  id = idClub;
  name = nameClub;
  address = addressClub;
  location = locationClub;
  }

  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
}
