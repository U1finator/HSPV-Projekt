package mensaProg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class Wochenplan {
	
	HashMap<String, String> gerichte = new HashMap<>();
	HashMap<String,String> vegGerichte = new HashMap<>();
	Connection conn = SqlConnector.dbConnector();//eine Verbindung zur SQLite Datenbank wird hergestellt

	
	Wochenplan(){
		try 
		{
			Statement stmt = conn.createStatement();
			while(gerichte.size()!=10)
			{
				int random = (int) (Math.random()*stmt.executeQuery("SELECT MAX(id) FROM BBQ").getInt(1)+1);
				String name = stmt.executeQuery("SELECT name FROM BBQ WHERE id="+random).getString(1);	
				String price = stmt.executeQuery("SELECT preis FROM BBQ WHERE id="+random).getString(1);
				gerichte.put(name, price);	
			}
			while(vegGerichte.size()!=5)
			{
				int random = (int) (Math.random()*stmt.executeQuery("SELECT MAX(id) FROM Vegetarisch").getInt(1)+1);
				String name = stmt.executeQuery("SELECT name FROM Vegetarisch WHERE id="+random).getString(1);	
				String price = stmt.executeQuery("SELECT preis FROM Vegetarisch WHERE id="+random).getString(1);
				vegGerichte.put(name, price);	
			}

		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		try 
		{
			conn.close();	//die Verbindung zur Datenbank wird wieder geschlossen
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//wenn jemand die Methode aufruft, bekommt er Login info
	protected HashMap<String, String> getGerichte() {
		System.out.println(gerichte);
		System.out.println(vegGerichte);
		//System.out.println(vegGerichte);
		return gerichte;
	}
	public static void create()  {
		Connection conn = SqlConnector.dbConnector();
		Statement stmt;
		try {
			stmt = conn.createStatement();
			int random = (int) (Math.random()*stmt.executeQuery("SELECT MAX(id) FROM gerichte").toString().charAt(0));
			System.out.println(random);
			//System.out.println(stmt.executeQuery("SELECT name FROM gerichte").getString(random));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
}