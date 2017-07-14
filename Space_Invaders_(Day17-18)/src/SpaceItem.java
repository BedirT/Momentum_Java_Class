import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpaceItem {
	private int x, y; // location of the SpaceItem
	private BufferedImage image; // the image of the SpaceItem
	private boolean isVisible; // whether the item is visible
	private int points; // how many points it is worth

	SpaceItem() {
		initSpaceItem(0, 0, null, true, 0);
	}

	SpaceItem(int x0, int y0, BufferedImage i0, boolean a0, int p0) {
		initSpaceItem(x0, y0, i0, a0, p0);
	}

	public void initSpaceItem(int x0, int y0, BufferedImage i0, boolean v0, int p0) {
		x = x0;
		y = y0;
		image = i0;
		isVisible = v0;
		points = p0;
	}

	// other accessor or modifier methods not shown

	public void die() {
		isVisible = false;
	}

	// display image with the actual dimension

	public void paint(Graphics g) {
		if (isVisible)
			g.drawImage(image, x, y, null);
	}

	// display image with preferred width and height

	public void paint(Graphics g, int prefWidth, int prefHeight) {
		if (isVisible)
			g.drawImage(image, x, y, prefWidth, prefHeight, null);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int i) {
		x = i;
	}

	public void setY(int i) {
		y = i;
	}
	
	public void setVisible(boolean ok){
		isVisible = ok;
	}

}