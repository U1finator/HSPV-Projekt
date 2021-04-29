package mensaProg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class Gerichte 
{
	Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
	HashMap<String, Double> food = new HashMap<String, Double>();	//eine Hashmap um die Gerichte leichter zur Verfügung zu haben
	
	Gerichte()
	{
		try 
		{
			Statement stmt = conn.createStatement();
			for(int i = 1; i <= stmt.executeQuery("SELECT MAX(id) FROM kunden").toString().charAt(0); i++)	//mithilfe des Statements wird die Anzahl von Nutzern in der Datenbank abgefragt
			{
//				food.put(stmt.executeQuery("SELECT username FROM kunden WHERE id="+i).getString(1).toLowerCase() , stmt.executeQuery("SELECT pwort FROM kunden WHERE id="+i).getString(1));	//der Nutzername und das dazugehörige Passwort wird in die Hashmap eingetragen
			}
			conn.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}