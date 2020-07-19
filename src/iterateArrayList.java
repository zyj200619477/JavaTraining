import java.util.*;
public class iterateArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(iterateWhile(list));
	}
	
	private static String iterateWhile(List<Integer> list) {
		StringBuilder sb = new StringBuilder();
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int num = it.next();
			sb.append(num).append(" ");
		}
		
		return sb.toString();
	}
	
	
	private static String iterateFor(List<Integer> list) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append(" ");
		}
		return sb.toString();
	}
	
	
	private static String iterateAdvancedFor(List<Integer> list) {
		StringBuilder sb = new StringBuilder();
		for(int num : list) {
			sb.append(num).append(" ");
		}
		return sb.toString();
	}
	
}

