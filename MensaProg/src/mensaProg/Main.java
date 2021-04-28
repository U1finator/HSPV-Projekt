package mensaProg;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JOptionPane;

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
		
		IDandPW idandpw = new IDandPW();
		LoginPage logininfo = new LoginPage(idandpw.getLoginInfo());
		
		try {
			conn.close();	//die Verbindung soll geschlossen werden
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}