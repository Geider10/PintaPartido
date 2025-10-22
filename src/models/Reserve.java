package models;

import enums.ReserveEnum;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Reserve {
  private int id;
  private ReserveEnum status;
  private LocalDate reservationDate;
  private LocalTime hourStart;
  private LocalTime hourEnd;
  private LocalDateTime craetedDate;
  private int idUser;
  private int idClub;

  public Reserve (int idReserve, ReserveEnum statusReserve, LocalDate dateReserve, LocalTime hourStartReserve, LocalTime hourEndReserve, LocalDateTime craetedDateReserve, int idUserReserve, int idClubReserve){
    this.id = idReserve;
    this.status  = statusReserve;
    this.reservationDate = dateReserve;
    this.hourStart = hourStartReserve;
    this.hourEnd = hourEndReserve;
    this.craetedDate = craetedDateReserve;
    this.idUser = idUserReserve;
    this.idClub = idClubReserve;
  }
}
