import java.util.*;

/* 특정 문자 개수 찾기 */

public class Main {
	// str: 문자열, t: 찾을 문자
	public int solution(String str, char t) {
		int answer = 0; //문자 개수
		
		//대소문자 구분 안하고 찾기 위함
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == t) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); //문자열 입력
		char c = kb.next().charAt(0); //찾을 문자 입력
		System.out.print(T.solution(str, c));
	}
}
