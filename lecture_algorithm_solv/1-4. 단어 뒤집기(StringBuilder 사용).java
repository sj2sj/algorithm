import java.util.*;

/* 단어 뒤집기 */

public class Main {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<String>();
		
		for (String s : str) {
			//StringBuilder의 reverse 메서드를 사용하여 단어 뒤집기
			String tmp = new StringBuilder(s).reverse().toString();
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); //몇 개의 단어를 입력받을지
		String[] str = new String[n];
		
		for (int i = 0; i < n; i++) {
			str[i] = kb.next();
		}
		
		for (String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}
}
