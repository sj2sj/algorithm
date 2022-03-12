import java.util.*;

/* 암호
 * # -> 이진수 1, * -> 이진수 0 */

public class Main {
	public String solution(int n, String str) {
		String answer = "";
		
		for (int i = 0; i < n; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2); //2진수로 변경
			answer += (char)num; //아스키코드를 문자로 변경
			
			str = str.substring(7);
		}
				
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}
}
