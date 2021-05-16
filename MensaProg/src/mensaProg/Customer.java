package mensaProg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * Eine Klasse die über den SQL Connector die notwendigen Abfragen über den Nutzer macht
 * @author U1finator (Olaf)
 */
public class Customer 
{		
	Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
	/**
	 * @param einzahlung Höhe der Einzahlung
	 * @param name Nutzername des Nutzers
	 */
	public void deposit(int einzahlung, String name)	//Methode um Geld einzuzahlen
	{		
		try {
			Statement	stmt = conn.createStatement();	//erstelle ein neues SQLite Statement
			stmt.execute("UPDATE Kunden SET Kontostand= Kontostand+'" + einzahlung + "' WHERE nutzername='" + name + "'");	//ein SQL Statement wird durchgefÃƒÂ¼hrt um den Kontostand zu erhÃƒÂ¶hen
		
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		try 
		{
			conn.close();	//die Verbindung soll geschlossen werden
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @param auszahlung Höhe der Auszahlung/des Betrages der Abgebucht werden soll
	 * @param name Nutzername des Nutzers
	 */
	public void withdraw (int auszahlung, String name)	//Methode um Geld auszuzahlen
	{
		try {
			Statement	stmt = conn.createStatement();	//ein neues SQL Statement wrid einstellt
			stmt.execute("UPDATE Kunden SET Kontostand=Kontostand-'" + auszahlung + "' WHERE vorname='" + name + "'");	//ein SQL Statement wird durchgefÃƒÂ¼hrt um den Kontostand zu verringern
		
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		try {
			conn.close(); //die Verbindung soll geschlossen werden 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	/**
	 * @param vorname Vorname des Benutzers
	 * @param nachname Nachname des Benutzers
	 * @param pwort Das Passwort das der Benutzer wählt
	 */
	public void add(String vorname, String nachname, String pwort)	//Methode um einen neuen Kunden hinzuzufÃ¼gen
	{
		try {
			Statement	stmt = conn.createStatement();	//ein neues SQL Statement wrid einstellt
			stmt.execute("INSERT INTO kunden(vorname, nachname, pwort, username, kontostand, vegetarisch) VALUES ('" + vorname + "','" + nachname +"','" + pwort + "','" + vorname.toLowerCase() +"."+ nachname.toLowerCase() +"','0', '0' )");	//ein SQL Statement wird durchgefÃ¼hrt um einen neuen Kunden anzulegen
		
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//die Verbindung soll geschlossen werden 
	}
	
	/**
	 * @param username Nutzername des Benutzers
	 * @return Kontostand des Nutzers
	 */
	public double getKontostand(String username)
	{
		double kontostand;
		try {
			Statement stmt = conn.createStatement();
			kontostand = stmt.executeQuery("SELECT kontostand FROM kunden WHERE username = '" + username +"'").getDouble(1);
			conn.close();	//schließe die Verbindung zur Datenbank
			return kontostand;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0.0;
		}
	}
	
	/**
	 * @param name Nutzername des Benutzers
	 * @param pwort	das neue Passwort des Benutzers
	 */
	public void editPW(String name, String pwort)	//Methode um das Passwort zu ändern
	{
		try {
			Statement	stmt = conn.createStatement();	//ein neues SQL Statement wrid einstellt
			stmt.execute("UPDATE Kunden SET pwort='"+pwort+"'  WHERE username='" + name + "'");		
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	//die Verbindung soll geschlossen werden 
	}
	
	/**
	 * @param username Nutzername des Benutzers
	 * @param veg 1 für "is(s)t Vegetarisch", 0 für is(s)t nicht Vegetarisch
	 */
	public void editVeg(String username, int veg)	//Methode um den Status Vegetarisch in der Datenbank zu ändern
	{
		try {
			Statement stmt = conn.createStatement();	//ein neues SQL Statement wrid einstellt
			stmt.execute("UPDATE Kunden SET Vegetrarisch = '"+ veg +"'  WHERE Username='" + username + "'");		
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @param username Nutzername des Benutzers
	 * @return WHW ob der Benutzer vegetarierer ist(true) oder nicht (false)
	 */
	public boolean getVeg(String username)	//Methode zum Abfragen ob ein Nutzer Vegetarisch is(s)t oder nicht
	{
		try {
			boolean veg;
			Statement	stmt = conn.createStatement();	//ein neues SQL Statement wrid einstellt
			int result = stmt.executeQuery("SELECT Kunden WHERE username='" + username + "'").getInt(1);
			
			if(result == 1)	//Wenn der Nutzer vegetarisch is(s)t
			{
				veg = true;
			}
			else if(result == 0)	//wenn er auch Fleisch zu sich nimmt
			{
				veg = false;
			}
			else	//bei einem Fehler erzeuge eine Fehlermeldung ohne die Lauffähigkeit des Progammes zu ändern
			{
				veg = false;
				JOptionPane.showMessageDialog(null, result,  "Es gab einen Fehler bei der Abfrage in der Datenbank", 0);
				
			}
			conn.close();	//schließe die Verbindung zur Datenbank wieder
			return veg;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
}