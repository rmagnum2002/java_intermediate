package convert_lists_to_arrays;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String[] stuff = {"babies", "watermelon", "melons", "fudge"};
		
		//convert array to list to apply list methods on it
		LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
		
		thelist.add("pumpkin");
		thelist.addFirst("firstThing");
		
		System.out.println(thelist);
		
		//convert back to array
		stuff = thelist.toArray(new String[thelist.size()]);
		for (String x : stuff) {
			System.out.printf("%s ", x);
		}
	}

}
