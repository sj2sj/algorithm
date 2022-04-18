import java.util.*;


/* 교육과정 설계 */

public class Main {
	public String solution(String str, String str2) {
		String answer = "YES";
		
		Queue<Character> queue = new LinkedList<>();
	
		//필수과목 순서 세팅
		for (char x : str.toCharArray()) {
			queue.offer(x);
		}
		
		for (int i = 0; i < str2.length(); i++) {
			if (queue.contains(str2.charAt(i))) {
				if (queue.peek() != str2.charAt(i)) {
					return "NO";
				} else {
					queue.poll();
				}
			}
		}
		
		if (!queue.isEmpty()) return "NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next(); //필수과목 순서
		String str2 = kb.next(); //현수가 짠 수업설계
	
		System.out.println(T.solution(str, str2));
	}
}
