import java.util.*;
public class iterateMap {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 2);
		map.put(2, 3);
		map.put(3,4);
		map.put(5,6);
		System.out.println(iterateWhile(map));
	}
	
	private static String iterateWhile(Map<Integer, Integer> map) {
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> cur = it.next();
			sb.append("key: ").append(cur.getKey()).append(" value: ").append(cur.getValue());
		}
		
		return sb.toString();
	}
	
	
	
	
	private static String iterateAdvancedFor(Map<Integer, Integer> map) {
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			sb.append("key: ").append(entry.getKey()).append(" value: ").append(entry.getValue()).append("\n");
		}
		return sb.toString();
	}
	
}

