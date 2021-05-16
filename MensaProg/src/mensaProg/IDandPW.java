package mensaProg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 * @author Julia
 *
 */
public class IDandPW {
	
	// stores key-value pairs, key = id, value = pw
	HashMap<String, String> logininfo = new HashMap<String, String>();
	Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
	
	IDandPW(){
		try 
		{
			Statement stmt = conn.createStatement();
			for(int i = 1; i <= stmt.executeQuery("SELECT max(id) FROM kunden").getInt(1); i++)	//mithilfe des Statements wird die Anzahl von Nutzern in der Datenbank abgefragt
			{
				logininfo.put(stmt.executeQuery("SELECT username FROM kunden WHERE id="+i).getString(1).toLowerCase() , stmt.executeQuery("SELECT pwort FROM kunden WHERE id="+i).getString(1));	//der Nutzername und das dazugehörige Passwort wird in die Hashmap eingetragen
			}
		} catch (SQLException e){
			// TODO Auto-generated catch block
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
	/**
	 * wenn jemand die Methode aufruft, bekommt er Login info
	 * 
	 * @return Hashmap mit den Logindaten
	 */
	protected HashMap<String, String> getLoginInfo() {
		return logininfo;
	}
}