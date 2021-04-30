package mensaProg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Wochenplan {
	
	HashMap<String, String> gerichte = new HashMap<String, String>();
	Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
	
	Wochenplan(){
		try 
		{
			Statement stmt = conn.createStatement();
			for(int i = 1; i <= stmt.executeQuery("SELECT MAX(id) FROM gerichte").toString().charAt(0); i++)	//mithilfe des Statements wird die Anzahl von Gerichten in der Datenbank abgefragt
			{
				gerichte.put(stmt.executeQuery("SELECT name FROM gerichte WHERE id="+i).getString(1), stmt.executeQuery("SELECT preis FROM gerichte WHERE id="+i).getString(1));	//das Gericht mit dazugehörigem Preis wird abgefragt
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

	public static void main(String[] args) {
		create();
		

	}

}
