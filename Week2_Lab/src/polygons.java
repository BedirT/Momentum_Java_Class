import java.util.InputMismatchException;
import java.util.Scanner;

public class polygons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pyramid pyro1 = new Pyramid(3, 4, 6);
		System.out.printf("%.2f\n", pyro1.computeTotalSurface());
		System.out.printf("%.2f\n", pyro1.computeVolume());

		Cylinder cyl = new Cylinder(3, 6);
		System.out.printf("%.2f\n", cyl.computeTotalSurface());
		System.out.printf("%.2f\n", cyl.computeVolume());

		Prism pr = new Prism(3, 4, 7);
		System.out.printf("%.2f\n", pr.computeTotalSurface());
		System.out.printf("%.2f\n", pr.computeVolume());
		
	}

}
