package mensaProg;

import java.sql.*;
import javax.swing.*;

public class SqlConnector 
{
	Connection con = null;	//Anlegung der Variable con als Connection Referenz
	public static Connection dbConnector()
	{
		try
		{
			Class.forName("org.sqlite.JDBC");	//Definierung der Klasse der SQLite Verbindung
			Connection con = DriverManager.getConnection("jdbc:sqlite:Mensadaten.db");	//Angabe des Pfades der Datenbank mit relativem Pfad um Projekt für jeden Rechner nutzbar zu machen
			//JOptionPane.showMessageDialog(null, "Verbindung hergestellt. \n Daten werden geladen.");	//Erzeugung eines Fenster um anzuzeigen, dass eine Verbindung hergestellt wurde
			return con;	//Rüchgabe der Verbindung
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);	//Ausgabe des Fehlers in einem neu erzeugtem Fenster
			return null;	//null wird zurückgegeben
		}
	}
}