import java.util.*;
public class reverseString {

	public static void main(String[] args) {
		String s = "abcsadydd";
		System.out.println(reverseString(s));
	}
	
	private static String reverseString(String s) {
		char[] chs = s.toCharArray();
		int i = 0, j = chs.length - 1;
		while(i < j) {
			swap(chs, i++, j--);
		}
		
		return new String(chs);
	}
	
	private static void swap(char[] chs, int i, int j) {
		if(i == j) return;
		char temp = chs[i];
		chs[i] = chs[j];
		chs[j] = temp;
	}
}

