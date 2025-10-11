package models;

import enums.ReserveEnum;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Reserve {
  int id;
  ReserveEnum status;
  LocalDate reservationDate;
  LocalTime hourStart;
  LocalTime hourEnd;
  LocalDateTime craetedDate;
  int idUser;
  int idClub;

  public Reserve (int idReserve, ReserveEnum statusReserve, LocalDate dateReserve, LocalTime hourStartReserve, LocalTime hourEndReserve, LocalDateTime craetedDateReserve, int idUserReserve, int idClubReserve){
    id = idReserve;
    status  = statusReserve;
    reservationDate = dateReserve;
    hourStart = hourStartReserve;
    hourEnd = hourEndReserve;
    craetedDate = craetedDateReserve;
    idUser = idUserReserve;
    idClub = idClubReserve;
  }
}
