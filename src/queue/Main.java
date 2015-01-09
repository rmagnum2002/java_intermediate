package queue;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("first");
		q.offer("second");
		q.offer("third");

		System.out.printf("%s", q);
		System.out.println();
		
		// .peek - return element with highest priority
		System.out.println(q.peek());
		
		// poll - reove from queue first el with highest priority
		q.poll();
		System.out.printf("%s ", q);
	}
}
