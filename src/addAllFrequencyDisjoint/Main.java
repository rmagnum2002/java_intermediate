package addAllFrequencyDisjoint;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// convert stuff array to a list
		String[] stuff = {"apples", "beef", "corn", "ham"};
		List<String> list1 = Arrays.asList(stuff);
		
		// create second list and add some elements to it
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("youtube");
		list2.add("google");
		list2.add("digg");
		
		// printout second list
		for (String s : list2) {
			System.out.printf("%s ", s);
		}
		
		// add eleents from list 1 to list 2
		Collections.addAll(list2, stuff);
		System.out.println();
		for (String s : list2) {
			System.out.printf("%s ", s);
		}
		System.out.println();
	
		// frequency - checks one list against a term, 
		// outputs how any times it appears in the list
		System.out.println(Collections.frequency(list2, "digg"));
		
		// disjoint - Returns true if the two specified collections 
		// have no elements in common.
		System.out.println(Collections.disjoint(list1, list2));
	}
}
