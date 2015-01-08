package collections_introduction;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		String[] things = {"eggs", "lasers", "hats", "pie"};
		List<String> list1 = new ArrayList<String>();
		// add array items to list
		for (String x : things) {
			list1.add(x);
		}		
	
		String[] morethings = {"lasers", "hats"};
		List<String> list2 = new ArrayList<String>();
		// add array items to list
		for (String y : morethings) {
			list2.add(y);
		}		

		for (int i = 0; i < list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}
		for (int i = 0; i < list2.size(); i++) {
			System.out.printf("%s ", list2.get(i));
		}
		
		// remove common elements from list 1 and 2
		editlist(list1, list2);
		System.out.println();
	

		for (int i = 0; i < list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}	
	}

	private static void editlist(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		while (it.hasNext()) {
			if (l2.contains(it.next())) {
				it.remove();
			}			
		}
	}

}
