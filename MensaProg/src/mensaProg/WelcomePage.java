package mensaProg;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Willkommen.");
	
	WelcomePage(String userID) {
		
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,20));
		welcomeLabel.setText("Hallo "+userID);
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}