
public class Prism {

	private int x, y, z;
	
	public Prism(){
		x = 0; 
		y = 0;
		z = 0;
	}
	
	public Prism(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double computeLateralSurface(){
		return x*y;
	}

	public double computeTotalSurface(){
		return x*y*2 + x*z*2 + y*z*2;
	}

	public double computeVolume(){
		return x*y*z;
	}
	
}
