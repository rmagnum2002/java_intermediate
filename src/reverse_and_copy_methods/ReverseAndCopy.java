package reverse_and_copy_methods;
import java.util.*;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class ReverseAndCopy {

	public static void main(String[] args) {
		// create an array and covert to list
		Character[] ray = {'p', 'w', 'n'};
		List<Character> l = Arrays.asList(ray);
		System.out.println("List is: ");
		output(l);
		
		// reverse and printout the list
		Collections.reverse(l);
		System.out.println("After reverse: ");
		output(l);
		
		// create a new array and a new list
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		
		// copy content of l into listCopy
		Collections.copy(listCopy, l);
		System.out.println("Copy of list:");
		output(listCopy);
		
		// fill collection with crap :)
		Collections.fill(l, 'X');
		System.out.println("After fill in the list: ");
		output(l);
	}

	private static void output(List<Character> list) {
		for (Character c : list) {
			System.out.printf("%s ", c);
		}
		System.out.println();
	}
}
