import java.util.ArrayList;

public class Day15 {

	public static void main(String[] args) {
		// We will learn ArrayLists
		// Dynamic arrays...
		
		// Example 1
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Hello");
		arr.add("Houston");
		System.out.println( arr.get(0) );

		// Example 2
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(2015);
		arr2.add(11);
		System.out.println( arr2.get(1) );
		
//		Methods....
//		-----------
//		add(item) adds item to the end of the list
//		add(spot, item) adds item at spot -- shifts items toward the end
//		set(spot, item) change the value at spot to item
//		get(spot) returns the item at spot
//		size() returns the # of items in the list
//		remove(spot) removes the item at spot
//		remove(item) remove the item
//		clear() removes all items from the list
		
	}

}
