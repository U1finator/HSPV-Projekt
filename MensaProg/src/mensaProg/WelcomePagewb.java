package mensaProg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 * @author Julia
 *
 */
public class WelcomePagewb {

	/**
	 * frame
	 */
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/**
	 * @param args args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePagewb window = new WelcomePagewb();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomePagewb() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("vegetarisch");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(rdbtnNewRadioButton, BorderLayout.EAST);
	}

}
