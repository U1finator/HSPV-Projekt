package mensaProg;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 * @author Julia, [U1finator(Olaf) in der Code Review]
 *
 */
public class WelcomePage {
	
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Einstellungen");
	JLabel bankBalanceLabel = new JLabel("Kontostand");
	JLabel nutritionLabel = new JLabel("Ernährung");
	
	/**
	 * @param kunde
	 * 
	 * Konstruktor der Benutzerdaen
	 */
	WelcomePage(Kunde kunde) {
		Customer customer = new Customer();
		
		// Willkommen-Label wird erstellt
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,20));
		welcomeLabel.setText("Hallo ");
		
		//Kontostand-Label + momentaner Kontostand
		bankBalanceLabel.setBounds(50,100,200,35);
		bankBalanceLabel.setFont(new Font(null,Font.PLAIN,16));
		bankBalanceLabel.setText("Kontostand: "+ customer.getKontostand(kunde.getUsername()));
		
		//Ernährungs-Label
		nutritionLabel.setBounds(50,120,200,35);
		nutritionLabel.setFont(new Font(null,Font.PLAIN,16));
		nutritionLabel.setText("Ernährung: ");
		JRadioButton rdbtnNewRadioButton = new JRadioButton("vegetarisch");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(rdbtnNewRadioButton, BorderLayout.EAST);
		
		
		frame.getContentPane().add(welcomeLabel);
		frame.getContentPane().add(bankBalanceLabel);
		frame.getContentPane().add(nutritionLabel);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(420,420);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
}
