package mensaProg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 * @author Felix, U1finator(Olaf) Code Review
 *
 */
public class Wochenplan { //Klasse um einen Wochenplan zu erstellen, welcher von der MainGui abgerufen wird

    HashMap<String, String> gerichte = new HashMap<>(); //eine HashMap für alle Fleischgerichte wird erstellt
    HashMap<String,String> vegGerichte = new HashMap<>(); //eine HashMap für alle vegetarischen Gerichte wird erstellt
    Connection conn = SqlConnector.dbConnector();//eine Verbindung zur SQLite Datenbank wird hergestellt


    /**
     *  Konstruktor für den Wochenplan
     */
    Wochenplan(){
        try 
        {
            Statement stmt = conn.createStatement();
            while(gerichte.size()!=10) //die HashMap wird mit zehn Fleischgerichten und dem dazugehörigen Preis befüllt (HashMap verhindert Dopplungen)
            {
                int random = (int) (Math.random()*stmt.executeQuery("SELECT MAX(id) FROM BBQ").getInt(1)+1);
                String name = stmt.executeQuery("SELECT name FROM BBQ WHERE id="+random).getString(1);
                String price = stmt.executeQuery("SELECT preis FROM BBQ WHERE id="+random).getString(1);
                gerichte.put(name, price);
            }
            while(vegGerichte.size()!=5) //dasselbe wie oben, nur mit fünf vegetarischen Gerichten
            {
                int random = (int) (Math.random()*stmt.executeQuery("SELECT MAX(id) FROM Vegetarisch").getInt(1)+1);
                String name = stmt.executeQuery("SELECT name FROM Vegetarisch WHERE id="+random).getString(1);
                String price = stmt.executeQuery("SELECT preis FROM Vegetarisch WHERE id="+random).getString(1);
                vegGerichte.put(name, price);
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
try 
        {
            conn.close();    //die Verbindung zur Datenbank wird wieder geschlossen
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
