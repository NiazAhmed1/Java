import java.awt.*;
import javax.swing.*;

public class MenuList extends JFrame {

	MenuList() {

		setComponent();
		setSize(1000, 350);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setComponent();

	}

	public void setComponent() {
		//Items for Rows, that includes on which day which food is to be eaten
		String data[][] = { { "Monday", "Omelette,Paratha,Tea", "Seasonal  Vegetable", "Chicken karahi" },
				{ "Tuesday", "Half-Fry Omelette,paratha,Tea", "Daal Mash", "Chicken Manchurian Rice" },
				{ "Wednesday", "Chola, Paratha, Tea", "Patato Qeema ", "Patato and Egg" },
				{ "Thusday", " paratha , Tea ", "Chicken Biryani ", "Brown Beans" },
				{ "Friday", "Patato Bhujia,Paratha,Tea", " Chicken Haleem", "White Rice and daal" },
				{ "Sturday", "Paratha, Chola, Tea", "Allu Plaou", "Patato and Beef" },
				{ "Sunday", "Patato_Paratha, Tea", "CauliFlower ", "Palak" } };
		//Items for Columns
		String column[] = { "DAYS", "Break_Fast", "LUNCH", "DINNER" };
		
		//Intiiating JTable
		JTable jt = new JTable(data, column);
		
		//Adding ScrollPane
		JScrollPane sp = new JScrollPane(jt);
		add(sp);

		jt.setRowHeight(40);

	}

	public static void main(String[] arg) {

		MenuList mu = new MenuList();

	}

}
