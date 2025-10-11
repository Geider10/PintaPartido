package data;

import enums.ReserveEnum;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import models.Reserve;
import models.SportsClub;

public class DBMock {
  public ArrayList<SportsClub> getClubs(){
    ArrayList<SportsClub> clubs = new ArrayList<>();

    clubs.add( new SportsClub(1, "Araoz Futbol", "Lisandro de la Torre 3851", "Villa Lugano, CABA"));
    clubs.add( new SportsClub(2, "Club Larrazabal", "Larrazabal 3801", "Villa Lugano, CABA"));
    clubs.add( new SportsClub(3, "El anden", "Yerbal 1201", "Flores, CABA"));

    return  clubs;
  }
  public ArrayList<Reserve> getReserves(){
    ArrayList<Reserve> reserves = new ArrayList<>();

    reserves.add( new Reserve(1, ReserveEnum.PAST, LocalDate.now(), LocalTime.now(), LocalTime.now(), LocalDateTime.now(), 1, 2));
    reserves.add( new Reserve(2, ReserveEnum.ACTIVE, LocalDate.now(), LocalTime.now(), LocalTime.now(), LocalDateTime.now(), 1, 3));

    return  reserves;
  }
}
