package common_string_mehods;

public class StartsEndsWith {

	public static void main(String[] args) {
		String[] words = {"funk", "chunk", "furry", "baconator" };
	
	
		//startsWith
		for (String w : words) {
			if (w.startsWith("fu")) {
				System.out.println(w + " starts with fu");
			}
		}
		//endWith
		for (String w : words) {
			if (w.endsWith("unk")) {
				System.out.println(w + " starts with unk");
			}
		}
	}

}
