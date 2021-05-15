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
							
	
	static String ern�hrungsString = "Ern�hrung";
	
	//Frames, Labels, CheckBox werden erstellt
	JFrame frame = new JFrame();
	//JLabel welcomeLabel = new JLabel("Einstellungen");
	JLabel bankBalanceLabel = new JLabel("Kontostand");
	JLabel nutritionLabel = new JLabel("Ern�hrung");
	JCheckBox checkBoxErn�hrung = new JCheckBox("vegetarisch");
	public static boolean veg = false;
	
	WelcomePage(Kunde kunde, MainGui2 mg) {
		Customer customer = new Customer();
		
		/* Willkommen-Label wird erstellt
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,20));
		welcomeLabel.setText("Hallo ");*/
		
		//Kontostand-Label + momentaner Kontostand
		bankBalanceLabel.setBounds(50,100,200,35);
		bankBalanceLabel.setFont(new Font(null,Font.PLAIN,16));
		bankBalanceLabel.setText("Kontostand: "+ customer.getKontostand(kunde));
		
		//Ern�hrungs-Label
		nutritionLabel.setBounds(50,140,200,35);
		nutritionLabel.setFont(new Font(null,Font.PLAIN,16));
		nutritionLabel.setText("Ern�hrung: ");
		
		checkBoxErn�hrung.setBounds(150,140,200,35);
		checkBoxErn�hrung.addItemListener(new ItemListener() {
		    @Override
		    public void itemStateChanged(ItemEvent e) {
                if(checkBoxErn�hrung.isSelected()==true) {
                    veg = true;
                mg.FleischWeg();
                }
                else  {
                    veg = false; 
                    mg.FleischDa();
                    }
                	revalidate();
                	repaint();
                }}); 
	
		//Labels, Checkbox werden Panel hinzugef�gt
		//frame.getContentPane().add(welcomeLabel);
		frame.getContentPane().add(bankBalanceLabel);
		frame.getContentPane().add(nutritionLabel);
		frame.getContentPane().add(checkBoxErn�hrung);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(420,420);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}


	public static boolean getVeg() {
		return veg;
	}
}