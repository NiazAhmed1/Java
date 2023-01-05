import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Project extends JFrame {
	private JLabel pic;
	private Timer tm;
	private int x = 0;
	// Images Path In Array
	String[] list = { "C:\\Users\\Hp\\Desktop\\oop_project\\dpic.jpg", // 0
			"C:\\Users\\Hp\\Desktop\\oop_project\\npic.jpg", // 1
			"C:\\Users\\Hp\\Desktop\\oop_project\\apic.jpg", // 2
			"C:\\Users\\Hp\\Desktop\\oop_project\\dpic.jpg", // 3
			"C:\\Users\\Hp\\Desktop\\oop_project\\npic.jpg", // 4
			"C:\\Users\\Hp\\Desktop\\oop_project\\apic.jpg", // 5
			"C:/Users/samsng/Desktop/jv7.jpg"// 6
	};

	Project() {

		super("Gallery");
		pic = new JLabel();
		pic.setBounds(350, 50, 900, 690);

		// Call The Function SetImageSize
		SetImageSize(4);
		// set a timer
		tm = new Timer(900, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SetImageSize(x);
				x += 1;
				if (x >= list.length)
					x = 0;
			}
		});
		add(pic);
		tm.start();
		setLayout(null);
		setSize(800, 400);
		getContentPane().setBackground(new Color(10, 20, 25));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// create a function to resize the image
	private void SetImageSize(int i) {
		ImageIcon icon = new ImageIcon(list[i]);
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		pic.setIcon(newImc);
	}

	public static void main(String[] args) {

		Project p = new Project();
	}
}