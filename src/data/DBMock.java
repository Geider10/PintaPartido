package data;

import enums.ReserveEnum;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import models.Category;
import models.Court;
import models.Reserve;
import models.SportsClub;

public class DBMock {
  public static ArrayList<SportsClub> getClubs(){
    ArrayList<SportsClub> clubs = new ArrayList<>();

    clubs.add( new SportsClub(1, "Araoz Futbol", "Lisandro de la Torre 3851", "Villa Lugano, CABA"));
    clubs.add( new SportsClub(2, "Club Larrazabal", "Larrazabal 3801", "Villa Lugano, CABA"));
    clubs.add( new SportsClub(3, "El anden", "Yerbal 1201", "Flores, CABA"));

    return clubs;
  }
  public static ArrayList<Category> getCategories(){
    ArrayList<Category> categories = new ArrayList<>();

    categories.add( new Category(1, "Futbol"));
    categories.add( new Category(2, "Basquet"));
    categories.add(new Category(3, "Voley"));

    return categories;
  }

  public static ArrayList<Court> getCourts (){
    ArrayList<Court> courts = new ArrayList<>();

    courts.add( new Court(Court.setId(), "Cancha 1 5vs5", true, 1, 1));
    courts.add( new Court(Court.setId(), "Cancha 2 5vs5", true, 1, 2));
    courts.add( new Court(Court.setId(), "Cancha 5vs5", true, 3, 2));

    return courts;
  }

  public ArrayList<Reserve> getReserves(){
    ArrayList<Reserve> reserves = new ArrayList<>();

    reserves.add( new Reserve(1, ReserveEnum.PAST, LocalDate.now(), LocalTime.now(), LocalTime.now(), LocalDateTime.now(), 1, 2));
    reserves.add( new Reserve(2, ReserveEnum.ACTIVE, LocalDate.now(), LocalTime.now(), LocalTime.now(), LocalDateTime.now(), 1, 3));

    return reserves;
  }
}
