import java.util.*;

/* 팰린드롬 (회문 문자열)
 * 특수문자는 무시하기 */

public class Main {
	public String solution(String str) {
		String answer = "NO";
		
		//문자열 대문자로 바꾸고 알파벳 아닌 것들은 치환
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		
		//팰린드롬 비교
		if (str.equals(new StringBuilder(str).reverse().toString())) {
			answer= "YES";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
