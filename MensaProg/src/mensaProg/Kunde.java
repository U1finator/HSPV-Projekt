package mensaProg;

public class Kunde
{
  public String username;
  public String passwort;

  Kunde(String username, String passwort) //Konstruktor des Kunden
  {
    this.username = username;
    this.passwort = passwort;
  }
  
  public String getUsername() //Abfrage des Nutzernamens des Kunden
  {
    return this.username;
  }
  
  public getPW()  //Abfrage des Passwortes des Kunden
  {
    return this.passwort;
  }
}
