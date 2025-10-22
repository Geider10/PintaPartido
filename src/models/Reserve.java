package models;

import enums.ReserveEnum;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * La clase Reserver representa una reserva del usuario. La reserva tiene atributos, pertenece a un Usuario y a un Club Deportivo.
 */
public class Reserve {
  private int id;
  private ReserveEnum status;
  private LocalDate reservationDate;
  private LocalTime hourStart;
  private LocalTime hourEnd;
  private LocalDateTime craetedDate;
  private int idUser;
  private int idClub;

  /**
   * Crea una instacia de Reserva.
   * @param idReserve Un número entero para definir el ID de la reserva.
   * @param statusReserve Un enumerador para definir el estado de la reserva.
   * @param dateReserve Una fecha para definir el dia de la reserva.
   * @param hourStartReserve Una hora para definir la hora de inicio de la reserva.
   * @param hourEndReserve Una hora para definir la hora de fin de la reserva.
   * @param craetedDateReserve Una fecha para definir la fecha que se creo la reserva.
   * @param idUserReserve Un número entero para definir el ID del Usuario perteneciente.
   * @param idClubReserve Un número entero para definir el ID del Club perteneciente.
   */
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
