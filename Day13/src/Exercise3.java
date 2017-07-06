import java.awt.*;
import javax.swing.*;

public class Exercise3 {

	public static void main(String[] args) {

		JFrame f = new JFrame("Graphics 2");
		f.setSize(400, 300);
		
		Panel3 p = new Panel3();
		f.add(p);
		
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Panel3 extends JPanel {

	Panel3() {}

	public void paintComponent(Graphics g) {

		g.setFont(new Font("San Serif", Font.BOLD, 16));
		
		String[] s = {"++++++++++++++++++", "++++++++++++++++++", "\\\\\\                                    ///", 
				"\\\\\\                                    ///", "\\\\\\       Hello World          ///", 
				"\\\\\\                                    ///", "\\\\\\                                    ///",
				"++++++++++++++++++", "++++++++++++++++++"};
		int n = s.length;
		
		for(int i = 0; i < n; i++){
			g.drawString(s[i], 50, 50+i*20);
		}
	}
	
}