
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Board implements WindowListener {
	//Message that displays if you win
	public void win() {
		String message = "Congratulations !!!!! \n    \nYou win \n";

		JOptionPane pane = new JOptionPane(message);
		JDialog dialog = pane.createDialog(new JFrame(), "Dialogue");
		dialog.show();
	}
	//This displays whether it is draw or not
	public void draw() {
		String message = "Players the result is  !!!!! \n    \nSTALEMATE \n";

		JOptionPane pane = new JOptionPane(message);
		JDialog dialog = pane.createDialog(new JFrame(), "Dialogue");
		dialog.show();
	}

	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}

	public void windowOpened(WindowEvent we) {
	}

	public void windowClosed(WindowEvent we) {
	}

	public void windowActivated(WindowEvent we) {
	}

	public void windowDeactivated(WindowEvent we) {
	}

	public void windowIconified(WindowEvent we) {
	}

	public void windowDeiconified(WindowEvent we) {
	}
}