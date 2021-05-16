package mensaProg;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePage	extends JPanel {				
/**
 * @author Julia, [U1finator(Olaf) in der Code Review]
 *
 */
public class WelcomePage {
	
	static String ernährungsString = "Ernährung";
	
	//Frames, Labels, CheckBox werden erstellt
	JFrame frame = new JFrame();
	//JLabel welcomeLabel = new JLabel("Einstellungen");
	JLabel bankBalanceLabel = new JLabel("Kontostand");
	JLabel nutritionLabel = new JLabel("Ernährung");
	JCheckBox checkBoxErnährung = new JCheckBox("vegetarisch");
	
	WelcomePage(Kunde kunde, MainGui2 mg) {
	/**
	 * @param kunde
	 * 
	 * Konstruktor der Benutzerdaen
	 */
	WelcomePage(Kunde kunde) {
		Customer customer = new Customer();
		
		/* Willkommen-Label wird erstellt
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,20));
		welcomeLabel.setText("Hallo ");*/
		
		//Kontostand-Label + momentaner Kontostand
		bankBalanceLabel.setBounds(50,100,200,35);
		bankBalanceLabel.setFont(new Font(null,Font.PLAIN,16));
		bankBalanceLabel.setText("Kontostand: "+ customer.getKontostand(kunde.getUsername()));
		
		//Ernährungs-Label
		nutritionLabel.setBounds(50,140,200,35);
		nutritionLabel.setFont(new Font(null,Font.PLAIN,16));
		nutritionLabel.setText("Ernährung: ");
		
		//CheckBox, check ob vegetarische Ernährung, wenn ja: Aufruf Methode FleischWeg in MainGui2
		checkBoxErnährung.setBounds(150,140,200,35);
		checkBoxErnährung.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
                if(checkBoxErnährung.isSelected()==true) {
                    mg.FleischWeg();
                }
                else  {
                    mg.FleischDa();
                    }
                }}); 
	
		//Labels, Checkbox werden Panel hinzugefügt
		//frame.getContentPane().add(welcomeLabel);
		frame.getContentPane().add(bankBalanceLabel);
		frame.getContentPane().add(nutritionLabel);
		frame.getContentPane().add(checkBoxErnährung);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(420,420);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}

}
