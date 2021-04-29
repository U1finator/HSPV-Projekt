package mensaProg;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Wochenplan {
	
	public static void create()  {
		Connection conn = SqlConnector.dbConnector();
		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.execute("Select * From Gerichte");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		create();
		

	}

}
