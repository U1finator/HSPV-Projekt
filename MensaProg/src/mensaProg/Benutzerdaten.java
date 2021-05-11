package mensaProg;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Benutzerdaten implements ActionListener{
	
	JFrame frame = new JFrame();
	JLabel userDataLabel = new JLabel("Benutzerdaten");
	JLabel bankBalanceLabel = new JLabel("Kontostand");
	JLabel nutritionLabel = new JLabel("Ernährung");
	JLabel IDLabel = new JLabel("Benutzername");
	JLabel PWLabel = new JLabel("Passwort");
	JButton changePW = new JButton("Passwort ändern");
	
	Benutzerdaten(Kunde kunde) {
		IDLabel.setBounds(50,100,200,35);
		IDLabel.setFont(new Font(null,Font.PLAIN,16));
		IDLabel.setText("Benutzername: "+kunde.getUsername());
		
		PWLabel.setBounds(50,125,200,35);
		PWLabel.setFont(new Font(null,Font.PLAIN,16));
		PWLabel.setText("Passwort: "+kunde.getPW());
		
		changePW.setBounds(60,125,200,35);
		changePW.addActionListener(this);
		
		frame.getContentPane().add(IDLabel);
		frame.getContentPane().add(PWLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==changePW) {
			//addedpw userID, newpassword
		}
	}
}