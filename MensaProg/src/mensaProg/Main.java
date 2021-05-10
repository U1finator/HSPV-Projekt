package mensaProg;

import java.sql.*;

/**
 * @author Felix, Julia, Olaf
 *
 */
public class Main 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
		
		Kunde kunde = new Kunde();
		IDandPW idandpw = new IDandPW();
		LoginPage logininfo = new LoginPage(idandpw.getLoginInfo(), kunde);
		
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
