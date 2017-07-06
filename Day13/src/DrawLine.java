import java.awt.*;

import javax.swing.*;

public class DrawLine {

	public static void main(String[] args) {

		JFrame f = new JFrame("Draw Line");
		f.setSize(400, 300);
		PanelLine p = new PanelLine();
		f.add(p);
		f.setVisible(true);

	}

}

class PanelLine extends JPanel {

	PanelLine() {}

	public void paintComponent(Graphics g) {

		g.drawString("A", 38, 55);
		g.drawString("B", 355, 55);
		g.drawString("C", 174, 164);
		g.drawLine(50, 50, 350, 50);
		g.drawLine(50, 50, 175, 150);
		g.drawLine(350, 50, 175, 150);

	}

}