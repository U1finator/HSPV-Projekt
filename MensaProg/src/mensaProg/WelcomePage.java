package mensaProg;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
			
/**
 * @author Julia, [U1finator(Olaf) in der Code Review]
 *
 */
public class WelcomePage extends JPanel{
	
	static String ernaehrungsString = "Ernährung";
	
	//Frames, Labels, CheckBox werden erstellt
	/**
	 * der generelle Frame
	 */
	JFrame frame = new JFrame();
	//JLabel welcomeLabel = new JLabel("Einstellungen");
	/**
	 * Label für den Kontostand
	 */
	JLabel bankBalanceLabel = new JLabel("Kontostand");
	/**
	 * Label für die Ernährungsauswahl
	 */
	JLabel nutritionLabel = new JLabel("Ernährung");
	/**
	 * Checkbox um die nicht vegetarischen Gerischte ein- bzw. auszublenden
	 */
	JCheckBox checkBoxErnaehrung = new JCheckBox("vegetarisch");
	
	/**
	 * @param kunde	Kundenobjekt zur Zwischenspeicherung
	 * @param mg	Daten der MainGUI
	 */
	WelcomePage(Kunde kunde, MainGui2 mg) {
		Customer customer = new Customer();
		
		/* Willkommen-Label wird erstellt
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,20));
		welcomeLabel.setText("Hallo ");*/
		
		//Kontostand-Label + momentaner Kontostand
		bankBalanceLabel.setBounds(50,100,200,35);
		bankBalanceLabel.setFont(new Font(null,Font.PLAIN,16));
		bankBalanceLabel.setText("Kontostand: "+ customer.getKontostand(kunde.getUsername()));
		
		//ErnÃ¤hrungs-Label
		nutritionLabel.setBounds(50,140,200,35);
		nutritionLabel.setFont(new Font(null,Font.PLAIN,16));
		nutritionLabel.setText("Ernährung: ");
		
		//CheckBox, check ob vegetarische Ernährung, wenn ja: Aufruf Methode FleischWeg in MainGui2
		checkBoxErnaehrung.setBounds(150,140,200,35);
		checkBoxErnaehrung.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
                if(checkBoxErnaehrung.isSelected()==true) {
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
		frame.getContentPane().add(checkBoxErnaehrung);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(420,420);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}

}
