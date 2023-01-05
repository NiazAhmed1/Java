import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class ResourceAbstract {
	protected static JButton buttons[];
	private static String names[] = { "OOP", "Calculus", "Pak Studies", "Eng Economics", "Digital Logic Design",
			"Applied Physics" };

	static JFrame frame = new JFrame("Resources");

	protected static void addComponents(JPanel panel1) {
		
		//Creating Buttons
		buttons = new JButton[names.length];
		panel1.setLayout(null);
		int count = 135;
		//Adding required data such as buttons
		for (int i = 0; i < names.length; i++) {
			if (i >= 0 && i <= 1) {
				buttons[i] = new JButton(names[i]);
				buttons[i].setBounds(count, 50, 160, 50);
				count += 200;
				panel1.add(buttons[i]);
			} else if (i >= 2 && i <= 3) {
				if (i == 2)
					count -= 400;
				buttons[i] = new JButton(names[i]);
				buttons[i].setBounds(count, 120, 160, 50);
				count += 200;
				panel1.add(buttons[i]);
			} else if (i >= 4 && i <= 5) {
				if (i == 4)
					count -= 400;
				buttons[i] = new JButton(names[i]);
				buttons[i].setBounds(count, 190, 160, 50);
				count += 200;
				panel1.add(buttons[i]);
			}
			buttons[i].addActionListener(new REditActionButton());
		}

	}

}
