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
		
		/*
		 * hier kommt der restliche Code hinein
		 */
		
		try {
			conn.close();	//die Verbindung soll geschlossen werden
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Customer cust = new Customer("Tom", "Kasanova");	//MUSS NOCH GEMACHT WERDEN
		cust.deposit(12);
		
		IDandPW idandpw = new IDandPW();
		LoginPage logininfo = new LoginPage(idandpw.getLoginInfo());
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}