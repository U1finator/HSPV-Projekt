package mensaProg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class Wochenplan {
	
	HashMap<String, String> gerichte = new HashMap<String, String>();
	Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
	Wochenplan(){
		try 
		{
			Statement stmt = conn.createStatement();
			int count = 0;
			while(count!=10)
			{
				//int random = (int) (Math.random()*stmt.executeQuery("SELECT MAX(id) FROM gerichte").toString().charAt(0));
				int random = (int) (Math.random()*60);
				String name = stmt.executeQuery("SELECT name FROM gerichte WHERE id="+random).getString(1);	
				String price = stmt.executeQuery("SELECT preis FROM gerichte WHERE id="+random).getString(1);
				//if(stmt.executeQuery("SELECT name FROM gerichte WHERE vegetarisch=0 And id="+random).getString(1)!="") {
				gerichte.put(name, price);	
				count++;
				//}
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
		return gerichte;
	}
	
	public static void main(String[] args)
	{
		Wochenplan a = new Wochenplan();
		a.getGerichte();
	}
}
