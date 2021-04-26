package mensaProg;

import java.awt.Color;
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
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("L�schen");
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
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		userIDField.setBounds(150,100,200,25);
		userPasswordField.setBounds(150,150,200,25);
		
		loginButton.setBounds(150,200,100,25);
		//loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(250,200,100,25);
		//resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
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
		
		if(e.getSource()==loginButton) {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			//HashMap Zugriff
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
					messageLabel.setText("Login erfolgreich");
					frame.dispose(); //Schlie�en des Login Fensters
					WelcomePage welcomePage = new WelcomePage(userID);
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

