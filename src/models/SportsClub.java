package models;
/**
 * La clase SportsClub representa un club deportivo. El club tiene atributos.
 */
public class SportsClub {
  private int id;
  private String name;
  private String address;
  private String location;

  /**
   * Crea una instacia de club.
   * @param idClub Un número entero para definir el ID del club.
   * @param nameClub Una cadena de texto para definir el nombre del club.
   * @param addressClub Una cadena de texto para definir la dirección del club.
   * @param locationClub Una cadena de texto para definir el barrio y provincia del club.
   */
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
