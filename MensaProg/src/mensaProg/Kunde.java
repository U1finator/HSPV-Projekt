package mensaProg;

/**
 * eine Klasse zum zwischenspeichern von Nutzername und Passwort des aktuellen Benutzers
 * @author U1finator (Olaf)
 */
public class Kunde
{
  /**
 * Nutzername des Benutzers
 */
public String username;
  /**
 * Passwort des Nutzers
 */
public String passwort;

  Kunde(String username, String passwort) //Konstruktor des Kunden
  {
    this.username = username;
    this.passwort = passwort;
  }
  
  Kunde(){} //leerer Konstruktor
  
  /**
 * @return Nutzername der zwischengespeichert wurde
 */
public String getUsername() //Abfrage des Nutzernamens des Kunden
  {
    return this.username;
  }
  
  /**
 * @return Passwort des Nutzers
 */
public String getPW()  //Abfrage des Passwortes des Kunden
  {
    return this.passwort;
  }
  
  /**
 * @param username Zwischengespeicherter Nutzername
 */
public void setUsername(String username)
  {
    this.username = username;
  }
  
  /**
 * @param pw Zwischengespeichertes Passwort
 */
public void setPW(String pw)
  {
    this.passwort = pw;
  }
}
