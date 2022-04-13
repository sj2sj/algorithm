import java.util.*;


/* 아나그램 (HashMap) */

public class Main {
	public String solution(String str, String str2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		for (char x : str2.toCharArray()) {
			if (!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			} else {
				map.put(x, map.get(x)-1);
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		String str2 = kb.next();
		
		System.out.println(T.solution(str, str2));
	}
}
