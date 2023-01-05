import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame { // INHERITENCE AND IMPLEMENTATIONS

	// ________________________CREATING PANELS___________________
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();
	private JPanel jp4 = new JPanel();
	private JPanel east = new JPanel();

	// ________________________CREATING BUTTONS___________________
	private JButton jb1 = new JButton();
	private JButton jb2 = new JButton();
	private JButton jb3 = new JButton();
	private JButton jb4 = new JButton();

	private JRadioButton jr = new JRadioButton();

	// ________________________CREATING LABELS___________________
	private JLabel headingtext = new JLabel("DIGITAL HANDBOOK");

	// ________________________CREATING IMAGE ICONS___________________

	private JLabel icon = new JLabel(new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\logo.png")).getImage())
			.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));
	private JLabel btn1text = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\book.png")).getImage())
					.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));
	private JLabel btn2text = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\dieticon.png")).getImage())
					.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));
	private JLabel btn3text = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\scheduleicon.png")).getImage())
					.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));
	private JLabel btn4text = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\joystick.png")).getImage())
					.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));
	private JLabel logo = new JLabel(new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\lion.png")).getImage())
			.getScaledInstance(1100, 700, java.awt.Image.SCALE_SMOOTH)));
	private JLabel moon = new JLabel(new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\moon.png")).getImage())
			.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));

//_________________________OBJECTS OF DIFFERENT CLASSES THAT WILL BE IMPLEMENTED AND JFRAME SETTINGS__________________________

	CMS work = new CMS();
	MenuList mu = new MenuList();

	HomePage() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException,
			IllegalAccessException {
		setSize(400, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setTitle("HOME PAGE");
		setVisible(true);

		// ________________ LABEL TEXTS__________________________________

		btn1text.setText("WORK");
		btn2text.setText("DIET PLAN");
		btn3text.setText("GALLERY");
		btn4text.setText("GAME");
		moon.setText("Dark Mode");
		headingtext.setFont(new Font("Arial", Font.BOLD, 80));
		headingtext.setForeground(Color.WHITE);
		btn1text.setForeground(Color.BLACK);
		btn2text.setForeground(Color.BLACK);
		btn3text.setForeground(Color.BLACK);
		btn4text.setForeground(Color.BLACK);

		// ________________ BUTTON SIZE________________________________

		jb1.setBounds(5, 10, 5, 5);
		jb2.setBounds(5, 20, 5, 5);
		jb3.setBounds(5, 30, 5, 5);
		jr.setBounds(75, 50, 100, 30);

		// ________________BUTTON COLORS__________________________________

		jb1.setBackground(Color.lightGray);
		jb2.setBackground(Color.LIGHT_GRAY);
		jb3.setBackground(Color.lightGray);
		jb4.setBackground(Color.lightGray);

		// ________________ PANEL SIZES__________________________________

		jp1.setPreferredSize(new Dimension(200, 500));
		east.setPreferredSize(new Dimension(200, 500));
		jp3.setPreferredSize(new Dimension(200, 100));

		// ________________ ADDING ON PANELS__________________________________
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		east.add(jr);

		// _____________________ADDING LABEL TO BUTTONS_______________________
		jb1.add(btn1text);
		jb2.add(btn2text);
		jb3.add(btn3text);
		jb4.add(btn4text);
		jp2.add(logo);
		jp3.add(headingtext);
		jr.add(moon);

		// ________________ PANEL POSITIONING_________________________________

		jp1.setLayout(new GridLayout(4, 1, 0, 0));

		add(jp3, BorderLayout.NORTH);
		add(jp1, BorderLayout.WEST);
		add(jp2, BorderLayout.CENTER);
		add(east, BorderLayout.EAST);

		// _________________________PANEL COLORS________________________________

		jp3.setBackground(new Color(106, 35, 165));
		jp2.setBackground(new Color(66, 24, 91));
		east.setBackground(Color.lightGray);
		jr.setBackground(Color.lightGray);

		// __________________________ ACTION LISTENERS__________________________

		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				work.setVisible(true);
				setDefaultCloseOperation(HIDE_ON_CLOSE);
				work.setDefaultCloseOperation(HIDE_ON_CLOSE);
				work.setExtendedState(MAXIMIZED_BOTH);
			}
		});

		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				mu.setVisible(true);
				mu.setExtendedState(MAXIMIZED_BOTH);
				mu.setDefaultCloseOperation(EXIT_ON_CLOSE);
				setDefaultCloseOperation(HIDE_ON_CLOSE);
				mu.setDefaultCloseOperation(HIDE_ON_CLOSE);

			}
		});

		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Project p = new Project();
				p.setVisible(true);
				p.setExtendedState(MAXIMIZED_BOTH);
				p.setDefaultCloseOperation(HIDE_ON_CLOSE);
			}
		});

		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GameApplet g = new GameApplet();
				g.setVisible(true);
				g.f.setExtendedState(MAXIMIZED_BOTH);
				g.f.setDefaultCloseOperation(HIDE_ON_CLOSE);

			}
		});

		jr.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jr) {
					if (jr.isSelected()) {

						jp1.setBackground(new Color(75, 97, 103));
						jp2.setBackground(new Color(75, 97, 103));
						jp3.setBackground(new Color(75, 97, 103));
						jp4.setBackground(new Color(75, 97, 103));
						east.setBackground(new Color(75, 97, 103));

						jb1.setBackground(new Color(75, 97, 103));
						jb2.setBackground(new Color(75, 97, 103));
						jb3.setBackground(new Color(75, 97, 103));
						jb4.setBackground(new Color(75, 97, 103));
						jr.setBackground(new Color(75, 97, 103));

						east.setBorder(new LineBorder(Color.BLACK));
						jp1.setBorder(new LineBorder(Color.BLACK));
						jp2.setBorder(new LineBorder(Color.BLACK));
						jp3.setBorder(new LineBorder(Color.BLACK));
						jp4.setBorder(new LineBorder(Color.BLACK));

						btn1text.setForeground(Color.WHITE);
						btn2text.setForeground(Color.WHITE);
						btn3text.setForeground(Color.WHITE);
						btn4text.setForeground(Color.WHITE);
					} else {

						jp2.setBackground(new Color(66, 24, 91));
						jp3.setBackground(new Color(106, 35, 165));

						jb1.setBackground(Color.lightGray);
						jb2.setBackground(Color.LIGHT_GRAY);
						jb3.setBackground(Color.lightGray);
						jb4.setBackground(Color.lightGray);
						east.setBackground(Color.lightGray);
						jp4.setBackground(Color.lightGray);
						jr.setBackground(Color.lightGray);

						btn1text.setForeground(Color.BLACK);
						btn2text.setForeground(Color.BLACK);
						btn3text.setForeground(Color.BLACK);
						btn4text.setForeground(Color.BLACK);

					}
				}

			}
		});

	}

	public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException,
			InstantiationException, IllegalAccessException {

		HomePage hp = new HomePage();
	}

}
