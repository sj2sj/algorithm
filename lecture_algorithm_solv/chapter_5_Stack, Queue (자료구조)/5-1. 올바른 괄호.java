import java.util.*;


/* 올바른 괄호 */

public class Main {
	public String solution(String str) {
		String answer = "YES";
		
		Stack<Character> stack = new Stack<Character>();
		
		for (char x : str.toCharArray()) {
			if (x == '(') {
				stack.push(x);
			} else { //닫는 괄호
				if (stack.isEmpty()) return "NO"; //닫는 괄호 만났는데 스택이 비어있으면 맞는 짝이 없는 경우
				else {
					stack.pop();
				}
			}
		}
		
		if (!stack.isEmpty()) return "NO"; //여는 괄호가 더 많았을 경우
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
	
		System.out.println(T.solution(str));
	}
}
