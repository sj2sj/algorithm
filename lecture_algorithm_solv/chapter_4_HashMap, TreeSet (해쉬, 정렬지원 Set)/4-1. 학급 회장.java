import java.util.*;


/* 힉급 회장 (HashMap) */

public class Main {
	public char solution(int n, String str) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1); //x라는 key가 존재하지 않을 경우 0을 반환, 있으면 x의 value 반환
		}
		
		int max = Integer.MIN_VALUE;
		for (char key : map.keySet()) { //map에 존재하는 key를 모두 탐색
			if (map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); 
		
		String str = kb.next();
		
		System.out.println(T.solution(n, str));
	}
}
