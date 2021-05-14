package mensaProg;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Benutzerdaten implements ActionListener
{
	
	JFrame frame = new JFrame();
	JLabel userDataLabel = new JLabel("Benutzerdaten");
	JLabel bankBalanceLabel = new JLabel("Kontostand");
	JLabel nutritionLabel = new JLabel("Ern�hrung");
	JLabel IDLabel = new JLabel("Benutzername");
	JLabel PWLabel = new JLabel("Passwort");
	JButton changePW = new JButton("Passwort �ndern");
	public String username;
	public String password;
	
	Benutzerdaten(Kunde kunde) 
		{
			username = kunde.getUsername();
			password = kunde.getPW();
			IDLabel.setBounds(50,100,250,35);
			IDLabel.setFont(new Font(null,Font.PLAIN,16));
			IDLabel.setText("Benutzername: "+kunde.getUsername());
		
			PWLabel.setBounds(50,125,250,35);
			PWLabel.setFont(new Font(null,Font.PLAIN,16));
			PWLabel.setText("Passwort: "+kunde.getPW());
		
			changePW.setBounds(100,200,200,35);
			changePW.addActionListener(this);
			changePW.setText("Passwort �ndern");
		
			frame.getContentPane().add(IDLabel);
			frame.getContentPane().add(PWLabel);
			frame.getContentPane().add(changePW);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setSize(420,420);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
		}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		if(e.getSource()==changePW) 
		{
			Customer customer = new Customer();
			customer.editpw(username, password);
			//password = neues Passwort
		}
	}
}