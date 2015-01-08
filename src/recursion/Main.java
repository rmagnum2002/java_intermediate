package recursion;

public class Main {

	public static void main(String[] args) {
		System.out.println(fact(5));
	}
	
	// factorial
	public static long fact(long n){
		if (n <= 1)
			return 1;
		else
			return n * fact(n-1);
	}	

}


// factorial
// 5! factorial - 5*4*3*2*1 = 120