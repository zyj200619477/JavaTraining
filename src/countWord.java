import java.util.*;
import java.util.Map;
public class countWord {

	public static void main(String[] args) {
		String s = "a word in a in word world queue disk";
		System.out.println(countWord(s));
	}
	
	private static String countWord(String s) {
		Map<String, Integer> map = new HashMap<>();
		String[] words = s.split(" ");
		for(String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			sb.append("word: " + entry.getKey() + " " + "count: " + entry.getValue() + "\n");
		}
		return sb.toString();
	}
}

