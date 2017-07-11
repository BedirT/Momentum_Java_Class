import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MovingCar extends JFrame {

	int WIDTH = 600, HEIGHT = 300;
	int ULx = 100, ULy = 100;
	int xSpeed = 6;
	int ySpeed = 0;
	int UPDATE_PERIOD = 50;

	public MovingCar() {

		CarPanel p = new CarPanel();
		add(p);
		setSize(WIDTH, HEIGHT);
		setTitle("Moving Car");
		setVisible(true);

		ActionListener updateTask = new ActionListener() {

			public void actionPerformed(ActionEvent evt) {

				updatePosition(); // update the upper‐left corner (x, y) position
				repaint(); // Refresh the JFrame, callback paintComponent()

			}

		};

		Timer t = new Timer(UPDATE_PERIOD, updateTask);
		t.start();

	}

	private class CarPanel extends JPanel {

		public void paintComponent(Graphics g) {

			setBackground(Color.WHITE);
			drawStaticCar(ULx, ULy, g);

		}

	}

	public void drawStaticCar(int x, int y, Graphics g) {

		g.fillRect(x, y, 70, 40);
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(x+5, y+25, 25, 25);
		g.fillOval(x+40, y+25, 25, 25);

	}

	public void updatePosition() {

		ULx += xSpeed;
		ULy += ySpeed;

		if (ULx > WIDTH) {
			ULx = 0;
		}

		if (ULy > HEIGHT) {
			ULy = 0;
		}

	}

}