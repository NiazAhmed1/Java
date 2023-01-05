
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class SlideShow extends JFrame {

	private JButton previous_button = new JButton("PREVIOUS");
	private JButton next_button = new JButton("NEXT");
	private JButton play_button = new JButton("PLAY");
	private JButton home_button = new JButton();

	private JPanel north = new JPanel();
	private JPanel south = new JPanel();
	private JPanel centre = new JPanel();
	private JPanel jp2 = new JPanel();
	
	//Creating JLabel for home icon
	
	private JLabel home_icon = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\home.png")).getImage())
					.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));
	
	//Creating JLabel for icon
	
	private JLabel icon = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\galleryback.png")).getImage())
					.getScaledInstance(300, 690, java.awt.Image.SCALE_SMOOTH)));

	//Creating JLabel for pic 1
	
	private JLabel pic1 = new JLabel(new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\dpic.jpg")).getImage())
			.getScaledInstance(100, 200, java.awt.Image.SCALE_SMOOTH)));

	//Creating JLabel for pic 2

	private JLabel pic2 = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\galleryback.png")).getImage())
					.getScaledInstance(300, 690, java.awt.Image.SCALE_SMOOTH)));

	//Creating JLabel for pic 3
	
	private JLabel pic3 = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\galleryback.png")).getImage())
					.getScaledInstance(300, 690, java.awt.Image.SCALE_SMOOTH)));

	//Creating JLabel for pic 4
	
	private JLabel pic4 = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\galleryback.png")).getImage())
					.getScaledInstance(300, 690, java.awt.Image.SCALE_SMOOTH)));

	//Creating JLabel for pic 5
	
	private JLabel pic5 = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\galleryback.png")).getImage())
					.getScaledInstance(300, 690, java.awt.Image.SCALE_SMOOTH)));

	//Creating JLabel for pic 6
	
	private JLabel pic6 = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\galleryback.png")).getImage())
					.getScaledInstance(300, 690, java.awt.Image.SCALE_SMOOTH)));

	//Creating JLabel for pic 7
	
	private JLabel pic7 = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\galleryback.png")).getImage())
					.getScaledInstance(300, 690, java.awt.Image.SCALE_SMOOTH)));

	SlideShow() {

		setSize(400, 500);
		setDefaultCloseOperation(HIDE_ON_CLOSE);

		setTitle("Gallery");
		setExtendedState(MAXIMIZED_BOTH);
		setLocationRelativeTo(null);

		home_icon.setText("Home");
		home_button.add(home_icon);

		north.setBackground(new Color(190, 200, 138));
		south.setBackground(new Color(190, 200, 138));

		centre.setBackground(new Color(100, 20, 50));
		//Setting background colors
		home_button.setBackground(new Color(190, 200, 138));
		previous_button.setBackground(new Color(87, 87, 87));
		next_button.setBackground(new Color(87, 87, 87));
		play_button.setBackground(new Color(87, 87, 87));
		
		//Setting preffered sizes
		
		centre.setPreferredSize(new Dimension(400, 500));
		north.setPreferredSize(new Dimension(400, 100));
		south.setPreferredSize(new Dimension(400, 100));

		previous_button.setBorder(null);
		next_button.setBorder(null);
		home_button.setBorder(null);
		play_button.setBorder(null);
		
		//adding Borders such as South , North and Center to the layout
		add(south, BorderLayout.SOUTH);
		add(north, BorderLayout.NORTH);
		add(centre, BorderLayout.CENTER);

		previous_button.setBounds(30, 20, 30, 30);
		next_button.setBounds(30, 20, 30, 30);

		south.add(previous_button);
		south.add(play_button);
		south.add(next_button);
		south.setLayout(new GridLayout(1, 2));

		north.add(home_button);
		north.setLayout(new FlowLayout(2));
		centre.setLayout(new GridLayout(1, 0));

		play_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				centre.add(pic1);

			}
		});

		validate();
		repaint();
		setVisible(true);
	}

	public static void main(String[] args) {

		SlideShow ss = new SlideShow();
	}
}