package models;

public class Category {
  private int id;
  private String name;

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
