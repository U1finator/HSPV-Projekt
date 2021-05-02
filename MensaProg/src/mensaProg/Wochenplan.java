package mensaProg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class Wochenplan {
	
	HashMap<String, String> gerichte = new HashMap<>();
	HashMap<String,String> vegGerichte = new HashMap<>();
	boolean again = true;
	Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
	Wochenplan(){
		try 
		{
			Statement stmt = conn.createStatement();
			int count = 0;
			while(count!=10)
			{
				int random = (int) (Math.random()*stmt.executeQuery("SELECT MAX(id) FROM gerichte").getInt(1));
				//int random = (int) (Math.random()*60);
				String name = stmt.executeQuery("SELECT name FROM gerichte WHERE id="+random).getString(1);	
				String price = stmt.executeQuery("SELECT preis FROM gerichte WHERE id="+random).getString(1);
				//if(stmt.executeQuery("SELECT name FROM gerichte WHERE vegetarisch=0 And id="+random).getString(1)!="") {
				gerichte.put(name, price);	
				count++;
				//}
			}
			int count2 = 0;
			//boolean again =true;
//			while(count2!=5 || again==true)
//			{
//				int random = (int) (Math.random()*60);
//				String name = stmt.executeQuery("SELECT name FROM gerichte WHERE vegetarisch=1 And id="+random).getString(1);	
//				String price = stmt.executeQuery("SELECT preis FROM gerichte WHERE id="+random).getString(1);
//				vegGerichte.put(name, price);
//				again = false;
//				count2++;
		//}
		}
		catch (SQLException e)
		{
			again=true;
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
		//System.out.println(vegGerichte);
		return gerichte;
	}
	
	public static void main(String[] args)
	{
		Wochenplan a = new Wochenplan();
		a.getGerichte();
	}
}
