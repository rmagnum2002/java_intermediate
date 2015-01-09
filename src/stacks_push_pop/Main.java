package stacks_push_pop;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		st.push("bottom");
		printStack(st);
		st.push("second");
		printStack(st);
		st.push("third");
		printStack(st);
		
		st.pop();
		printStack(st);
		st.pop();
		printStack(st);
		st.pop();
		printStack(st);
	}

	private static void printStack(Stack<String> s) {
		if (s.isEmpty()) {
			System.out.println("Nothing in stack");
		} else {
			System.out.printf("%s TOP\n", s);
		}
	}
}
