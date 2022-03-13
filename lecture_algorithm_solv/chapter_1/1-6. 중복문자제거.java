import java.util.*;

/* 중복 문자 제거 */

public class Main {
	public String solution(String str) {
		String answer = "";
		
		for (int i = 0; i < str.length(); i++) {
			//현재 문자의 순서와 찾고자 하는 문자의 처음 부분이 같으면, 중복 X
			if (i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
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
