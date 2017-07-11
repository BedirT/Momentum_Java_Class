import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanelGinger extends JFrame {

	int WIDTH = 500, HEIGHT = 400;
	int ULxLeft = 75, ULyLeft = 175;
	int ULxRight = 172, ULyRight = 175;
	int xSpeed = 0;
	int ySpeed = 6;
	int UPDATE_PERIOD = 50;

	public PanelGinger() {

		HandMoves p = new HandMoves();
		add(p);
		setSize(WIDTH, HEIGHT);
		setTitle("Ginger Man");
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

	private class HandMoves extends JPanel {

		public void paintComponent(Graphics g) {

			setBackground(Color.WHITE);
			drawGinger(ULxLeft, ULyLeft, ULxRight, ULyRight, g);

		}

	}

	public void drawGinger(int xl, int yl, int xr, int yr, Graphics g){

		g.fillOval(100, 100, 50, 50);
		g.fillOval(100, 150, 50, 150);
		
		g.setColor(Color.gray);
		g.fillOval(121, 220, 10, 10);
		g.fillOval(121, 200, 10, 10);
		g.fillOval(121, 240, 10, 10);
		
		g.setColor(Color.BLACK);
		int[] leftArmX = {105, 104, xl, xl+5};
		int[] leftArmY = {180, 195, yl, yl-10};
		
//		int[] leftArmX = {xl, 104, 75, 80};
//		int[] leftArmY = {yl, 195, 175, 165};
		
		int[] rightArmX = {xr, xr-1, 142, 147};
		int[] rightArmY = {yr, yr-10, 180, 195};
		
//		int[] rightArmX = {172, 171, 142, 147};
//		int[] rightArmY = {175, 165, 180, 195};
		
		int[] rightLegX = {140, 130, 130, 140};
		int[] rightLegY = {280, 260, 350, 350};
		
		int[] leftLegX = {120, 110, 110, 120};
		int[] leftLegY = {290, 270, 350, 350};
		
		g.fillPolygon(leftArmX, leftArmY, 4);
		g.fillPolygon(rightArmX, rightArmY, 4);
		g.fillPolygon(rightLegX, rightLegY, 4);
		g.fillPolygon(leftLegX, leftLegY, 4);

	}

	public void updatePosition() {

		ULxLeft += xSpeed;
		ULyLeft += ySpeed;

		ULxRight += xSpeed;
		ULyRight += ySpeed;
		
		if(ULyRight > 195){
			ySpeed *= -1;
		}
		else if(ULyRight < 155){
			ySpeed *= -1;
		}
		
	}

}