package common_string_mehods;

public class FindCharAndSubstringInAString {

	public static void main(String[] args) {
		String s = "buckyroberstbuckyroberts";
		
		// find index of k char in string. Starts with 0.
		System.out.println(s.indexOf('k'));
		
		// find k char in string starting with index 5
		System.out.println(s.indexOf('k', 5));
		// next k char will be at index of 15
	
		// find index of x, not existing char
		System.out.println(s.indexOf('x'));
		// returns -1 or false
		
		// find index of rob string in string. Starts with 0.
		System.out.println(s.indexOf("rob"));
		
		String b = "Bacon ";
		String c = "monster";
		String d = "   trim  ";
		
		// concatenate strings
		System.out.println(b+c);
		//is same as:
		System.out.println(b.concat(c));
		
		//replace
		System.out.println(b.replace('B', 'F'));
		
		//upper case
		System.out.println(b.toUpperCase());
		
		//trim - remove white space
		System.out.println(d.trim());
	}

}
