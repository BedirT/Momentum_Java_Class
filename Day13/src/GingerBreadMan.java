import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GingerBreadMan {

	public static void main(String[] args) {

		JFrame j = new JFrame("Ginger Man");
		j.setSize(500, 400);
		j.setVisible(true);
		
		PanelGinger ginMan = new PanelGinger();
		j.add(ginMan);

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class PanelGinger extends JPanel {

	PanelGinger() {}

	public void paintComponent(Graphics g) {
		
		g.fillOval(100, 100, 50, 50);
		g.fillOval(100, 150, 50, 150);
		
		g.setColor(Color.gray);
		g.fillOval(121, 220, 10, 10);
		g.fillOval(121, 200, 10, 10);
		g.fillOval(121, 240, 10, 10);
		
		g.setColor(Color.BLACK);
		
		int[] leftArmX = {105, 104, 75, 80};
		int[] leftArmY = {180, 195, 175, 165};
		
		int[] rightArmX = {172, 171, 142, 147};
		int[] rightArmY = {175, 165, 180, 195};
		
		int[] rightLegX = {140, 130, 130, 140};
		int[] rightLegY = {280, 260, 350, 350};
		
		int[] leftLegX = {120, 110, 110, 120};
		int[] leftLegY = {290, 270, 350, 350};
		
		g.fillPolygon(leftArmX, leftArmY, 4);
		g.fillPolygon(rightArmX, rightArmY, 4);
		g.fillPolygon(rightLegX, rightLegY, 4);
		g.fillPolygon(leftLegX, leftLegY, 4);

	}

}
