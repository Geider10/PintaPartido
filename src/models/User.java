package models;

public class User {
  int id;
  String name;
  String email;
  String password;
  String phone;
  int idRole;

  public User (int idUser, String nameUser, String emailUser, String passwordUser, String phoneUser, int idRoleUser){
    id = idUser;
    name = nameUser;
    email = emailUser;
    password = passwordUser;
    phone = phoneUser;
    idRole = idRoleUser;
  }
}
