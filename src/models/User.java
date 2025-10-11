package models;

import java.util.UUID;

public class User {
  int id;
  String name;
  String email;
  String password;
  String phone;

  public User (int idUser, String nameUser, String emailUser, String passwordUser, String phoneUser){
    id = idUser;
    name = nameUser;
    email = emailUser;
    password = passwordUser;
    phone = phoneUser;
  }
}
