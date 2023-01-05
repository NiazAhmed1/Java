import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class GameApplet extends Applet implements MouseListener, ActionListener, WindowListener {
	JFrame f;
	private int flag = 2;
	private int n;
	private int m;
	private int i = 0;
	private static int bug = 0;
	private char[] ch = new char[9];
	private JButton first;
	private JButton second;
	private String s1 = "";

	GameApplet() {
		this.f = new JFrame("Tic Tac Toe");
		this.first = new JButton("CLEAR");
		this.second = new JButton("EXIT");
		this.f.add(this.first);
		this.f.add(this.second);
		this.f.addWindowListener(this);
		this.f.getContentPane().setBackground(Color.BLUE);
		this.f.setLayout(null);
		this.f.setVisible(true);
		this.f.setSize(800, 600);
		this.first.setBounds(650, 50, 90, 60);
		this.second.setBounds(650, 250, 90, 60);

		this.f.addMouseListener(this);
		for (this.i = 0; this.i < 9; this.i += 1)
			this.ch[this.i] = 'B';
		this.first.addActionListener(this);
		this.second.addActionListener(this);

		Graphics g = this.f.getGraphics();
		g.drawLine(200, 0, 200, 600);
		g.drawLine(400, 0, 400, 600);
		g.drawLine(0, 200, 600, 200);
		g.drawLine(0, 400, 600, 400);
		g.drawLine(600, 0, 600, 600);
	}

	private void keyPressed(KeyEvent k) {
		System.out.print("");
	}

	private void keyTyped(KeyEvent k) {
		this.s1 += k.getKeyChar();
	}

	private void keyReleased(KeyEvent k) {
		System.out.print("");
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == this.first) {
			this.f.setVisible(false);
			bug = 0;
			new GameApplet();
		}
		if (ae.getSource() == this.second) {

			System.exit(0);
		}
	}

	public void windowClosing(WindowEvent de) {
		System.exit(0);
	}

	public void windowOpened(WindowEvent de) {
	}

	public void windowClosed(WindowEvent de) {
	}

	public void windowActivated(WindowEvent de) {
	}

	public void windowDeactivated(WindowEvent de) {
	}

	public void windowIconified(WindowEvent de) {
	}

	public void windowDeiconified(WindowEvent de) {
	}

	public void mouseClicked(MouseEvent e) {
		Graphics2D g2;
		Graphics g = this.f.getGraphics();
		g.drawLine(200, 0, 200, 600);
		g.drawLine(400, 0, 400, 600);
		g.drawLine(0, 200, 600, 200);
		g.drawLine(0, 400, 600, 400);
		g.drawLine(600, 0, 600, 600);
		this.flag -= 1;
		int x = e.getX();
		int y = e.getY();
		if (this.flag == 1) {
			if ((x < 200) && (y < 200)) {
				this.m = 0;
				this.n = 0;
				this.ch[0] = 'R';
			}
			if ((x > 200) && (x < 400) && (y < 200)) {
				this.m = 200;
				this.n = 0;
				this.ch[1] = 'R';
			}
			if ((x > 400) && (x < 600) && (y < 200)) {
				this.m = 400;
				this.n = 0;
				this.ch[2] = 'R';
			}
			if ((x < 200) && (y > 200) && (y < 400)) {
				this.m = 0;
				this.n = 200;
				this.ch[3] = 'R';
			}
			if ((x > 200) && (x < 400) && (y > 200) && (y < 400)) {
				this.m = 200;
				this.n = 200;
				this.ch[4] = 'R';
			}
			if ((x > 400) && (x < 600) && (y > 200) && (y < 400)) {
				this.m = 400;
				this.n = 200;
				this.ch[5] = 'R';
			}
			if ((x < 200) && (y > 400) && (y < 600)) {
				this.m = 0;
				this.n = 400;
				this.ch[6] = 'R';
			}
			if ((x > 200) && (x < 400) && (y > 400) && (y < 600)) {
				this.m = 200;
				this.n = 400;
				this.ch[7] = 'R';
			}
			if ((x > 400) && (x < 600) && (y > 400) && (y < 600)) {
				this.m = 400;
				this.n = 400;
				this.ch[8] = 'R';
			}
			g.setColor(new Color(77, 176, 230));
			g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10.0F));
			g.drawOval(this.m + 10, this.n + 10, 159, 159);
		}

		if (this.flag == 0) {
			if ((x < 200) && (y < 200)) {
				this.m = 0;
				this.n = 20;
				this.ch[0] = 'P';
			}
			if ((x > 200) && (x < 400) && (y < 200)) {
				this.m = 200;
				this.n = 20;
				this.ch[1] = 'P';
			}
			if ((x > 400) && (x < 600) && (y < 200)) {
				this.m = 400;
				this.n = 20;
				this.ch[2] = 'P';
			}
			if ((x < 200) && (y > 200) && (y < 400)) {
				this.m = 0;
				this.n = 200;
				this.ch[3] = 'P';
			}
			if ((x > 200) && (x < 400) && (y > 200) && (y < 400)) {
				this.m = 200;
				this.n = 200;
				this.ch[4] = 'P';
			}
			if ((x > 400) && (x < 600) && (y > 200) && (y < 400)) {
				this.m = 400;
				this.n = 200;
				this.ch[5] = 'P';
			}
			if ((x < 200) && (y > 400) && (y < 600)) {
				this.m = 0;
				this.n = 400;
				this.ch[6] = 'P';
			}
			if ((x > 200) && (x < 400) && (y > 400) && (y < 600)) {
				this.m = 200;
				this.n = 400;
				this.ch[7] = 'P';
			}
			if ((x > 400) && (x < 600) && (y > 400) && (y < 600)) {
				this.m = 400;
				this.n = 400;
				this.ch[8] = 'P';
			}
			g2 = (Graphics2D) g;
			g2.setStroke(new BasicStroke(10.0F));
			g.setColor(new Color(77, 176, 230));
			g.drawLine(this.m + 10, this.n + 13, this.m + 169, this.n + 164);
			g.drawLine(this.m + 169, this.n + 10, this.m + 10, this.n + 169);
			this.flag += 2;
		}

		for (this.i = 0; this.i < 3; this.i += 1) {
			if ((this.ch[this.i] != 'B') && (this.ch[(this.i + 3)] == this.ch[this.i])
					&& (this.ch[(this.i + 6)] == this.ch[this.i])) {
				new Board().win();
				bug = 1;
			}
		}

		for (this.i = 0; this.i < 7; this.i += 1) {
			if (this.ch[this.i] != 'B') {
				if ((this.ch[this.i] == this.ch[(this.i + 1)]) && (this.ch[this.i] == this.ch[(this.i + 2)])) {
					new Board().win();
					bug = 1;
				}
				this.i += 2;
			} else {
				this.i += 2;
			}
		}
		if ((this.ch[4] != 'B') && ((((this.ch[0] == this.ch[4]) && (this.ch[4] == this.ch[8]))
				|| ((this.ch[2] == this.ch[4]) && (this.ch[4] == this.ch[6]))))) {
			new Board().win();
			bug = 1;
		}

		for (this.i = 0; (this.i < 9) && (this.ch[this.i] != 'B'); this.i += 1) {
			if (this.i == 8) {
				if (bug == 0)
					new Board().draw();
				bug = 0;
			}
		}
	}

	public void mouseReleased(MouseEvent e) {
		System.out.print("");
	}

	public void mouseEntered(MouseEvent e) {
		System.out.print("");
	}

	public void mouseExited(MouseEvent e) {
		System.out.print("");
	}

	public void mousePressed(MouseEvent e) {
		System.out.print("");
	}

	public static void main(String[] args) {
		new GameApplet();
	}
}
