import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SpaceInvader extends JFrame {

	public final int MYWIDTH = 800;
	public final int MYHEIGHT = 520;
	

	SpaceInvader() {

		GamePanel p = new GamePanel();
		add(p);
		p.setPreferredSize(new Dimension(MYWIDTH, MYHEIGHT));
		p.setFocusable(true);
		p.requestFocusInWindow();
		setBackground(Color.black);
		setTitle("Space Invader");
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener updateTask = new ActionListener() {

			public void actionPerformed(ActionEvent evt) {

				p.moveInvaders(); // update the upper‐left corner (x, y) position
				p.repaint(); // Refresh the JFrame, callback paintComponent()

			}

		};

		int UPDATE_PERIOD = 50; // milliseconds
		Timer t = new Timer(UPDATE_PERIOD, updateTask);
		t.start();

	}

	private class GamePanel extends JPanel {

		int nrows, ncols;
		SpaceItem[][] invaders; // the invaders
		SpaceItem[] shields; // the shields
		SpaceItem tank; // the tank fighter
		int shieldImageWidth; // preferred dimension of the shield
		int shieldImageHeight;
		BufferedImage[] invaderImages;
		BufferedImage shieldImage, tankImage, explosionImage;
		Font font;
		
		int tankX, tankY;
		int tankBulletX, tankBulletY;
		int tankBulletSpeedX, tankBulletSpeedY;
		boolean tankFiring, tankMoving;
		
		int invaderSpeedX = 3, invaderSpeedY = 4;
		int invaderBulletX, invaderBulletY;

		GamePanel() {
			setup();
			
			addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					processKeyPressed(e);
				}
			});
		}

		public void setup() {

			nrows = 5;
			ncols = 11;
			shieldImageWidth = 50;
			shieldImageHeight = 50;
			invaderImages = new BufferedImage[3];
			setupFont();
			loadImages();
			setupInvaders();
			setupShields();
			setupTank();

		}
		public void setupFont() {
			font = new Font("Arial", Font.PLAIN, 32);
		}
		public void loadImages() {
			
			try {
				invaderImages[0] = ImageIO.read(new File("./images/invader1.bmp"));
//				Image toolkitImage = invaderImages[0].getScaledInstance(100, 100, 
//					      Image.SCALE_SMOOTH);
//				int width = toolkitImage.getWidth(null);
//				int height = toolkitImage.getHeight(null);
//				
//				BufferedImage newImage = new BufferedImage(width, height, 
//					      BufferedImage.TYPE_INT_ARGB);
//				Graphics g = newImage.getGraphics();
//				g.drawImage(toolkitImage, 0, 0, null);
//				g.dispose();
//				
//				invaderImages[0] = newImage;
				invaderImages[1] = ImageIO.read(new File("./images/invader2.bmp"));
				invaderImages[2] = ImageIO.read(new File("./images/invader3.bmp"));
				shieldImage = ImageIO.read(new File("./images/shield.bmp"));
				tankImage = ImageIO.read(new File("./images/tank.bmp"));
				explosionImage = ImageIO.read(new File("./images/explosion.bmp"));
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		public void setupInvaders() {

			invaders = new SpaceItem[nrows][ncols];
			
			for(int j = 0; j < ncols; j++){
				invaders[0][j] = new SpaceItem(50+60*j, 100, invaderImages[0], true, 100);
				invaders[1][j] = new SpaceItem(50+60*j, 150, invaderImages[1], true, 100);
				invaders[2][j] = new SpaceItem(50+60*j, 200, invaderImages[2], true, 100);
				invaders[3][j] = new SpaceItem(50+60*j, 250, invaderImages[1], true, 100);
				invaders[4][j] = new SpaceItem(50+60*j, 300, invaderImages[0], true, 100);
			}
			
		}
		public void setupShields() {

			shields = new SpaceShield[4];
			
			for(int i = 0; i < 4; i++){
				shields[i] = new SpaceShield(100+150*i, 370, shieldImage, true, 0);
			}

		}
		public void setupTank() {

			tank = new SpaceItem(300, 450, tankImage, true, 100);

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
			for(int i = 0; i < 5; i++){
				for(int j = 0; j < ncols; j++){
					invaders[i][j].paint(g);
				}
			}
		}
		public void drawShields(Graphics g) {
			
			for(int i = 0; i < 4; i++){
				shields[i].paint(g, shieldImageWidth, shieldImageHeight);
			}
			
		}
		public void drawTank(Graphics g) {
			tank.paint(g);
		}
		public void moveInvaders(){
			int currentSpeedY;
			
			if(checkEdges()){
				invaderSpeedX = -invaderSpeedX;
				currentSpeedY = invaderSpeedY;
			}
			else{
				currentSpeedY = 0;
			}
			
			for(int i = 0; i < nrows; i++){
				for(int j = 0; j < ncols; j++){
					invaders[i][j].setX(invaders[i][j].getX() + invaderSpeedX);
					invaders[i][j].setY(invaders[i][j].getY() + currentSpeedY);
				}
			}
		}
		public boolean checkEdges(){
			SpaceItem farLeft = invaders[0][0];
			SpaceItem farRight = invaders[0][ncols-1];
			
			if(farLeft.getX() <= 0)
				return true;
			else if(farRight.getX() >= MYWIDTH - 30)
				return true;
			else
				return false;
		}
		public void processKeyPressed(KeyEvent e){
			
			int kc = e.getKeyCode();
			
			if(kc == KeyEvent.VK_RIGHT && tankX < MYWIDTH - 50){
				tankMoving = true;
				tankX = tankX + 20;
				tank.setX(tankX);
			}

			else if(kc == KeyEvent.VK_LEFT && tankX >= 20){
				tankMoving = true;
				tankX = tankX - 20;
				tank.setX(tankX);
			}
			
		}
	}
	
	public static void main(String[] args) {

		new SpaceInvader();

	}

	

}