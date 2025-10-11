package models;

import java.util.UUID;

public class SportsClub {
  int id;
  String name;
  String address;
  String location;

  public SportsClub(int idClub, String nameClub, String addressClub, String locationClub){
  id = idClub;
  name = nameClub;
  address = addressClub;
  location = locationClub;
  }
}
