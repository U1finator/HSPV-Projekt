package mensaProg;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Customer 
{	
	public String vorname;
	public String nachname;
	public Customer(String vorname, String nachname)	//ein Konstruktor der bals die Namen vom Login bekommen soll
	{
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public void deposit(int einzahlung)
	{
		Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
		
		
		try {
			Statement	stmt = conn.createStatement();	//erstelle ein neues SQLite Statement
			stmt.execute("UPDATE Kunden SET Kontostand= Kontostand+'" + einzahlung + "' WHERE vorname='" + getVorname() + "' AND nachname='" + getNachname()+"'");	//ein SQL Statement wird durchgeführt um den Kontostand zu erhöhen
		
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
	
	public void withdraw (int auszahlung)
	{
		Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
		
		
		try {
			Statement	stmt = conn.createStatement();	//ein neues SQL Statement wrid einstellt
			stmt.execute("UPDATE Kunden SET Kontostand=Kontostand-'" + auszahlung + "' WHERE vorname='" + getVorname() + "' AND nachname='" + getNachname()+"'");	//ein SQL Statement wird durchgeführt um den Kontostand zu verringern
		
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

	public String getNachname() {
		// TODO Auto-generated method stub
		return this.nachname;
	}

	public String getVorname() {
		return this.vorname;
	}
}