import java.util.*;
import java.util.Map;
public class isPalindrome {

	public static void main(String[] args) {
		String s = "a word in a in word world queue disk";
		System.out.println(isPalindrome("woow"));
	}
	
	private static boolean isPalindrome(String s) {
		//assume empty string is palindrome
		if(s == null || s.length() == 0) return true;
		int n = s.length();
		for(int i = 0; i < n / 2; i++) {
			if(s.charAt(i) != s.charAt(n - 1 - i)) return false;
		}
		return true;
	}
	
	
	private static boolean isPalindrome(int num) {
		String n = String.valueOf(num);
		return isPalindrome(n);
	}
}

