import java.awt.image.BufferedImage;

public class SpaceShield extends SpaceItem {

	private int life;   // how many hits the shield can survive
	
	SpaceShield() {
		super();
		life = 3;
	}
	
	SpaceShield(int x0, int y0, BufferedImage i0, boolean a0, int p0) {
		initSpaceItem(x0, y0, i0, a0, p0);
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	public boolean isVisible() {
		return (life>0);
	}
	
	public void decreaseLife() {
		life--;
		if (life<=0)
			setVisible(false);
	}
}
