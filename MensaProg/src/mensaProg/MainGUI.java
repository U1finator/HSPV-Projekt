package mensaProg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JRadioButton;
import java.awt.GridBagConstraints;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Insets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.border.CompoundBorder;
import javax.swing.JSeparator;

public class MainGUI {

	private JFrame frame;
	LocalDate today = LocalDate.now();
    LocalDate[] weekdays = getWeekdays(today);
    Wochenplan week = new Wochenplan();
    Object[] names = week.gerichte.keySet().toArray();
    Object[] prices = week.gerichte.values().toArray();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
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
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 903, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 6, 0, 0));
		
		JLabel label = new JLabel("");
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("");
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("");
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("");
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("");
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("");
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("");
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("");
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("");
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("");
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("");
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("");
		frame.getContentPane().add(label_18);
		
		JLabel Montag = new JLabel("Montag");
		frame.getContentPane().add(Montag);
		
		JLabel lblNewLabel_1 = new JLabel("Dienstag");
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Mittwoch");
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Donnerstag");
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Freitag");
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label_19 = new JLabel("");
		frame.getContentPane().add(label_19);
		
		JLabel label_20 = new JLabel("");
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("");
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("");
		frame.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("");
		frame.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel("");
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("");
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("");
		frame.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("");
		frame.getContentPane().add(label_27);
		
		JLabel label_28 = new JLabel("");
		frame.getContentPane().add(label_28);
		
		JLabel label_29 = new JLabel("");
		frame.getContentPane().add(label_29);
		
		JLabel label_30 = new JLabel("");
		frame.getContentPane().add(label_30);
		
		JLabel label_31 = new JLabel("");
		frame.getContentPane().add(label_31);
		
		 
		JLabel lblNewLabel_4 = new JLabel(weekdays[0].toString());
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_20 = new JLabel(weekdays[1].toString());
		frame.getContentPane().add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel(weekdays[2].toString());
		frame.getContentPane().add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel(weekdays[3].toString());
		frame.getContentPane().add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel(weekdays[4].toString());
		frame.getContentPane().add(lblNewLabel_23);
		
		JLabel label_32 = new JLabel("");
		frame.getContentPane().add(label_32);
		
		JLabel label_33 = new JLabel("");
		frame.getContentPane().add(label_33);
		
		JLabel label_34 = new JLabel("");
		frame.getContentPane().add(label_34);
		
		JLabel label_35 = new JLabel("");
		frame.getContentPane().add(label_35);
		
		JLabel label_36 = new JLabel("");
		frame.getContentPane().add(label_36);
		
		JLabel label_37 = new JLabel("");
		frame.getContentPane().add(label_37);
		
		JLabel label_38 = new JLabel("");
		frame.getContentPane().add(label_38);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(153, 204, 204));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_8 = new JLabel(names[0].toString());
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_27 = new JLabel(prices[0].toString()+"€");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_27, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_31 = new JLabel("Gericht 1");
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_31, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(153, 204, 204));
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("Gericht 1");
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_24 = new JLabel(names[1].toString());
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_24);
		
		JLabel lblNewLabel_28 = new JLabel("Gericht 1");
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_28, BorderLayout.NORTH);
		
		JLabel lblNewLabel_25 = new JLabel(prices[1].toString()+"€");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_25, BorderLayout.SOUTH);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(153, 204, 204));
		panel_13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_12 = new JLabel("Gericht 1");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_12, BorderLayout.NORTH);
		
		JLabel lblNewLabel_26 = new JLabel(names[2].toString());
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_26, BorderLayout.CENTER);
		
		JLabel lblNewLabel_42 = new JLabel(prices[2].toString()+"€");
		lblNewLabel_42.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_42, BorderLayout.SOUTH);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(153, 204, 204));
		panel_14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_15 = new JLabel("Gericht 1");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_15, BorderLayout.NORTH);
		
		JLabel lblNewLabel_43 = new JLabel(names[3].toString());
		lblNewLabel_43.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_43, BorderLayout.CENTER);
		
		JLabel lblNewLabel_44 = new JLabel(prices[3].toString()+"€");
		lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_44, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(153, 204, 204));
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("Gericht 1");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBackground(Color.YELLOW);
		panel.add(lblNewLabel_5, BorderLayout.NORTH);
		
		JLabel lblNewLabel_29 = new JLabel(names[4].toString());
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_29, BorderLayout.CENTER);
		
		JLabel lblNewLabel_30 = new JLabel(prices[4].toString()+"€");
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_30, BorderLayout.SOUTH);
		
		JLabel label_39 = new JLabel("");
		frame.getContentPane().add(label_39);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 204));
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Gericht 2");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_7, BorderLayout.NORTH);
		
		JLabel lblNewLabel_32 = new JLabel(names[5].toString());
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_32, BorderLayout.CENTER);
		
		JLabel lblNewLabel_33 = new JLabel(prices[5].toString()+"€");
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_33, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(153, 204, 204));
		panel_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("Gericht 2");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_10, BorderLayout.NORTH);
		
		JLabel lblNewLabel_34 = new JLabel(names[6].toString());
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_34, BorderLayout.CENTER);
		
		JLabel lblNewLabel_35 = new JLabel(prices[6].toString()+"€");
		lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_35, BorderLayout.SOUTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(153, 204, 204));
		panel_7.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_13 = new JLabel("Gericht 2");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_13, BorderLayout.NORTH);
		
		JLabel lblNewLabel_36 = new JLabel(names[7].toString());
		lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_36, BorderLayout.CENTER);
		
		JLabel lblNewLabel_37 = new JLabel(prices[7].toString()+"€");
		lblNewLabel_37.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_37, BorderLayout.SOUTH);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(153, 204, 204));
		panel_9.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_16 = new JLabel("Gericht 2");
		lblNewLabel_16.setBackground(new Color(153, 204, 204));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_16, BorderLayout.NORTH);
		
		JLabel lblNewLabel_38 = new JLabel(names[8].toString());
		lblNewLabel_38.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_38, BorderLayout.CENTER);
		
		JLabel lblNewLabel_39 = new JLabel(prices[8].toString()+"€");
		lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_39, BorderLayout.SOUTH);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(153, 204, 204));
		panel_11.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_18 = new JLabel("Gericht 2");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_18, BorderLayout.NORTH);
		
		JLabel lblNewLabel_40 = new JLabel("t");
		lblNewLabel_40.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_40, BorderLayout.CENTER);
		
		JLabel lblNewLabel_41 = new JLabel("€");
		lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_41, BorderLayout.SOUTH);
		
		JLabel label_40 = new JLabel("");
		frame.getContentPane().add(label_40);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBackground(new Color(102, 255, 102));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_45 = new JLabel("New label");
		lblNewLabel_45.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_45, BorderLayout.CENTER);
		
		JLabel lblNewLabel_48 = new JLabel("New label");
		lblNewLabel_48.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_48, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_6 = new JLabel("Gericht 3");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_6, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_6.setBackground(new Color(102, 255, 102));
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_11 = new JLabel("Gericht 3");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_11, BorderLayout.NORTH);
		
		JLabel lblNewLabel_46 = new JLabel("New label");
		lblNewLabel_46.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_46, BorderLayout.CENTER);
		
		JLabel lblNewLabel_49 = new JLabel("New label");
		lblNewLabel_49.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_49, BorderLayout.SOUTH);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_8.setBackground(new Color(102, 255, 102));
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_14 = new JLabel("Gericht 3");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_14, BorderLayout.NORTH);
		
		JLabel lblNewLabel_47 = new JLabel("New label");
		lblNewLabel_47.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_47, BorderLayout.CENTER);
		
		JLabel lblNewLabel_50 = new JLabel("New label");
		lblNewLabel_50.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_50, BorderLayout.SOUTH);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_10.setBackground(new Color(102, 255, 102));
		frame.getContentPane().add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_17 = new JLabel("Gericht 3");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_17, BorderLayout.NORTH);
		
		JLabel lblNewLabel_51 = new JLabel("New label");
		lblNewLabel_51.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_51, BorderLayout.CENTER);
		
		JLabel lblNewLabel_52 = new JLabel("New label");
		lblNewLabel_52.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_52, BorderLayout.SOUTH);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_12.setBackground(new Color(102, 255, 102));
		frame.getContentPane().add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_19 = new JLabel("Gericht 3");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_19, BorderLayout.NORTH);
		
		JLabel lblNewLabel_53 = new JLabel("New label");
		lblNewLabel_53.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_53, BorderLayout.CENTER);
		
		JLabel lblNewLabel_54 = new JLabel("New label");
		lblNewLabel_54.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_54, BorderLayout.SOUTH);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Men\u00FC");
		mnNewMenu.setIcon(new ImageIcon(MainGUI.class.getResource("/mensaProg/outline_menu_black_24dp.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Einstellungen");
		mntmNewMenuItem.setIcon(new ImageIcon(MainGUI.class.getResource("/mensaProg/outline_settings_black_24dp.png")));
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Benutzerdaten");
		mntmNewMenuItem_1.setIcon(new ImageIcon(MainGUI.class.getResource("/mensaProg/outline_perm_identity_black_24dp.png")));
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
	

