import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class CMS extends JFrame {

	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();

	private JButton jb1 = new JButton();
	private JButton jb2 = new JButton();
	private JButton jb3 = new JButton();
	private JButton jb4 = new JButton();
	private JButton jb_save = new JButton();

	private JLabel resource_icon = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\cms_file.png")).getImage())
					.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));
	private JLabel timetable_icon = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\cms_book.png")).getImage())
					.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));
	private JLabel progress_icon = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\cms_progress.png")).getImage())
					.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));
	private JLabel notepad_icon = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\cms_notepad.png")).getImage())
					.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));
	private JLabel back_icon = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\cms_back_icon.png")).getImage())
					.getScaledInstance(90, 70, java.awt.Image.SCALE_SMOOTH)));
	private JLabel cms_icon = new JLabel(
			new ImageIcon(((new ImageIcon("C:\\Users\\Hp\\Desktop\\oop_project\\cmsbackground.png")).getImage())
					.getScaledInstance(900, 600, java.awt.Image.SCALE_SMOOTH)));

	// ___________________________________________
	//Days and their corresponding Data
	private String[] days = { "DAYS", "SUBJECTS", "TIME" };
	private String[][] data = { { "Monday", "OOP", "9:00-11:00" }, { "Tuesday", "Digital Logic Design", "11:00-12:00" },
			{ "Wednesday", "Calculus-II", "12:00-1:00" }, { "Thursday", "Pakistan Studies", "10:00-1:00" },
			{ "Friday", "Applied Physics ", "9:00-11:00" } };

	private JScrollPane pane;
	
	//Initiating JTable with Columns as in "days" and Rows as in "data"
	private JTable jt = new JTable(data, days);

	CMS() throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException,
			IllegalAccessException {
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("CMS");

		jp2.add(cms_icon);

		resource_icon.setText("RESOURCES");
		timetable_icon.setText("TIME TABLE");
		progress_icon.setText("PROGRESS");
		notepad_icon.setText("NOTEPAD");
		jb1.add(resource_icon);
		jb2.add(timetable_icon);
		jb3.add(progress_icon);
		jb4.add(notepad_icon);

		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);

		jb1.setBounds(20, 30, 30, 30);
		jb2.setBounds(20, 30, 30, 30);
		jb3.setBounds(20, 30, 30, 30);
		jb_save.setBounds(20, 30, 20, 30);

		jb_save.add(back_icon);
		jb_save.setBounds(5, 10, 5, 5);

		jb1.setBackground(new Color(80, 70, 150));
		jb2.setBackground(new Color(80, 70, 150));
		jb3.setBackground(new Color(80, 70, 150));
		jb4.setBackground(new Color(80, 70, 150));
		jb_save.setBackground(new Color(80, 70, 150));

		jp1.setPreferredSize(new Dimension(400, 200));
		jp3.setPreferredSize(new Dimension(0, 0));

		jp1.setLayout(new GridLayout(1, 4));
		jp1.setBackground(new Color(80, 70, 150));
		jp2.setBackground(Color.DARK_GRAY);
		jp3.setBackground(Color.lightGray);

		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.getViewport().add(jt);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setViewportBorder(new LineBorder(Color.RED));

		validate();
		pack();

		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb2) {
					cms_icon.setVisible(false);
					jb3.setVisible(false);
					jb1.setVisible(false);
					jb4.setVisible(false);
					jb2.setVisible(false);
					jt.setPreferredScrollableViewportSize(new Dimension(1500, 500));
					jt.setFillsViewportHeight(true);
					jt.setVisible(true);
					scrollPane.setVisible(true);
					jt.setAutoResizeMode(jt.AUTO_RESIZE_ALL_COLUMNS);
					jt.setIntercellSpacing(new Dimension());
					jt.setRowHeight(100);
					jp2.add(scrollPane);
					jp1.add(jb_save);
					jb_save.setVisible(true);

				}
			}
		});

		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GradesNew gn = new GradesNew();
				gn.main2();

			}
		});

		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb4) {
					editor todo = new editor();
					todo.setVisible(true);
					jb1.setVisible(false);
					jb2.setVisible(false);
					jb3.setVisible(false);
					jb4.setVisible(false);
					jp1.add(jb_save);
					jb_save.setVisible(true);
					todo.setDefaultCloseOperation(HIDE_ON_CLOSE);
					todo.setExtendedState(MAXIMIZED_BOTH);

				}
			}
		});

		jb_save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jb1.setVisible(true);
				jb2.setVisible(true);
				jb3.setVisible(true);
				jb4.setVisible(true);
				scrollPane.setVisible(false);
				cms_icon.setVisible(true);
				editor todo = new editor();
				todo.setVisible(false);
			}
		});

		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jb1) {
					ResourceEdited re = new ResourceEdited();
					re.main1();
					re.frame.setVisible(true);

				}

			}
		});

	}

	public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException,
			InstantiationException, IllegalAccessException {

		CMS work = new CMS();

	}
}