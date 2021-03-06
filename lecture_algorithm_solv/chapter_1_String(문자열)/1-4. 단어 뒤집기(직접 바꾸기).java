import java.util.*;

/* 단어 뒤집기 (직접 바꾸기) */

public class Main {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<String>();
		
		for (String x : str) {
			char [] s = x.toCharArray();
			int lt = 0;
			int rt = x.length()-1;
			
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
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
