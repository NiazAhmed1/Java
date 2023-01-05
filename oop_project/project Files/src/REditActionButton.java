import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class REditActionButton extends ResourceEdited implements ActionListener{
	//This is used to add actions whenever each button is pressed
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttons[0]) {
				try {
					Desktop.getDesktop().browse(
							new URL("https://drive.google.com/drive/folders/1uA-YmL1VfX-yRyjcT5m8Lm5i6SI7h5Rv").toURI());
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			} else if (e.getSource() == buttons[1]) {
				try {
					Desktop.getDesktop().browse(
							new URL("https://drive.google.com/drive/folders/1AIawKhm_NYp_wiNDwXDHMawDZI0p4A1c").toURI());
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (e.getSource() == buttons[2]) {
				try {
					Desktop.getDesktop().browse(
							new URL("https://drive.google.com/drive/folders/1lL_kXliGcBJFUgz2JYewethqhSX8kXn2").toURI());
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (e.getSource() == buttons[3]) {
				try {
					Desktop.getDesktop().browse(
							new URL("https://drive.google.com/drive/folders/1fxk5o_9a1Ew2u8J_ce9T6ubGOcOgJKmA").toURI());
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (e.getSource() == buttons[4]) {
				try {
					Desktop.getDesktop().browse(
							new URL("https://drive.google.com/drive/folders/1J5FB9ryFcbc3BQojVUdGNFYosS3FvtVB").toURI());
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (e.getSource() == buttons[5]) {
				try {
					Desktop.getDesktop().browse(
							new URL("https://drive.google.com/drive/folders/1IbbeP6qONsO1TAr-Z8L1HnArKQBmgpFy").toURI());
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}

}
