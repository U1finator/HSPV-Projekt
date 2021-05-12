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
  
  Kunde(){} //leerer Konstruktor
  
  public String getUsername() //Abfrage des Nutzernamens des Kunden
  {
    return this.username;
  }
  
  public String getPW()  //Abfrage des Passwortes des Kunden
  {
    return this.passwort;
  }
  
  public void setUsername(String username)
  {
    this.username = username;
  }
  
  public void setPW(String pw)
  {
    this.passwort = pw;
  }

public Object getKonstostand() {
	// TODO Auto-generated method stub
	return null;
}
}