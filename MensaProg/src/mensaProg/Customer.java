package mensaProg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer 
{		
	Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
	public void deposit(int einzahlung, String name)	//Methode um Geld einzuzahlen
	{		
		try {
			Statement	stmt = conn.createStatement();	//erstelle ein neues SQLite Statement
			stmt.execute("UPDATE Kunden SET Kontostand= Kontostand+'" + einzahlung + "' WHERE nutzername='" + name + "'");	//ein SQL Statement wird durchgefÃ¼hrt um den Kontostand zu erhÃ¶hen
		
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
	
	public void withdraw (int auszahlung, String name)	//Methode um Geld auszuzahlen
	{
		try {
			Statement	stmt = conn.createStatement();	//ein neues SQL Statement wrid einstellt
			stmt.execute("UPDATE Kunden SET Kontostand=Kontostand-'" + auszahlung + "' WHERE vorname='" + name + "'");	//ein SQL Statement wird durchgefÃ¼hrt um den Kontostand zu verringern
		
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
	
	public void add(String vorname, String nachname, String pwort)	//Methode um einen neuen Kunden hinzuzufügen
	{
		try {
			Statement	stmt = conn.createStatement();	//ein neues SQL Statement wrid einstellt
			stmt.execute("INSERT INTO kunden(vorname, nachname, pwort, username, kontostand) VALUES ('" + vorname + "','" + nachname +"','" + pwort + "','" + vorname.toLowerCase() +"."+ nachname.toLowerCase() +"','0' )");	//ein SQL Statement wird durchgeführt um einen neuen Kunden anzulegen
		
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
	
	public double getKontostand(Kunde kunde)
	{
		try {
			Statement stmt = conn.createStatement();
			return stmt.executeQuery("SELECT kontostand FROM kunden WHERE username = '" + kunde.getUsername()+"'").getDouble(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0.0;
		}
	}
	
	public void editpw(String name, String pwort)	//Methode um das Passwort zu �ndern
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
	
	public void editVeg(String username, int veg)	//Methode um den Status Vegetarisch in der Datenbank zu �ndern
	{
		try {
			Statement	stmt = conn.createStatement();	//ein neues SQL Statement wrid einstellt
			stmt.execute("UPDATE Kunden SET vegetrarisch='"+ veg +"'  WHERE username='" + username + "'");		
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
