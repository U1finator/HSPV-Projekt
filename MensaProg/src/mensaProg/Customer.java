package mensaProg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Customer 
{		
	public void deposit(int einzahlung, String name)	//Methode um Geld einzuzahlen
	{
		Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
		
		
		try {
			Statement	stmt = conn.createStatement();	//erstelle ein neues SQLite Statement
			stmt.execute("UPDATE Kunden SET Kontostand= Kontostand+'" + einzahlung + "' WHERE nutzername='" + name + "'");	//ein SQL Statement wird durchgeführt um den Kontostand zu erhöhen
		
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
		Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
		
		
		try {
			Statement	stmt = conn.createStatement();	//ein neues SQL Statement wrid einstellt
			stmt.execute("UPDATE Kunden SET Kontostand=Kontostand-'" + auszahlung + "' WHERE vorname='" + name + "'");	//ein SQL Statement wird durchgeführt um den Kontostand zu verringern
		
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
	
	public void add(String vorname, String nachname, String pwort)	//Methode um einen neuen Kunden hinzuzuf�gen
	{
		Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
		
		
		try {
			Statement	stmt = conn.createStatement();	//ein neues SQL Statement wrid einstellt
			stmt.execute("INSERT INTO kunden{vorname, nachname, pwort, nutzername} VALUES {" + vorname + "," + nachname +"," + pwort + "," + vorname +"."+ nachname +" }");	//ein SQL Statement wird durchgef�hrt um einen neuen Kunden anzulegen
		
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
}