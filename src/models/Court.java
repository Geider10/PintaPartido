package models;

/**
 * La clase Court representa una cancha. La cancha tiene atributos, pertenece a una Categoría y a un Club Deportivo.
 */
public class Court {
  private int id;
  private String name;
  private boolean isVisible;
  private int idCategory;
  private int idClub;
  private static int nextId = 1;

  /**
   * Crea una instacia de Cancha.
   * @param nameCourt Una cadena de texto para definir el nombre de la cancha.
   * @param isVisibleCourt Un boleando para definir la visibilidad de la cancha.
   * @param idCategoryCourt Un número entero para definir el id de la categoría perteneciente.
   * @param idClubCourt Un número entero para definir el id del Club perteneciente.
   */
  public Court(String nameCourt, boolean isVisibleCourt, int idCategoryCourt, int idClubCourt){
    this.id = nextId;
    this.setName(nameCourt);
    this.setVisibility(isVisibleCourt);
    this.setIdCategory(idCategoryCourt);
    this.setIdClub(idClubCourt);

    nextId++;
  }

  public int getId(){
   return this.id;
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setVisibility(boolean isVisible){
    this.isVisible = isVisible;
  }
  public int getIdCategory(){
    return this.idCategory;
  }
  public void setIdCategory(int idCategory){
    this.idCategory = idCategory;
  }
  public int getIdClub(){
    return this.idClub;
  }
  public void setIdClub(int idClub){
    this.idClub = idClub;
  }

  public static String formatCourtData (int id, String nameCourt, String nameCategory, String nameClub){
    return String.format("%d - Nombre de la cancha: %s, la categoría es: %s y el club se llama: %s", id, nameCourt, nameCategory, nameClub);
  }

}
