package mensaProg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

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
import java.awt.Font;
import java.awt.Component;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.LineBorder;

/**
 * @author Felix
 *
 */
public class MainGui2 {

	private JFrame frame;
	LocalDate today = LocalDate.now();
    LocalDate[] weekdays = getWeekdays(today);
    Wochenplan week = new Wochenplan();
    Object[] names = week.gerichte.keySet().toArray();
    Object[] prices = week.gerichte.values().toArray();
    Object[] vegNames = week.vegGerichte.keySet().toArray();
    Object[] vegPrices = week.vegGerichte.values().toArray();
    String datePattern = "dd.MM.yyyy";
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(datePattern);
    JTextPane[] meat = new JTextPane[10];
    JLabel[] mprices = new JLabel[10];
	/**
	 * Launch the application.
	 */
	

	/**
	 * @param kunde Zwischenspeicherungsobjekt
	 * 
	 * Create the application.
	 */
	public MainGui2(Kunde kunde) {
		initialize(kunde);
		frame.setVisible(true);
	}

	/**
	 * @param kunde Zwischenspeicherungsobjekt
	 * Initialisiere das Objekt
	 */
	private void initialize(Kunde kunde) {
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
		
		JLabel lblNewLabel_5 = new JLabel(prices[0].toString()+"�");
		mprices[0] = lblNewLabel_5;
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_5, BorderLayout.SOUTH);
		
		JTextPane txtpnA = new JTextPane();
		txtpnA.setEditable(false);
		
		txtpnA.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtpnA.isEnabled()==true) {
				txtpnA.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				txtpnA.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtpnA.isEnabled()==true&& check==false) {
				check = true;
				txtpnA.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check= false;
					txtpnA.setBorder(null);
				}
			}
		});
		meat[0] = txtpnA;
		txtpnA.setBackground(Color.LIGHT_GRAY);
		txtpnA.setSelectedTextColor(Color.BLACK);
		txtpnA.setForeground(Color.BLACK);
		txtpnA.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtpnA.setText("\n"+ names[0].toString());
		center(txtpnA);
		panel_6.add(txtpnA, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("Gericht 1");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_6, BorderLayout.NORTH);
		
		JLabel lblNewLabel_8 = new JLabel(prices[1].toString()+"�");
		mprices[1] = lblNewLabel_8;
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_8, BorderLayout.SOUTH);
		
		JTextPane txtpnA_1 = new JTextPane();
		txtpnA_1.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtpnA_1.isEnabled()==true) {
				txtpnA_1.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				txtpnA_1.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtpnA_1.isEnabled()==true&& check==false) {
				check = true;
				txtpnA_1.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					txtpnA_1.setBorder(null);
				}
			}
		});
		meat[1] = txtpnA_1;
		txtpnA_1.setBackground(Color.LIGHT_GRAY);
		txtpnA_1.setEditable(false);
		txtpnA_1.setForeground(Color.BLACK);
		txtpnA_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtpnA_1.setText("\n"+ names[1].toString());
		center(txtpnA_1);
		panel_7.add(txtpnA_1, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("Gericht 1");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_9, BorderLayout.NORTH);
		
		JLabel lblNewLabel_11 = new JLabel(prices[2].toString()+"�");
		mprices[2] = lblNewLabel_11;
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_11, BorderLayout.SOUTH);
		
		JTextPane txtpnA_2 = new JTextPane();
		txtpnA_2.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtpnA_2.isEnabled()==true) {
				txtpnA_2.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				txtpnA_2.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtpnA_2.isEnabled()==true&& check==false) {
				check = true;
				txtpnA_2.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					txtpnA_2.setBorder(null);
				}
			}
		});
		meat[2] = txtpnA_2;
		txtpnA_2.setBackground(Color.LIGHT_GRAY);
		txtpnA_2.setEditable(false);
		txtpnA_2.setForeground(Color.BLACK);
		txtpnA_2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtpnA_2.setText("\n"+ names[2].toString());
		center(txtpnA_2);
		panel_3.add(txtpnA_2, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_12 = new JLabel("Gericht 1");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_12, BorderLayout.NORTH);
		
		JLabel lblNewLabel_14 = new JLabel(prices[3].toString()+"�");
		mprices[3] = lblNewLabel_14;
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_14, BorderLayout.SOUTH);
		
		JTextPane txtpnA_3 = new JTextPane();
		txtpnA_3.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtpnA_3.isEnabled()==true) {
				txtpnA_3.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				txtpnA_3.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtpnA_3.isEnabled()==true&& check==false) {
				check = true;
				txtpnA_3.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					txtpnA_3.setBorder(null);
				}
			}
		});
		meat[3] = txtpnA_3;
		txtpnA_3.setBackground(Color.LIGHT_GRAY);
		txtpnA_3.setEditable(false);
		txtpnA_3.setForeground(Color.BLACK);
		txtpnA_3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtpnA_3.setText("\n"+ names[3].toString());
		center(txtpnA_3);
		panel_1.add(txtpnA_3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_15 = new JLabel("Gericht 1");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_15, BorderLayout.NORTH);
		
		JLabel lblNewLabel_17 = new JLabel(prices[4].toString()+"�");
		mprices[4] = lblNewLabel_17;
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_17, BorderLayout.SOUTH);
		
		JTextPane txtpnA_4 = new JTextPane();
		txtpnA_4.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtpnA_4.isEnabled()==true) {
				txtpnA_4.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				txtpnA_4.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtpnA_4.isEnabled()==true&& check==false) {
				check = true;
				txtpnA_4.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					txtpnA_4.setBorder(null);
				}
			}
		});
		meat[4] = txtpnA_4;
		txtpnA_4.setBackground(Color.LIGHT_GRAY);
		txtpnA_4.setEditable(false);
		txtpnA_4.setForeground(Color.BLACK);
		txtpnA_4.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtpnA_4.setText("\n"+ names[4].toString());
		center(txtpnA_4);
		panel_4.add(txtpnA_4, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_18 = new JLabel("Gericht 2");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_18, BorderLayout.NORTH);
		
		JLabel lblNewLabel_20 = new JLabel(prices[5].toString()+"�");
		mprices[5] = lblNewLabel_20;
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_20, BorderLayout.SOUTH);
		
		JTextPane txtpnA_5 = new JTextPane();
		txtpnA_5.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtpnA_5.isEnabled()==true) {
				txtpnA_5.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				txtpnA_5.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtpnA_5.isEnabled()==true&& check==false) {
				check = true;
				txtpnA_5.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					txtpnA_5.setBorder(null);
				}
			}
		});
		meat[5] = txtpnA_5;
		txtpnA_5.setBackground(Color.LIGHT_GRAY);
		txtpnA_5.setEditable(false);
		txtpnA_5.setForeground(Color.BLACK);
		txtpnA_5.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtpnA_5.setText("\n"+ names[5].toString());
		center(txtpnA_5);
		panel_5.add(txtpnA_5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_21 = new JLabel("Gericht 2");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_21, BorderLayout.NORTH);
		
		JLabel lblNewLabel_23 = new JLabel(prices[6].toString()+"�");
		mprices[6] = lblNewLabel_23;
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_8.add(lblNewLabel_23, BorderLayout.SOUTH);
		
		JTextPane txtpnA_6 = new JTextPane();
		txtpnA_6.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtpnA_6.isEnabled()==true) {
				txtpnA_6.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				txtpnA_6.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtpnA_6.isEnabled()==true&& check==false) {
				check = true;
				txtpnA_6.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					txtpnA_6.setBorder(null);
				}
			}
		});
		meat[6] = txtpnA_6;
		txtpnA_6.setBackground(Color.LIGHT_GRAY);
		txtpnA_6.setEditable(false);
		txtpnA_6.setForeground(Color.BLACK);
		txtpnA_6.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtpnA_6.setText("\n"+ names[6].toString());
		center(txtpnA_6);
		panel_8.add(txtpnA_6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_24 = new JLabel("Gericht 2");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_24, BorderLayout.NORTH);
		
		JLabel lblNewLabel_26 = new JLabel(prices[7].toString()+"�");
		mprices[7] = lblNewLabel_26;
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_26, BorderLayout.SOUTH);
		
		JTextPane txtpnA_7 = new JTextPane();
		txtpnA_7.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtpnA_7.isEnabled()==true) {
				txtpnA_7.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				txtpnA_7.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtpnA_7.isEnabled()==true&& check==false) {
				check = true;
				txtpnA_7.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					txtpnA_7.setBorder(null);
				}
			}
		});
		meat[7] = txtpnA_7;
		txtpnA_7.setBackground(Color.LIGHT_GRAY);
		txtpnA_7.setEditable(false);
		txtpnA_7.setForeground(Color.BLACK);
		txtpnA_7.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtpnA_7.setText("\n"+ names[7].toString());
		center(txtpnA_7);
		panel_9.add(txtpnA_7, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_27 = new JLabel("Gericht 2");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_27, BorderLayout.NORTH);
		
		JLabel lblNewLabel_29 = new JLabel(prices[8].toString()+"�");
		mprices[8] = lblNewLabel_29;
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(lblNewLabel_29, BorderLayout.SOUTH);
		
		JTextPane txtpnA_8 = new JTextPane();
		txtpnA_8.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtpnA_8.isEnabled()==true) {
				txtpnA_8.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				txtpnA_8.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtpnA_8.isEnabled()==true&& check==false) {
				check = true;
				txtpnA_8.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					txtpnA_8.setBorder(null);
				}
			}
		});
		meat[8] = txtpnA_8;
		txtpnA_8.setBackground(Color.LIGHT_GRAY);
		txtpnA_8.setEditable(false);
		txtpnA_8.setForeground(Color.BLACK);
		txtpnA_8.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtpnA_8.setText("\n"+ names[8].toString());
		center(txtpnA_8);
		panel_10.add(txtpnA_8, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_30 = new JLabel("Gericht 2");
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_30, BorderLayout.NORTH);
		
		JLabel lblNewLabel_32 = new JLabel(prices[9].toString()+"�");
		mprices[9] = lblNewLabel_32;
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_32, BorderLayout.SOUTH);
		
		JTextPane txtpnA_9 = new JTextPane();
		txtpnA_9.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtpnA_9.isEnabled()==true) {
				txtpnA_9.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				txtpnA_9.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtpnA_9.isEnabled()==true&& check==false) {
				check = true;
				txtpnA_9.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					txtpnA_2.setBorder(null);
				}
			}
		});
		meat[9] = txtpnA_9;
		txtpnA_9.setBackground(Color.LIGHT_GRAY);
		txtpnA_9.setEditable(false);
		txtpnA_9.setForeground(Color.BLACK);
		txtpnA_9.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtpnA_9.setText("\n"+ names[9].toString());
		center(txtpnA_9);
		panel_11.add(txtpnA_9, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 204, 153));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_33 = new JLabel("Gericht 3");
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_33, BorderLayout.NORTH);
		
		JLabel lblNewLabel_35 = new JLabel(vegPrices[0].toString()+"�");
		lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
		panel_12.add(lblNewLabel_35, BorderLayout.SOUTH);
		
		JTextPane textPane = new JTextPane();
		textPane.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(textPane.isEnabled()==true) {
				textPane.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				textPane.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textPane.isEnabled()==true&& check==false) {
				check = true;
				textPane.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					textPane.setBorder(null);
				}
			}
		});
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setForeground(Color.BLACK);
		textPane.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		textPane.setEditable(false);
		textPane.setText("\n"+ vegNames[0].toString());
		center(textPane);
		panel_12.add(textPane, BorderLayout.CENTER);
		
		
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(0, 204, 153));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_36 = new JLabel("Gericht 3");
		lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_36, BorderLayout.NORTH);
		
		JLabel lblNewLabel_38 = new JLabel(vegPrices[1].toString()+"�");
		lblNewLabel_38.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_38, BorderLayout.SOUTH);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(textPane_1.isEnabled()==true) {
				textPane_1.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				textPane_1.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textPane_1.isEnabled()==true&& check==false) {
				check = true;
				textPane_1.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					textPane_1.setBorder(null);
				}
			}
		});
		textPane_1.setBackground(Color.LIGHT_GRAY);
		textPane_1.setForeground(Color.BLACK);
		textPane_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		textPane_1.setEditable(false);
		textPane_1.setText("\n"+ vegNames[1].toString());
		center(textPane_1);
		panel_13.add(textPane_1, BorderLayout.CENTER);
	
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(0, 204, 153));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_39 = new JLabel("Gericht 3");
		lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_39, BorderLayout.NORTH);
		
		JLabel lblNewLabel_41 = new JLabel(vegPrices[2].toString()+"�");
		lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_41, BorderLayout.SOUTH);
		
		JTextPane txtpnA_10 = new JTextPane();
		txtpnA_10.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtpnA_10.isEnabled()==true) {
				txtpnA_10.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				txtpnA_10.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtpnA_10.isEnabled()==true&& check==false) {
				check = true;
				txtpnA_10.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					txtpnA_10.setBorder(null);
				}
			}
		});
		txtpnA_10.setBackground(Color.LIGHT_GRAY);
		txtpnA_10.setEditable(false);
		txtpnA_10.setDisabledTextColor(Color.BLACK);
		txtpnA_10.setForeground(Color.BLACK);
		txtpnA_10.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtpnA_10.setText("\n"+ vegNames[2].toString());
		center(txtpnA_10);
		panel_14.add(txtpnA_10, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(0, 204, 153));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_42 = new JLabel("Gericht 3");
		lblNewLabel_42.setHorizontalAlignment(SwingConstants.CENTER);
		panel_15.add(lblNewLabel_42, BorderLayout.NORTH);
		
		JLabel lblNewLabel_44 = new JLabel(vegPrices[3].toString()+"�");
		lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
		panel_15.add(lblNewLabel_44, BorderLayout.SOUTH);
		
		JTextPane txtpnA_11 = new JTextPane();
		txtpnA_11.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtpnA_11.isEnabled()==true) {
				txtpnA_11.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				txtpnA_11.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtpnA_11.isEnabled()==true&& check==false) {
				check = true;
				txtpnA_11.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					txtpnA_11.setBorder(null);
				}
			}
		});
		txtpnA_11.setBackground(Color.LIGHT_GRAY);
		txtpnA_11.setEditable(false);
		txtpnA_11.setDisabledTextColor(Color.BLACK);
		txtpnA_11.setForeground(Color.BLACK);
		txtpnA_11.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtpnA_11.setText("\n"+ vegNames[3].toString());
		center(txtpnA_11);
		panel_15.add(txtpnA_11, BorderLayout.CENTER);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(0, 204, 153));
		panel.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_45 = new JLabel("Gericht 3");
		lblNewLabel_45.setHorizontalAlignment(SwingConstants.CENTER);
		panel_16.add(lblNewLabel_45, BorderLayout.NORTH);
		
		JLabel lblNewLabel_47 = new JLabel(vegPrices[4].toString()+"�");
		lblNewLabel_47.setHorizontalAlignment(SwingConstants.CENTER);
		panel_16.add(lblNewLabel_47, BorderLayout.SOUTH);
		
		JTextPane txtpnA_12 = new JTextPane();
		txtpnA_12.addMouseListener(new MouseAdapter() {
			boolean check = false;
			@Override
			public void mouseEntered(MouseEvent e) {
				if(txtpnA_12.isEnabled()==true) {
				txtpnA_12.setBorder(new LineBorder(Color.RED, 1, true));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(check==false) {
				txtpnA_12.setBorder(null);
				}
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtpnA_12.isEnabled()==true&& check==false) {
				check = true;
				txtpnA_12.setBorder(new LineBorder(Color.RED, 1, true));
				}
				else if(check==true) {
					check = false;
					txtpnA_12.setBorder(null);
				}
			}
		});
		txtpnA_12.setBackground(Color.LIGHT_GRAY);
		txtpnA_12.setEditable(false);
		txtpnA_12.setDisabledTextColor(Color.BLACK);
		txtpnA_12.setForeground(Color.BLACK);
		txtpnA_12.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		txtpnA_12.setText("\n"+ vegNames[4].toString());
		center(txtpnA_12);
		panel_16.add(txtpnA_12, BorderLayout.CENTER);
		
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
		mntmNewMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new WelcomePage(kunde, MainGui2.this);
				
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(MainGui2.class.getResource("/mensaProg/outline_settings_black_24dp.png")));
		mnNewMenu.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Benutzerdaten");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Benutzerdaten(kunde);
				
			}
		});
		mntmNewMenuItem_1.setIcon(new ImageIcon(MainGui2.class.getResource("/mensaProg/outline_perm_identity_black_24dp.png")));
		mnNewMenu.add(mntmNewMenuItem_1);
	}
	
	/**
	 * @param date Datum
	 * @return Array mit dem Aktuellen Datum
	 */
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
	
	/**
	 * @param textPane Textfeld
	 */
	public static void center (JTextPane textPane) {
		StyledDocument doc = textPane.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
	}
	

	/**
	 *  Methode um die Gerichte mit Fleisch auszublenden
	 */
	public void FleischWeg() {
		for(int i=0;i<meat.length;i++) {
			meat[i].setEnabled(false);
			mprices[i].setVisible(false);
		}
		
	}
  
	/**
	 * Methode um Gerichte mit Fleisch einzublenden
	 */
	public void FleischDa() {
		for(int i=0;i<meat.length;i++) {
			meat[i].setEnabled(true);
			mprices[i].setVisible(true);
		}
	}
}
