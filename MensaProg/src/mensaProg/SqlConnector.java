package mensaProg;

import java.sql.*;
import javax.swing.*;

/**
 * @author U1finator (Olaf)
 *
 * Der Connector f�r die SQLite Datenbank
 *
 */
public class SqlConnector 
{
	Connection con = null;	//Anlegung der Variable con als Connection Referenz
	/**
	 * @return con R�ckgabe der Verbindung
	 */
	public static Connection dbConnector()
	{
		try
		{
			Class.forName("org.sqlite.JDBC");	//Definierung der Klasse der SQLite Verbindung
			Connection con = DriverManager.getConnection("jdbc:sqlite:Mensadaten.db");	//Angabe des Pfades der Datenbank mit relativem Pfad um Projekt f�r jeden Rechner nutzbar zu machen
			return con;	//R�chgabe der Verbindung
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);	//Ausgabe des Fehlers in einem neu erzeugtem Fenster
			return null;	//null wird zur�ckgegeben
		}
	}
}