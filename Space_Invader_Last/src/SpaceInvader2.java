import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.awt.image.*;

import javax.imageio.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class SpaceInvader2 extends JFrame {

	int MYWIDTH = 800;
	int MYHEIGHT = 520;

	GamePanel p;
	
	SpaceInvader2() {
		
		p = new GamePanel();
		add(p);
		
		p.setPreferredSize(new Dimension(MYWIDTH, MYHEIGHT));
		p.setFocusable(true);
		p.requestFocusInWindow();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBackground(Color.BLACK);
		setTitle("Space Invader II");
		setVisible(true);
		pack();
		
		ActionListener updateTask = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p.moveInvaders();
				p.repaint();
			}
		};

		int updateTime = 50;   // how many milliseconds to update window
		Timer t = new Timer(updateTime, updateTask);
		t.start();
	}
	
	private class GamePanel extends JPanel {
	
		int nrows, ncols;

		SpaceItem[][] invaders;     // the invaders

		SpaceShield[] shields;		// the shields

		SpaceItem tank;				// the tank fighter

		int shieldImageWidth;       // preferred dimension of shield
		int shieldImageHeight;

		BufferedImage[] invaderImages;
		BufferedImage shieldImage, tankImage, explosionImage;

		Font font;

		int tankX, tankY;				  // info about the tank and tank bullet
		int tankBulletX, tankBulletY;
		int tankBulletSpeedX, tankBulletSpeedY;
		boolean tankFiring, tankMoving;

		
		int invaderSpeedX=2, invaderSpeedY=0;    // info about invader bullet

		int invaderBulletX, invaderBulletY;   
		int invaderBulletSpeedX, invaderBulletSpeedY;
		boolean isInvaderShooting;
		int invaderShootingInterval;       // how many milliseconds the invaders shoot

		int score, highestScore;
		boolean gameOver;
		
		int shieldLife;      // how many hits a shield can survive
		
		GamePanel() {
			setup();
			
			addKeyListener(new KeyListener() {
				@Override
				public void keyPressed(KeyEvent e) {
					processKeyPressed(e);
				}

				@Override
				public void keyReleased(KeyEvent arg0) { }

				@Override
				public void keyTyped(KeyEvent arg0) {	}
				
			});
		}
		
		public void setup() {
			
			setBackground(Color.BLACK);
			
			setupStartingValues();
			loadImages();
			setUpInvaders();
			setUpShields();
			setUpTank();
			setUpFont();

			// add all points from invaders to highestScore
			highestScore = 0;
			for(int i=0; i<nrows; i++) {
				for(int j=0; j<ncols; j++)
					highestScore += invaders[i][j].getPoints(); 
			}
		}

		
		// Set up the starting values of the parameters
		public void setupStartingValues() {
			nrows = 5;
			ncols = 11;
			
			invaderImages = new BufferedImage[3];

			shieldImageWidth = 50;
			shieldImageHeight = 50;

			tankX = 375;
			tankY = 480;

			tankBulletX = tankX;
			tankBulletY = -10;
	
			tankBulletSpeedX = 0;
			tankBulletSpeedY = -20;

			tankFiring = false;
			tankMoving = false;
	

			invaderSpeedX = 2;
			invaderSpeedY = 0;

			invaderBulletX = -1;   // these depend on which invader shoots
			invaderBulletY = -1;

			invaderBulletSpeedX = 0;
			invaderBulletSpeedY = 15; 

			invaderShootingInterval =  5;  // 5 milliseconds one invader shoots
			
			isInvaderShooting = false;
			
			score = 0;
			gameOver = false;
			
			shieldLife = 6;
		}

		
		public void loadImages() {
			try {
				invaderImages[0] = ImageIO.read(new File("images/invader1.bmp"));
				invaderImages[1] = ImageIO.read(new File("images/invader2.bmp"));
				invaderImages[2] = ImageIO.read(new File("images/invader3.bmp"));
				shieldImage = ImageIO.read(new File("images/shield.bmp"));
				tankImage = ImageIO.read(new File("images/tank.bmp"));
				explosionImage = ImageIO.read(new File("images/explosion.bmp"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public void setUpInvaders() {
			invaders = new SpaceItem[nrows][ncols];

			for(int c=0; c<ncols; c++) {
				invaders[0][c] = new SpaceItem(120+c*50,  75, invaderImages[0], true, 125);
				invaders[1][c] = new SpaceItem(120+c*50, 125, invaderImages[1], true, 100);
				invaders[2][c] = new SpaceItem(120+c*50, 175, invaderImages[1], true, 75);
				invaders[3][c] = new SpaceItem(120+c*50, 225, invaderImages[2], true, 50);
				invaders[4][c] = new SpaceItem(120+c*50, 275, invaderImages[2], true, 25);
			}
		}
		public void setUpShields() {
			shields = new SpaceShield[4];
			
			for(int i=0; i<4; i++) {
				shields[i] = new SpaceShield(115+i*170, 400, shieldImage, true, 0);
				shields[i].setLife(shieldLife);
			}
		}
		public void setUpTank() {
			tank = new SpaceItem(tankX, tankY, tankImage, true, 0);
		}		
		public void setUpFont() {
			font = new Font("Arial", Font.PLAIN, 32);
		}	
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);

			gameOver = checkForGameOver();
			if (gameOver) {
				g.setFont(font);
				
				if (score == highestScore) {
					g.setColor(Color.RED);
					g.drawString("You've conquered SpaceInvader!", 180, 150);
					g.drawString("Score: " + score, 180, 250);
					g.drawString("Press 'r' to replay the game.", 180, 350);
				}
				
				else {
					g.setColor(Color.WHITE);
					g.drawString("Score: " + score, 180, 250);
					g.drawString("Press 'r' to replay the game.", 180, 350);
				}    
				return;
			}
	  
			int shouldHeShoot = (int)( Math.random()*invaderShootingInterval) + 1;
			if( shouldHeShoot<3 && !isInvaderShooting) {
				oneInvaderShoots();
			}
	
			if(isInvaderShooting) {	drawInvaderBullet(g); }
			if(tankFiring) { drawTankBullet(g);	}
			if(tankMoving) { tankMoving = false; }


			drawLabels(g);
			drawInvaders(g);
			drawShields(g);
			drawTank(g);
		}
		public void drawLabels(Graphics g) {
			g.setColor(Color.RED);
			g.setFont(font);
			g.drawString("Space Invaders", 280, 40);
			
			g.setColor(Color.WHITE);
			g.setFont(new Font("Sans Serif", Font.PLAIN, 20));
			g.drawString("Score: " + score, 630, 40);
		}	
		public void drawInvaders(Graphics g) {
			SpaceItem enemy;

			for (int row = nrows - 1; row >= 0; row--) {
				for (int col = 0; col < ncols; col++) {
					enemy = invaders[row][col];
					if (checkForExplosion(enemy)) {
						explode(enemy, g);
					} else
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
		
		// update the positions of all invaders
		public void moveInvaders() {
			int currentSpeedY;
	
			if (checkEdges()) {
				invaderSpeedX = -invaderSpeedX;
				currentSpeedY = invaderSpeedY;
			} 
			else { currentSpeedY = 0; }
	
			for (int row = 0; row < nrows; row++) {
				for (int col = 0; col < ncols; col++) {
					invaders[row][col].setX( invaders[row][col].getX() + invaderSpeedX);
					invaders[row][col].setY( invaders[row][col].getY() + currentSpeedY);
				}
			}
		}
	
		// Checks whether the left-most and right-most invaders touch boundary
		public boolean checkEdges() {
			SpaceItem farLeft = invaders[0][0];
			SpaceItem farRight = invaders[0][ncols-1];
	
			if (farLeft.getX() <= 0)
				return true;
			else if (farRight.getX() >= MYWIDTH - 30)
				return true;
			else
				return false;
		}
	
		// Draw tank bullet if it is within window.
		public void drawTankBullet(Graphics g) {
			if (tankFiring) {
				g.setColor(Color.RED);
				g.fillOval(tankBulletX, tankBulletY, 10, 10);
				
				tankBulletX = tankBulletX + tankBulletSpeedX;
				tankBulletY = tankBulletY + tankBulletSpeedY;
	
				// if tankBullet goes out of window --> bullet dies
				if (tankBulletX < -10 || tankBulletX > MYWIDTH + 10 || tankBulletY < -10
						|| tankBulletY > MYHEIGHT + 10)
					tankFiring = false;
	
				// if tankBullet hits the shield --> bullet dies
				else {
					for (int i = 0; i < 4; i++) {
						if (shields[i].isVisible()
								&& tankBulletX >= shields[i].getX()
								&& tankBulletX <= shields[i].getX() + shieldImageWidth
								&& tankBulletY >= shields[i].getY()
								&& tankBulletY <= shields[i].getY() + shieldImageHeight) {
							tankBulletY = -10;
							tankFiring = false;
							break;
						}
					}
				}
			}
		}
	
		// Whether tank bullet hits invader
		public boolean checkForExplosion(SpaceItem enemy) {
			if (!enemy.isVisible())
				return false;
			
			int x0 = enemy.getX();
			int y0 = enemy.getY();
	
			int w = enemy.getImage().getWidth();
			int h = enemy.getImage().getHeight();
	
			if (tankBulletX >= x0 && tankBulletX <= x0 + w && tankBulletY >= y0
					&& tankBulletY <= y0 + h) {
				return true;			
			}
			return false;
		}
	
		// tank bullet hits invader; display explosion; set invader to die; increase score
		public void explode(SpaceItem enemy, Graphics g) {
			g.drawImage(explosionImage, enemy.getX(), enemy.getY(), null);
			enemy.die();
			score += enemy.getPoints();
		}
	
		// one invader will shoot
		public void oneInvaderShoots() {

				int col = (int) (Math.random() * ncols);
				for (int row = nrows - 1; row >= 0; row--) {
					SpaceItem enemy = invaders[row][col];
					if (enemy.isVisible()) {
						invaderBulletX = enemy.getX() + enemy.getImage().getWidth() / 2;
						invaderBulletY = enemy.getY() + enemy.getImage().getHeight();
						isInvaderShooting = true;
						return;
					}
				}
		}
	
		public void drawInvaderBullet(Graphics g) {
			if (isInvaderShooting) {
				g.setColor(Color.WHITE);
				g.fillOval(invaderBulletX, invaderBulletY, 10, 10);
				
				invaderBulletX = invaderBulletX + invaderBulletSpeedX;
				invaderBulletY = invaderBulletY + invaderBulletSpeedY;
	
				// if the invaderBullet is off the screen
				if (invaderBulletX < 0 || invaderBulletX > MYWIDTH + 10
						|| invaderBulletY < 0 || invaderBulletY > MYHEIGHT + 10)
					isInvaderShooting = false;
	
				// if invaderBullet hits the shield
				for (int i = 0; i < 4; i++) {
					if (shields[i].isVisible()
							&& invaderBulletX >= shields[i].getX()
							&& invaderBulletX <= shields[i].getX() + shieldImageWidth
							&& invaderBulletY >= shields[i].getY()
							&& invaderBulletY <= shields[i].getY() + shieldImageHeight) {
						invaderBulletY = -1;
						isInvaderShooting = false;
						shields[i].decreaseLife();
						break;
					}
				}
			}
		}
			
		// If all invaders are destroyed or the tank is destroyed, return true.
		public boolean checkForGameOver() {
			if (score == highestScore)
				return true;
	
			if (invaderBulletX >= tankX 
					&& invaderBulletX <= tankX + tankImage.getWidth()
					&& invaderBulletY >= tankY
					&& invaderBulletY <= tankY + tankImage.getHeight() )
				return true;

			for (int row = nrows-1; row >= 0; row--) {
				for (int col = 0; col < ncols; col++) {
					SpaceItem enemy = invaders[row][col];
					if (enemy.getY() >= shields[0].getY() - 24 && enemy.isVisible())
						return true;
				}
			}

			return false;
		}

		public void processKeyPressed(KeyEvent e) {

			char key = e.getKeyChar();

			if (gameOver) {  // if game is over, only accept 'r'
				if( key == 'r') {
					setupStartingValues();
					setup();
				}
			}
			
			else { // game is not over

				if (key == ' ') { // space key to fire
					// set the tank's bullet's x and y positions
					// Set tankFiring to true, so draw knows to draw the bullet.
	
					if (!tankFiring) {
						tankFiring = true;
						tankBulletX = tankX + tankImage.getWidth() / 2;
						tankBulletY = tankY;
					}
				}

				else if (key == 'q') {  // cheat key: destroy all invaders
					for(int i=0; i<nrows; i++) {
						for(int j=0; j<ncols; j++)
							invaders[i][j].die();
					}
					score = highestScore;
				}
			
				int kc = e.getKeyCode();
		
				if (kc == KeyEvent.VK_RIGHT && tankX < MYWIDTH - 50) {
					tankMoving = true;
					tankX = tankX + 20;
					tank.setX(tankX);
				}
		
				else if (kc == KeyEvent.VK_LEFT && tankX >= 20) {
					tankMoving = true;
					tankX = tankX - 20;
					tank.setX(tankX);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new SpaceInvader2();
	}
}
