package models;
/**
 * La clase Category representa una categoría. La categoría tiene atributos.
 */
public class Category {
  private int id;
  private String name;

  /**
   * Crea una instancia de Categoría.
   * @param idCategory Un número entero para definir el ID de la categoría.
   * @param nameCategory Una cadena de texto para definir el nombre de la categoría.
   */
  public Category (int idCategory, String nameCategory){
    this.id = idCategory;
    this.name = nameCategory;
  }

  public int getId(){
    return this.id;
  }
  public String getName(){
    return this.name;
  }
}
