
public class Pyramid {

	private double x, y, h;
	// D1 of the base, D2 of the base, Object height
	
	public Pyramid(){
		x = 0; 
		y = 0;
		h = 0;
	}
	
	public Pyramid(double x, double y, double h){
		this.x = x;
		this.y = y;
		this.h = h;
	}
	
	public double computeLateralSurface(char m){ 	// m -> the length of the side that we
													// want to compute surface
		if(m == 'x'){
			double curH = Math.sqrt(h*h-(y/2)*(y/2));
			return curH*x/2;
		}else{
			double curH = Math.sqrt(h*h-(x/2)*(x/2));
			return curH*y/2;
		}
	}

	public double computeTotalSurface(){
		return 2*computeLateralSurface('x') + 2*computeLateralSurface('y') + x*y;
	}

	public double computeVolume(){
		return x*y*h/3;
	}
	
}
