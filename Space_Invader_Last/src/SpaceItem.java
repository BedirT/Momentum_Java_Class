import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpaceItem {

	private int x, y;    			// location of the item 
	private BufferedImage image;    // the image
	private boolean isVisible;      // whether the item is visible
	private int points;          	// how many points is this item worth

	SpaceItem() {
		initSpaceItem(0, 0, null, true, 0);
	}

	SpaceItem(int x0, int y0, BufferedImage i0, boolean a0, int p0) {
		initSpaceItem(x0, y0, i0, a0, p0);
	}

	public void initSpaceItem(int x0, int y0, BufferedImage i0, boolean v0, int p0) {
	  x=x0;
	  y=y0;
	  image=i0;
	  isVisible=v0;
	  points=p0;
	}

	public int getX() {
	  return x;
	}

	public int getY() {
	  return y;
	}

	public int getPoints() {
	  return points;
	}

	public boolean isVisible() {
	  return isVisible;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public void setVisible(boolean f) {
		isVisible = f;
	}

	public BufferedImage getImage() {
	  return image;
	}

	public void setX(int x0) {
	  x=x0;
	}

	public void setY(int y0) {
	  y=y0;
	}

	public void setPoints(int p0) {
	  points=p0;
	}

	public void die() {
	  isVisible=false;
	}

	// Draw the image at its actual dimension
	public void paint(Graphics g) {
		if(isVisible())
			g.drawImage(image, x, y, null);
	}
	
	// draw the image at the preferred dimension
	public void paint(Graphics g, int preferW, int preferH) {
		if(isVisible())
			g.drawImage(image, x, y, preferW, preferH, null);
	}
	
}
