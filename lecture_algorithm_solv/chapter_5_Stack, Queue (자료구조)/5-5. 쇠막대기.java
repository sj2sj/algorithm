import java.util.*;


/* 쇠막대기 */

public class Main {
	public int solution(String str) {
		int answer = 0;
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ')') {
				if (str.charAt(i-1) == '(') { //레이저
					stack.pop();
					answer += stack.size();
				} else {
					stack.pop();
					answer++;
				}
			} else {
				stack.push(str.charAt(i));
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next(); 
	
		System.out.println(T.solution(str));
	}
}
