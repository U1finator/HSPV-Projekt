package mensaProg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;

public class MainGui2 {

	private JFrame frame;
	LocalDate today = LocalDate.now();
    LocalDate[] weekdays = getWeekdays(today);
    Wochenplan week = new Wochenplan();
    Object[] names = week.gerichte.keySet().toArray();
    Object[] prices = week.gerichte.values().toArray();
    String datePattern = "dd.MM.yyyy";
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(datePattern);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui2 window = new MainGui2();
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
	public MainGui2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 870, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 5, 1, 1));
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Gericht 1");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_3, BorderLayout.NORTH);
		
		JLabel lblNewLabel_4 = new JLabel(names[0].toString());
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_4, BorderLayout.CENTER);
		
		JLabel lblNewLabel_5 = new JLabel(prices[0].toString()+"€");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_5, BorderLayout.SOUTH);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("Gericht 1");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_6, BorderLayout.NORTH);
		
		JLabel lblNewLabel_7 = new JLabel(names[1].toString());
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_7, BorderLayout.CENTER);
		
		JLabel lblNewLabel_8 = new JLabel(prices[1].toString()+"€");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_8, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("Gericht 1");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_9, BorderLayout.NORTH);
		
		JLabel lblNewLabel_10 = new JLabel(names[2].toString());
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_10, BorderLayout.CENTER);
		
		JLabel lblNewLabel_11 = new JLabel(prices[2].toString()+"€");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_11, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_12 = new JLabel("Gericht 1");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_12, BorderLayout.NORTH);
		
		JLabel lblNewLabel_13 = new JLabel(names[3].toString());
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_13, BorderLayout.CENTER);
		
		JLabel lblNewLabel_14 = new JLabel(prices[3].toString()+"€");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_14, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_15 = new JLabel("Gericht 1");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_15, BorderLayout.NORTH);
		
		JLabel lblNewLabel_16 = new JLabel(names[4].toString());
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_16, BorderLayout.CENTER);
		
		JLabel lblNewLabel_17 = new JLabel(prices[4].toString()+"€");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_17, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_18 = new JLabel("Gericht 2");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_18, BorderLayout.NORTH);
		
		JLabel lblNewLabel_19 = new JLabel(names[5].toString());
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_19, BorderLayout.CENTER);
		
		JLabel lblNewLabel_20 = new JLabel(prices[5].toString()+"€");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_20, BorderLayout.SOUTH);
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_21 = new JLabel("Gericht 2");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_21, BorderLayout.NORTH);
		
		JLabel lblNewLabel_22 = new JLabel(names[6].toString());
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_22, BorderLayout.CENTER);
		
		JLabel lblNewLabel_23 = new JLabel(prices[6].toString()+"€");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_23, BorderLayout.SOUTH);
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_24 = new JLabel("Gericht 2");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_24, BorderLayout.NORTH);
		
		JLabel lblNewLabel_25 = new JLabel(names[7].toString());
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_25, BorderLayout.CENTER);
		
		JLabel lblNewLabel_26 = new JLabel(prices[7].toString()+"€");
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_26, BorderLayout.SOUTH);
		
		JPanel panel_10 = new JPanel();
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_27 = new JLabel("Gericht 2");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_27, BorderLayout.NORTH);
		
		JLabel lblNewLabel_28 = new JLabel(names[8].toString());
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_28, BorderLayout.CENTER);
		
		JLabel lblNewLabel_29 = new JLabel(prices[8].toString()+"€");
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_29, BorderLayout.SOUTH);
		
		JPanel panel_11 = new JPanel();
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_30 = new JLabel("Gericht 2");
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_30, BorderLayout.NORTH);
		
		JLabel lblNewLabel_31 = new JLabel(names[9].toString());
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_31, BorderLayout.CENTER);
		
		JLabel lblNewLabel_32 = new JLabel(prices[9].toString()+"€");
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_32, BorderLayout.SOUTH);
		
		JPanel panel_12 = new JPanel();
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_33 = new JLabel("Gericht 3");
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_33, BorderLayout.NORTH);
		
		JLabel lblNewLabel_35 = new JLabel("New label");
		lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_35, BorderLayout.SOUTH);
		
		JTextPane txtpnShahjjdajhsdhhDsajhasjddhjajDjshajdhj = new JTextPane();
		txtpnShahjjdajhsdhhDsajhasjddhjajDjshajdhj.setEditable(false);
		txtpnShahjjdajhsdhhDsajhasjddhjajDjshajdhj.setText("\n"+names[1].toString());
		StyledDocument doc2 = txtpnShahjjdajhsdhhDsajhasjddhjajDjshajdhj.getStyledDocument();
		SimpleAttributeSet center2 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center2, StyleConstants.ALIGN_CENTER);
		doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
		panel_12.add(txtpnShahjjdajhsdhhDsajhasjddhjajDjshajdhj, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_36 = new JLabel("Gericht 3");
		lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_36, BorderLayout.NORTH);
		
		JLabel lblNewLabel_38 = new JLabel("New label");
		lblNewLabel_38.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_38, BorderLayout.SOUTH);
		
		JTextPane txtpnSchnitzelMitButtergemse = new JTextPane();
		StyledDocument doc = txtpnSchnitzelMitButtergemse.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		txtpnSchnitzelMitButtergemse.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnSchnitzelMitButtergemse.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		txtpnSchnitzelMitButtergemse.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtpnSchnitzelMitButtergemse.setEditable(false);
		txtpnSchnitzelMitButtergemse.setText("\r\nSchnitzel mit Buttergem\u00FCse in der Pfanne ger\u00F6stet");
		panel_13.add(txtpnSchnitzelMitButtergemse, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_39 = new JLabel("Gericht 3");
		lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_39, BorderLayout.NORTH);
		
		JLabel lblNewLabel_41 = new JLabel("New label");
		lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_41, BorderLayout.SOUTH);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		panel_14.add(textPane_1, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_42 = new JLabel("Gericht 3");
		lblNewLabel_42.setHorizontalAlignment(SwingConstants.CENTER);
		panel_15.add(lblNewLabel_42, BorderLayout.NORTH);
		
		JLabel lblNewLabel_44 = new JLabel("New label");
		lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
		panel_15.add(lblNewLabel_44, BorderLayout.SOUTH);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		panel_15.add(textPane_2, BorderLayout.CENTER);
		
		JPanel panel_16 = new JPanel();
		panel.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_45 = new JLabel("Gericht 3");
		lblNewLabel_45.setHorizontalAlignment(SwingConstants.CENTER);
		panel_16.add(lblNewLabel_45, BorderLayout.NORTH);
		
		JLabel lblNewLabel_47 = new JLabel("New label");
		lblNewLabel_47.setHorizontalAlignment(SwingConstants.CENTER);
		panel_16.add(lblNewLabel_47, BorderLayout.SOUTH);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		panel_16.add(textPane_3, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new GridLayout(2, 5, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Montag");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_52 = new JLabel("Dienstag");
		lblNewLabel_52.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_52);
		
		JLabel lblNewLabel_50 = new JLabel("Mittwoch");
		lblNewLabel_50.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_50);
		
		JLabel lblNewLabel_49 = new JLabel("Donnerstag");
		lblNewLabel_49.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_49);
		
		JLabel lblNewLabel_1 = new JLabel("Freitag");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_51 = new JLabel(weekdays[0].format(dateFormatter));
		lblNewLabel_51.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_51);
		
		JLabel lblNewLabel_53 = new JLabel(weekdays[1].format(dateFormatter));
		lblNewLabel_53.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_53);
		
		JLabel lblNewLabel = new JLabel(weekdays[2].format(dateFormatter));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_48 = new JLabel(weekdays[3].format(dateFormatter));
		lblNewLabel_48.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_48);
		
		JLabel lblNewLabel_54 = new JLabel(weekdays[4].format(dateFormatter));
		lblNewLabel_54.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_54);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Men\u00FC");
		mnNewMenu.setIcon(new ImageIcon(MainGui2.class.getResource("/mensaProg/outline_menu_black_24dp.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Einstellungen");
		mntmNewMenuItem.setIcon(new ImageIcon(MainGui2.class.getResource("/mensaProg/outline_settings_black_24dp.png")));
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Benutzerdaten");
		mntmNewMenuItem_1.setIcon(new ImageIcon(MainGui2.class.getResource("/mensaProg/outline_perm_identity_black_24dp.png")));
		mnNewMenu.add(mntmNewMenuItem_1);
	}
	public static LocalDate[] getWeekdays(LocalDate date) {
	     LocalDate monday = date;
	     if(date.getDayOfWeek().getValue() > 1) {
	       monday = date.minusDays(date.getDayOfWeek().getValue() - 1);
	     }
	     LocalDate[] weekdays = new LocalDate[5];
	     weekdays[0] = monday;
	     for(int i = 1; i <= 4; i++) {
	       weekdays[i] = monday.plusDays(i);
	     }
	     return weekdays;
	   }
}
