package mensaProg;

import java.sql.*;
import static java.time.temporal.ChronoUnit.MILLIS;
import java.io.IOException;
import static java.time.Instant.now;
import java.time.Instant;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author Felix, Julia, U1finator (Olaf)
 *
 */
public class Main 
{
	private static final Logger log = Logger.getLogger(Main.class.getName());	//ein Logger wird hinzugefügt
	/**
	 * @param args argumente
	 * @throws SecurityException Sicherheitsmeldung
	 * @throws IOException beim IO sind Fehler passiert
	 */
	public static void main(String[] args) throws SecurityException, IOException
	{
		Instant start = now();	//der Logger wird gestartet
		log.addHandler(new FileHandler("log.txt"));	//neue Datei wird erzeugt

		log.info("Start");	//Am Anfang der Datei wird das Wort "Start" angefügt
		try {
			log.log(Level.INFO, "");	//Anfangszeit des Programmes wird gespeichert 
		} catch (Exception e) {
			log.log(Level.SEVERE, "Fehler", e);	//bei einem Fehler wird wird der mit in die Logging Datei geschrieben
		}
		log.info(() -> String.format("Laufzeit %s ms", start.until(now(), MILLIS)));	//die Laufzeit des Programmes wird hinzugefügt
		/*
		 * bis hier hin geht der Code des Loggers, der alle Systemrelevanten Ereignisse "mitschreibt"
		 */
		
		// TODO Auto-generated method stub
		Connection conn = SqlConnector.dbConnector();	//eine Verbindung zur SQLite Datenbank wird hergestellt
		
		Kunde kunde = new Kunde();	//ein neues Kundenobjekt wird erzeugt
		IDandPW idandpw = new IDandPW();	//eine Instanz von IDandPW wird erzeugt
		LoginPage logininfo = new LoginPage(idandpw.getLoginInfo(), kunde);	//eine neue LoginInfo wird erzeugt
		
		
		try {
			conn.close();	//es soll versucht werden die Verbindung zu der Datenbank zu schließen
		} catch (SQLException e) {	//sonst schmeiße den Fehler aus
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
