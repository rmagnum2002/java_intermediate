package hashSet;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// set will not allow duplicates
		String[] things = {"apple", "bob", "ham", "bob", "bacon"};
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s", list);
		System.out.println();
		
		Set<String> set = new HashSet<String>(list);
		System.out.println(set);
	}

}
