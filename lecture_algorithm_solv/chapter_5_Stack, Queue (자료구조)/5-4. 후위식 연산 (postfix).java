import java.util.*;


/* 후위식 연산 (postfix) */

public class Main {
	public int solution(String str) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for (char x : str.toCharArray()) {
			if (Character.isDigit(x)) { //숫자
				stack.push(x-48); //char to int
			} else {
				//연산 순서 주의 
				int rn = stack.pop();
				int ln = stack.pop();
				if (x == '+') stack.push(ln+rn);
				if (x == '-') stack.push(ln-rn);
				if (x == '*') stack.push(ln*rn);
				if (x == '/') stack.push(ln/rn);
			}
		}
		
		answer = stack.get(0);
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next(); //352+*9-
	
		System.out.println(T.solution(str));
	}
}
