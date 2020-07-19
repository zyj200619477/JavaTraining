import java.util.*;
import java.util.Map;
public class findDupliateCharacter {

	public static void main(String[] args) {
		String s = "a word in a in word world queue disk";
		System.out.println(findDuplicate("abbbbcccccadef"));
	}
	
	private static String findDuplicate(String s) {
		Set<Character> set = new HashSet<>();
		Set<Character> duplicate = new HashSet<>();
		for(char c : s.toCharArray()) {
			if(!set.add(c)) {
				duplicate.add(c);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c : duplicate) {
			sb.append(c).append(" ");
		}
		
		return sb.toString();
	}
}

