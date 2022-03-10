import java.util.*;

/* 특정 문자 뒤집기 
 * 알파벳일 경우에만 뒤집고, 특수문자일 땐 놔두기 */

public class Main {
	public String solution(String str) {
		String answer = "";
		
		char[] s = str.toCharArray();
		
		int lt = 0;
		int rt = str.length()-1;
		
		while (lt < rt) {
			if (!Character.isAlphabetic(s[lt])) { //왼쪽 문자가 알파벳이 아닐 때
				lt++;
			} else if (!Character.isAlphabetic(s[rt])) { //오른쪽 문자가 알파벳이 아닐 때
				rt--;
			} else { //왼쪽, 오른쪽 문자가 둘 다 알파벳일 때
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		
		answer = String.valueOf(s);
		
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
