package mensaProg;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
	JButton ok = new JButton("Ok");
	JTextField newPW = new JTextField();
	/**
	 * Nutzername des Benutzers
	 */

	public String username;
	/**
	 * Passwort des Benutzers
	 */
	public String password;
	Kunde kunde;
	
	/**
	 * @param kunde 
	 * @param kunde Objekt, dass wichtige Nutzerdaten zwischenspeichert
	 */
	Benutzerdaten(Kunde kunde) 
		{
			this.kunde = kunde;
			username = kunde.getUsername();
			password = kunde.getPW();
			IDLabel.setBounds(50,100,250,35);
			IDLabel.setFont(new Font(null,Font.PLAIN,16));
			IDLabel.setText("Benutzername: "+kunde.getUsername());
		
			//Passwort Label wird erstellt + Anzeige des jeweiligen Passworts
			PWLabel.setBounds(50,125,250,35);
			PWLabel.setFont(new Font(null,Font.PLAIN,16));
			PWLabel.setText("Passwort: "+kunde.getPW());
		
			// Passwort ändern Button wird erstellt
			changePW.setBounds(100,200,200,35);
			changePW.addActionListener(this);
			changePW.setText("Passwort ändern");
			
			// ok Button wird erstellt, erstmal nicht sichbar
			ok.setBounds(150,310,100,35);
			ok.addActionListener(this);
			ok.setVisible(false);
		
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
		// klick auf Button changePW macht neues textfield und ok button sichtbar
		if(e.getSource()==changePW) 
		{
			newPW.setBounds(100,250,200,35);
			frame.add(newPW);
			newPW.setVisible(true);
			frame.add(ok);
			ok.setVisible(true);
			
		// klick auf ok: neues pw wird erstellt, gespeichert & angezeigt	
		}else if(e.getSource()==ok)
		{
			String newPassword = newPW.getText();
			kunde.setPW(newPassword);
			Customer customer = new Customer();
			username = kunde.getUsername();
			customer.editpw(username, newPassword);
			PWLabel.setText("Passwort: "+kunde.getPW());
			customer.editPW(username, password);
			//password = neues Passwort
		}
	}
}