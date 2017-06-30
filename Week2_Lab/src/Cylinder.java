
public class Cylinder {

	private int r, h; // r -> radius & h -> height

	public Cylinder() {
		r = 0;
		h = 0;
	}

	public Cylinder(int radius, int height) {
		r = radius;
		h = height;
	}

	public double computeLateralSurface() {
		return 2*Math.PI*r*h;
	}

	public double computeTotalSurface() {
		return Math.PI*r*r + computeLateralSurface();
	}

	public double computeVolume() {
		return Math.PI*r*r*h;
	}

}
