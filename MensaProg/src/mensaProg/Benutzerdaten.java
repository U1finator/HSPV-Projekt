package mensaProg;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Julia, [U1finator (Olaf) im Code Review]
 *
 */
public class Benutzerdaten implements ActionListener
{
	
	JFrame frame = new JFrame();
	JLabel userDataLabel = new JLabel("Benutzerdaten");
	JLabel bankBalanceLabel = new JLabel("Kontostand");
	JLabel nutritionLabel = new JLabel("Ernährung");
	JLabel IDLabel = new JLabel("Benutzername");
	JLabel PWLabel = new JLabel("Passwort");
	JButton changePW = new JButton("Passwort ändern");
	/**
	 * Nutzername des Benutzers
	 */
	public String username;
	/**
	 * Passwort des Benutzers
	 */
	public String password;
	
	/**
	 * @param kunde Objekt, dass wichtige Nutzerdaten zwischenspeichert
	 */
	Benutzerdaten(Kunde kunde) 
		{
			username = kunde.getUsername();
			password = kunde.getPW();
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
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.setVisible(true);
		}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		if(e.getSource()==changePW) 
		{
			Customer customer = new Customer();
			customer.editPW(username, password);
			//password = neues Passwort
		}
	}
}