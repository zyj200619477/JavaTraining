import java.util.*;
public class removeWriteSpace {
	public static void main(String[] args) {
		String s = "abcsadydd";
		System.out.println(removeWhiteSpace("abc efg shhhh"));
	}
	
	private static String removeWhiteSpace(String s) {
		char[] arrs = s.toCharArray();
		int j = 0;
		StringBuilder sb = new StringBuilder();
		while(j < arrs.length) {
			char c = arrs[j++];
			if(c != ' ')
				sb.append(c);
		}
		
		return sb.toString();
	}
	
	
}
