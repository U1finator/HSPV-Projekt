package mensaProg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JRadioButton;
import java.awt.GridBagConstraints;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Insets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
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

public class MainGUI {

	private JFrame frame;
	LocalDate today = LocalDate.now();
    LocalDate[] weekdays = getWeekdays(today);

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
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel Montag = new JLabel("Montag");
		GridBagConstraints gbc_Montag = new GridBagConstraints();
		gbc_Montag.insets = new Insets(0, 0, 5, 5);
		gbc_Montag.gridx = 1;
		gbc_Montag.gridy = 3;
		frame.getContentPane().add(Montag, gbc_Montag);
		
		JLabel lblNewLabel_1 = new JLabel("Dienstag");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 3;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Mittwoch");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 3;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Donnerstag");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 3;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Freitag");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 5;
		gbc_lblNewLabel_3.gridy = 3;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		 
		JLabel lblNewLabel_4 = new JLabel(weekdays[0].toString());
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 6;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_20 = new JLabel(weekdays[1].toString());
		GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
		gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_20.gridx = 2;
		gbc_lblNewLabel_20.gridy = 6;
		frame.getContentPane().add(lblNewLabel_20, gbc_lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel(weekdays[2].toString());
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_21.gridx = 3;
		gbc_lblNewLabel_21.gridy = 6;
		frame.getContentPane().add(lblNewLabel_21, gbc_lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel(weekdays[3].toString());
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_22.gridx = 4;
		gbc_lblNewLabel_22.gridy = 6;
		frame.getContentPane().add(lblNewLabel_22, gbc_lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel(weekdays[4].toString());
		GridBagConstraints gbc_lblNewLabel_23 = new GridBagConstraints();
		gbc_lblNewLabel_23.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_23.gridx = 5;
		gbc_lblNewLabel_23.gridy = 6;
		frame.getContentPane().add(lblNewLabel_23, gbc_lblNewLabel_23);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(153, 204, 204));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 8;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Pommes");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_27 = new JLabel("5\u20AC");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_27, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_31 = new JLabel("Gericht 1");
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_31, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 2;
		gbc_panel_4.gridy = 8;
		frame.getContentPane().add(panel_4, gbc_panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("Gericht 1");
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_24 = new JLabel("Pommes");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_24);
		
		JLabel lblNewLabel_28 = new JLabel("Gericht 1");
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_28, BorderLayout.NORTH);
		
		JLabel lblNewLabel_25 = new JLabel("3\u20AC");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_25, BorderLayout.SOUTH);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panel_13 = new GridBagConstraints();
		gbc_panel_13.insets = new Insets(0, 0, 5, 5);
		gbc_panel_13.fill = GridBagConstraints.BOTH;
		gbc_panel_13.gridx = 3;
		gbc_panel_13.gridy = 8;
		frame.getContentPane().add(panel_13, gbc_panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_12 = new JLabel("Gericht 1");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_12, BorderLayout.NORTH);
		
		JLabel lblNewLabel_26 = new JLabel("Nudeln");
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_26, BorderLayout.CENTER);
		
		JLabel lblNewLabel_42 = new JLabel("New label");
		lblNewLabel_42.setHorizontalAlignment(SwingConstants.CENTER);
		panel_13.add(lblNewLabel_42, BorderLayout.SOUTH);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panel_14 = new GridBagConstraints();
		gbc_panel_14.insets = new Insets(0, 0, 5, 5);
		gbc_panel_14.fill = GridBagConstraints.BOTH;
		gbc_panel_14.gridx = 4;
		gbc_panel_14.gridy = 8;
		frame.getContentPane().add(panel_14, gbc_panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_15 = new JLabel("Gericht 1");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_15, BorderLayout.NORTH);
		
		JLabel lblNewLabel_43 = new JLabel("New label");
		lblNewLabel_43.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_43, BorderLayout.CENTER);
		
		JLabel lblNewLabel_44 = new JLabel("New label");
		lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
		panel_14.add(lblNewLabel_44, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 5;
		gbc_panel.gridy = 8;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("Gericht 1");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBackground(Color.YELLOW);
		panel.add(lblNewLabel_5, BorderLayout.NORTH);
		
		JLabel lblNewLabel_29 = new JLabel("Pommes");
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_29, BorderLayout.CENTER);
		
		JLabel lblNewLabel_30 = new JLabel("5\u20AC");
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_30, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 9;
		frame.getContentPane().add(panel_2, gbc_panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Gericht 2");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_7, BorderLayout.NORTH);
		
		JLabel lblNewLabel_32 = new JLabel("New label");
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_32, BorderLayout.CENTER);
		
		JLabel lblNewLabel_33 = new JLabel("New label");
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_33, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 2;
		gbc_panel_5.gridy = 9;
		frame.getContentPane().add(panel_5, gbc_panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_10 = new JLabel("Gericht 2");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_10, BorderLayout.NORTH);
		
		JLabel lblNewLabel_34 = new JLabel("New label");
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_34, BorderLayout.CENTER);
		
		JLabel lblNewLabel_35 = new JLabel("New label");
		lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_35, BorderLayout.SOUTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 5, 5);
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 3;
		gbc_panel_7.gridy = 9;
		frame.getContentPane().add(panel_7, gbc_panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_13 = new JLabel("Gericht 2");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_13, BorderLayout.NORTH);
		
		JLabel lblNewLabel_36 = new JLabel("New label");
		lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_36, BorderLayout.CENTER);
		
		JLabel lblNewLabel_37 = new JLabel("New label");
		lblNewLabel_37.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_37, BorderLayout.SOUTH);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.insets = new Insets(0, 0, 5, 5);
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 4;
		gbc_panel_9.gridy = 9;
		frame.getContentPane().add(panel_9, gbc_panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_16 = new JLabel("Gericht 2");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_16, BorderLayout.NORTH);
		
		JLabel lblNewLabel_38 = new JLabel("New label");
		lblNewLabel_38.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_38, BorderLayout.CENTER);
		
		JLabel lblNewLabel_39 = new JLabel("New label");
		lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_39, BorderLayout.SOUTH);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.insets = new Insets(0, 0, 5, 0);
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 5;
		gbc_panel_11.gridy = 9;
		frame.getContentPane().add(panel_11, gbc_panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_18 = new JLabel("Gericht 2");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_18, BorderLayout.NORTH);
		
		JLabel lblNewLabel_40 = new JLabel("New label");
		lblNewLabel_40.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_40, BorderLayout.CENTER);
		
		JLabel lblNewLabel_41 = new JLabel("New label");
		lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
		panel_11.add(lblNewLabel_41, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBackground(new Color(0, 255, 153));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 10;
		frame.getContentPane().add(panel_3, gbc_panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_45 = new JLabel("New label");
		lblNewLabel_45.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_45, BorderLayout.CENTER);
		
		JLabel lblNewLabel_48 = new JLabel("New label");
		lblNewLabel_48.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_48, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_6 = new JLabel("Gericht 1");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_6, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6.setBackground(Color.GREEN);
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.insets = new Insets(0, 0, 0, 5);
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 2;
		gbc_panel_6.gridy = 10;
		frame.getContentPane().add(panel_6, gbc_panel_6);
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
		panel_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_8.setBackground(Color.GREEN);
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 0, 5);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 3;
		gbc_panel_8.gridy = 10;
		frame.getContentPane().add(panel_8, gbc_panel_8);
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
		panel_10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_10.setBackground(Color.GREEN);
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.insets = new Insets(0, 0, 0, 5);
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 4;
		gbc_panel_10.gridy = 10;
		frame.getContentPane().add(panel_10, gbc_panel_10);
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
		panel_12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_12.setBackground(Color.GREEN);
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 5;
		gbc_panel_12.gridy = 10;
		frame.getContentPane().add(panel_12, gbc_panel_12);
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
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
