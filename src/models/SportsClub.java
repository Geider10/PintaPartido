package models;

public class SportsClub {
  private int id;
  private String name;
  private String address;
  private String location;

  public SportsClub(int idClub, String nameClub, String addressClub, String locationClub){
    this.id = idClub;
    this.name = nameClub;
    this.address = addressClub;
    this.location = locationClub;
  }
  public String getName(){
    return this.name;
  }
  public int getId(){
    return this.id;
  }
  public String getAddress(){
    return this.address;
  }
  public static String formatClubData(String name, String address){
    return String.format("Nombre del club: %s y la dirección es: %s",name, address);
  }
}
