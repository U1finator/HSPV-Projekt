package mensaProg;

import java.util.HashMap;

public class IDandPW {
	
	// stores key-value pairs, key = id, value = pw
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IDandPW(){
		
		logininfo.put("Julia", "pap12345");
		logininfo.put("Olaf", "hspv");
		logininfo.put("Felix", "passwort");
	}
	//wenn jemand die Methode aufruft, bekommt er Login info
	protected HashMap<String, String> getLoginInfo() {
		return logininfo;
	}

}
