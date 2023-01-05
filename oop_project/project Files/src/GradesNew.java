
import java.awt.*;

import javax.swing.*;
import javax.swing.table.TableColumn;

public class GradesNew extends GradesAbstractClass {
	

	public static void main2()  {
		//Creating Frame
		JFrame frame = new JFrame("Grades");
		addTable(frame);

		// Settings
		frame.setSize(900, 175);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setVisible(true);
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);
	}

}
