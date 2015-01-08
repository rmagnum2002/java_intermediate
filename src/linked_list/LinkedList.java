package linked_list;
import java.util.*;

public class LinkedList {

	public static void main(String[] args) {
		String[] things = {"apples", "noobs", "pwnage", "bacon", "goats"};
		List<String> list1 = new java.util.LinkedList<String>();
		
		for (String x : things) {
			list1.add(x);
		}
		
		String[] things2 = {"sausage", "bacon", "goats", "harry"};
		List<String> list2 = new java.util.LinkedList<String>();
		
		for (String y : things2) {
			list2.add(y);
		}
		
		list1.addAll(list2);
		list2 = null; //empty list2 just to free memory (not necessary);
		
		printMe(list1);
		removeStuff(list1, 2,5);
		printMe(list1);
		reverseMe(list1);
	}

	// reverseMe method
	private static void reverseMe(List<String> l1) {
		ListIterator<String> iterates = l1.listIterator(l1.size());
		// l1.size() returns number of elements in l1, 
		// so it's the number to start iterate with
		while (iterates.hasPrevious()) {
			System.out.printf("%s ", iterates.previous());
		}
	}

	// removeStuff method
	private static void removeStuff(List<String> l1, int from, int to) {
		l1.subList(from, to).clear();		
	}

	// printMe method
	private static void printMe(List<String> l1) {
		for (String b : l1) {
			System.out.printf("%s ", b);
		}
		System.out.println();
	}
	
	
}
