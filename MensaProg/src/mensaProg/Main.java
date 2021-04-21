package mensaProg;

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
		
		/*
		 * hier kommt der restliche Code hinein
		 */
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}