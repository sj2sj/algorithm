import java.util.*;


/* 괄호 문자 제거 */

public class Main {
	public String solution(String str) {
		String answer = "";
		
		Stack<Character> stack = new Stack<Character>();
		
		for (char x : str.toCharArray()) {
			if (x == ')') {
				while (stack.pop() != '(') {} //stack.pop() return : pop한 char
			} else { //여는 괄호
				stack.push(x);
			}
		}
	
		for (int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
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
