import java.util.*;

/* 회문 문자열
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열 */

public class Main {
	public String solution(String str) {
		String answer = "YES";
		
		str = str.toUpperCase();
		
		int len = str.length();
		for (int i = 0; i < len/2; i++) {
			if (str.charAt(i) != str.charAt(len-i-1)) {
				answer = "NO";
				break;
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
