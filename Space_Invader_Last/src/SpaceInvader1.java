
import java.awt.*;
import java.io.*;
import java.awt.image.*;

import javax.imageio.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class SpaceInvader1 extends JFrame {

	int MYWIDTH = 800;
	int MYHEIGHT = 520;

	SpaceInvader1() {
		
		
		GamePanel p = new GamePanel();
		add(p);
		
		p.setPreferredSize(new Dimension(MYWIDTH, MYHEIGHT));
		p.setFocusable(true);
		p.requestFocusInWindow();
		
		
		this.setBackground(Color.BLACK);
		setTitle("Space Invader I");
		setVisible(true);
		pack();
		setLocation(100, 100);
	}
	
	
	private class GamePanel extends JPanel {
	
		int nrows, ncols;

		SpaceItem[][] invaders;   // the invaders
		SpaceItem[] shields;	  // the shields
		SpaceItem tank;			  // the tank fighter

		int shieldImageWidth;     // preferred dimension of shield
		int shieldImageHeight;

		BufferedImage invaderImages[];
		BufferedImage shieldImage, tankImage;

		Font font;
				 
		GamePanel() {
			setup();
		}
		
		public void setup() {
			nrows = 5;
			ncols = 11;
			
			shieldImageWidth = 50;
			shieldImageHeight = 50;
			
			invaderImages = new BufferedImage[3];
			
			setUpFont();
			loadImages();
			setUpInvaders();
			setUpShields();
			setUpTank();
		}


		public void setUpFont() {
			font = new Font("Arial", Font.PLAIN, 32);
		}
	

		public void loadImages() {
			try {
				
				invaderImages[0] = ImageIO.read(ResourceLoader.load("invader1.bmp"));
				invaderImages[1] = ImageIO.read(ResourceLoader.load("invader2.bmp"));
				invaderImages[2] = ImageIO.read(ResourceLoader.load("invader3.bmp"));
				shieldImage = ImageIO.read(ResourceLoader.load("shield.bmp"));
				tankImage = ImageIO.read(ResourceLoader.load("tank.bmp"));
				
				
				invaderImages[0] = ImageIO.read(new File("images/invader1.bmp"));
				invaderImages[1] = ImageIO.read(new File("images/invader2.bmp"));
				invaderImages[2] = ImageIO.read(new File("images/invader3.bmp"));
				shieldImage = ImageIO.read(new File("image/shield.bmp"));
				tankImage = ImageIO.read(new File("images/tank.bmp"));
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	

		public void setUpInvaders() {
			invaders = new SpaceItem[nrows][ncols];

			for(int c=0; c<ncols; c++) {
				invaders[0][c] = new SpaceItem(120+c*50,  75, invaderImages[0], true, 25);
				invaders[1][c] = new SpaceItem(120+c*50, 125, invaderImages[1], true, 25);
				invaders[2][c] = new SpaceItem(120+c*50, 175, invaderImages[1], true, 25);
				invaders[3][c] = new SpaceItem(120+c*50, 225, invaderImages[2], true, 25);
				invaders[4][c] = new SpaceItem(120+c*50, 275, invaderImages[2], true, 25);
			}
		}


		public void setUpShields() {
			shields = new SpaceItem[4];
			
			for(int i=0; i<4; i++) {
				shields[i] = new SpaceItem(115+i*170, 400, shieldImage, true, 0);
			}
		}

		
		public void setUpTank() {
			tank = new SpaceItem(375, 480, tankImage, true, 0);
		}
		
		
		public void paintComponent(Graphics g) {
			drawTitle(g);
			drawInvaders(g);
			drawShields(g);
			drawTank(g);
		}
		
	
		public void drawTitle(Graphics g) {
			g.setFont(font);
			g.setColor(Color.RED);
			g.drawString("Space Invaders", 300, 40);
		}
	
	
		public void drawInvaders(Graphics g) {
			for (int row = 0; row < nrows; row++) {
				for (int col = 0; col < ncols; col++) {
					invaders[row][col].paint(g);
				}
			}
		}
	
	
		public void drawTank(Graphics g) {
			tank.paint(g);
		}
	
	
		public void drawShields(Graphics g) {
			for(int i=0; i<4; i++)
				shields[i].paint(g, shieldImageWidth, shieldImageHeight);
		}

	}
	
	
	public static void main(String[] args) {
		new SpaceInvader1();
	}
}


