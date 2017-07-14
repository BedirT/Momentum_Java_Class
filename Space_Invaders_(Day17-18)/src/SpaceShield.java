import java.awt.image.BufferedImage;

public class SpaceShield extends SpaceItem { // inheritance!

	private int life; // how many hits the shield can sustain
	
	public SpaceShield() {
		super();
		life = 3;
	}
	
	SpaceShield(int x0, int y0, BufferedImage i0, boolean a0, int p0) {
		initSpaceItem(x0, y0, i0, a0, p0);
		life = 10;
	}

	public void setLife(int x){
		life = x;
	}
	
	public int getLife(){
		return life;
	}
	
	public boolean isVisible(){
		return life>0;
	}
	
	public void decreaseLife(){
		life--;
//		if(life <= 0)
//			setVisible(false);
	}
	
}