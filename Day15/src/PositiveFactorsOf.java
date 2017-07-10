import java.util.ArrayList;

public class PositiveFactorsOf {

	int num; // the number to be examined

	ArrayList<Integer> factors; // to record all positive factors of num

	PositiveFactorsOf(int a) { // constructor

		num = a;
		factors = new ArrayList<Integer>();
		generateAllFactors();

	}

	public void generateAllFactors() { // update ArrayList factors

		factors.clear();
		for(int i = 1; i <= num; i++)
			if(num % i == 0)
				factors.add(i);

	}

	public String toString() { // display all positive factors

		if(factors.size() == 0) return "Empty...";
		String s = "" + factors.get(0);
		for(int i = 1; i < factors.size(); i++){
			s += ", " + factors.get(i);
		}
		return s;

	}

	public void multiply(int m) { // multiply num by m and update factors

		num *= m;
		generateAllFactors();

	}

}