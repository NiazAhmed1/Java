import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class ResourceEdited extends ResourceAbstract {
	//This class conists of one Abstract Class "ResourceAbstract" and one child class "REditActionBUtton"
	
	public static void main1() {
		JPanel panel1 = new JPanel();
		addComponents(panel1);
		frame.add(panel1);

		// Settings
		frame.setSize(650, 350);
		frame.setDefaultCloseOperation(frame.HIDE_ON_CLOSE);
		frame.setVisible(true);

	}
	
}
