package models;
/**
 * La clase User representa un usuario. El usuario tiene atributos.
 */
public class User {
  private int id;
  private String name;
  private String email;
  private String password;
  private String phone;
  private int idRole;

  /**
   * Crear una instacia de usuario.
   * @param idUser Un número entero para definir el ID del usuario.
   * @param nameUser Una cadena de texto para definir el nombre del usuario.
   * @param emailUser Una cadena de texto para definir el email del usuario.
   * @param passwordUser Una cadena de texto para definir la contraseña del usuario.
   * @param phoneUser Una cadena de texto para definir el telefono del usuario.
   * @param idRoleUser Un número entero para definir el ID del rol perteneciente.
   */
  public User (int idUser, String nameUser, String emailUser, String passwordUser, String phoneUser, int idRoleUser){
    this.id = idUser;
    this.name = nameUser;
    this.email = emailUser;
    this.password = passwordUser;
    this.phone = phoneUser;
    this.idRole = idRoleUser;
  }
}
