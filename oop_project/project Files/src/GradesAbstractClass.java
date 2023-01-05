import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class GradesAbstractClass {
	private static JScrollPane sp;
	private static JTable jTable;

	static JFrame frame = new JFrame("Progress");

	protected static void addTable(JFrame frame) {
		String[][] data = { { "OOP", "10", "10", "9", "9", "9", "9", "14", "13", "49", "A" },
				{ "Calculus", "8", "8", "7", "6", "10", "10", "11", "11", "39", "B" },
				{ "Pak Studies", "8", "10", "9", "7", "6", "6", "10", "10", "29", "C" },
				{ "Eng Economics", "10", "8", "8", "8", "8", "8", "14", "14", "44", "A" },
				{ "Digital Logic Design", "9", "9", "10", "10", "10", "10", "15", "15", "43", "A" },
				{ "Applied Physics", "10", "10", "8", "8", "8", "9", "13", "13", "44", "A" }, };
		String[] s_names_columns = { "Subjects", "Q1", "Q2", "Q3", "A1", "A2", "A3", "OHT-1", "OHT-2", "ESE",
				"Grades" };
		//Initiating JTable
		jTable = new JTable(data, s_names_columns);
		jTable.setBounds(0, 50, 600, 300);
		
		//Adding ScrollPane
		sp = new JScrollPane(jTable);
		TableColumn column = null;
		for (int i = 0; i < s_names_columns.length; i++) {
			column = jTable.getColumnModel().getColumn(i);
			if (i == 0) {
				column.setPreferredWidth(100); // third column is bigger
			} else {
				column.setPreferredWidth(50);
			}
		}
		frame.add(sp);

	}

}
