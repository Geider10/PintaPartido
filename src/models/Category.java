package models;

public class Category {
  private int id;
  private String name;

  public Category (int idCategory, String nameCategory){
    id = idCategory;
    name = nameCategory;
  }

  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
}
