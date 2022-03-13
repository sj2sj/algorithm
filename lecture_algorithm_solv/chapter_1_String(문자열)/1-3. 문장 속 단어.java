import java.util.*;

/* 문장 속 단어 */

public class Main {
	public String solution(String str) {
		String answer = "";
		
		String[] strArr = str.split(" "); //띄어쓰기 기준으로 자름
		int len = Integer.MIN_VALUE; //최소값
		
		for (String st : strArr) {
			if (st.length() > len) {
				answer = st;
				len = st.length();
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); 
		System.out.print(T.solution(str));
	}
}
