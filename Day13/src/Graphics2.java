import java.awt.*;
import javax.swing.*;

public class Graphics2 {

	public static void main(String[] args) {

		JFrame f = new JFrame("Graphics 2");
		f.setSize(400, 300);
		Panel2 p = new Panel2();
		f.add(p);
		f.setVisible(true);

	}

}

class Panel2 extends JPanel {

	Panel2() {}

	public void paintComponent(Graphics g) {

		g.setFont(new Font("San Serif", Font.BOLD, 16));
		g.drawString("Hello World!", 50, 50);
		
	}
	
}