package generic_return_types;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println(max(23, 42, 21));
		System.out.println(max("apples", "tots", "chicken"));
	}
	
	public static <T extends Comparable<T>> T max(T a, T b, T c){
		T m = a; // m stands for maximum
		
		if (b.compareTo(a) > 0) {
			m = b;
		}
		if (c.compareTo(m) > 0) {
			m = c;
		}
		return m;
	}

}
