package mensaProg;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	public String username;
	
	JFrame frame = new JFrame();
	JButton login = new JButton("Login");
	JButton resetButton = new JButton("Löschen");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("Benutzername:");
	JLabel userPasswordLabel = new JLabel("Passwort:");
	JLabel messageLabel = new JLabel("");
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	//constructor
	LoginPage(HashMap<String,String> loginInfoOriginal) {
		
		logininfo = loginInfoOriginal;
		
		userIDLabel.setBounds(50,100,120,25);
		userPasswordLabel.setBounds(50,150,120,25); //
		
		messageLabel.setBounds(125,250,250,35); // Momentan leer
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIDField.setBounds(150,100,200,25);
		userPasswordField.setBounds(150,150,200,25);
		
		login.setBounds(150,200,100,25);
		//loginButton.setFocusable(false);
		login.addActionListener(this);
		
		resetButton.setBounds(250,200,100,25);
		//resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(login);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Reset Button resets fields
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource()==login) {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			//HashMap Zugriff
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
					username = userID;
					messageLabel.setText("Login erfolgreich");
					Kunde kunde = new Kunde(userID,password);
					frame.dispose(); //Schließen des Login Fensters
					//WelcomePage welcomePage = new WelcomePage(userID);
					
					EventQueue.invokeLater(new Runnable() {		//nach erfolgreichem einloggen, wird die hauptseite aufgerufen
						public void run() {
							try {
								MainGUI window = new MainGUI();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
					messageLabel.setText("Falsches Passwort");
				}
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
				messageLabel.setText("Falscher Benutzername");
			}
		}
	}
	
}