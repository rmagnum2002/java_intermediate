package generic_methods;

public class GenericMethods {

	public static void main(String[] args) {
		
		Integer[] iray = {1,2,3,4};
		Character[] cray = {'b', 'u', 'c', 'y'};
		
		printMe(iray);
		printMe(cray);
	}

//	private static void printMe(Integer[] i) {
//		for (Integer x : i) {
//			System.out.printf("%s", x);
//		}		
//		System.out.println();
//	}
//
//	private static void printMe(Character[] i) {
//		for (Character x : i) {
//			System.out.printf("%s", x);
//		}		
//		System.out.println();
//	}

//	one method for both cases
// T is a placeholder for type parameter that was Integer or String in examples above
		public static <T> void printMe(T[] x){
			for (T b : x) {
				System.out.printf("%s", b);
			}
			System.out.println();
		}
	}
