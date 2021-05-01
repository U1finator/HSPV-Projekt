package mensaProg;

import java.awt.EventQueue;
import java.sql.*;
import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author Felix, Julia, Olaf
 *
 */
public class Main 
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		// TODO Auto-generated method stub
		Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
		
		IDandPW idandpw = new IDandPW();
		LoginPage logininfo = new LoginPage(idandpw.getLoginInfo());
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}