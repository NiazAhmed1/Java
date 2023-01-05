import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {

	private Container cont = getContentPane();
	private JPanel Jpanel1 = new JPanel();
	private JPanel Jpanel2 = new JPanel();
	private JLabel jl = new JLabel("USERNAME");
	private JLabel jl2 = new JLabel("PASSWORD");

	private JLabel login_icon = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\login.png")).getImage())
					.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));

	private JTextField jt = new JTextField();

	private JPasswordField jpf = new JPasswordField();
	private JButton LoginButton = new JButton("LOGIN");
	private JCheckBox show = new JCheckBox("SHOW PASSWORD");

	HomePage hp = new HomePage();

	Login() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException,
			IllegalAccessException {
		setSize(500, 500);
		setTitle("Login");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);

		Jpanel2.add(login_icon, BorderLayout.NORTH);

		cont.setLayout(null);

		jl.setBounds(50, 150, 100, 30);
		jl2.setBounds(50, 220, 150, 30);

		jt.setBounds(150, 150, 150, 30);
		jpf.setBounds(150, 220, 150, 30);
		show.setBounds(150, 250, 150, 30);
		LoginButton.setBounds(150, 300, 100, 30);

		getContentPane().add(Jpanel1);
		getContentPane().add(jl);
		getContentPane().add(jl2);
		getContentPane().add(jt);
		getContentPane().add(jpf);
		getContentPane().add(show);
		getContentPane().add(LoginButton);
		getContentPane().setPreferredSize(new Dimension(500, 300));
		getContentPane().setBackground(Color.WHITE);

		LoginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == LoginButton) {
					String UserName;
					String UserPassword;

					UserName = jt.getText();
					UserPassword = jpf.getText();

					if (UserName.equalsIgnoreCase("daniyal") && UserPassword.equalsIgnoreCase("password")) {

						JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL");

						hp.setVisible(true);
						hp.setExtendedState(MAXIMIZED_BOTH);
						setVisible(false);
					} else {
						JOptionPane.showMessageDialog(null, "INVALID USERNAME OR PASSWORD");
					}

				}

			}
		});
		show.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == show) {
					if (show.isSelected()) {
						jpf.setEchoChar((char) 0);
					} else
						jpf.setEchoChar('*');
				}

			}
		});

		add(cont);
		validate();
	}

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException{

        Login l = new Login();

    }

}
