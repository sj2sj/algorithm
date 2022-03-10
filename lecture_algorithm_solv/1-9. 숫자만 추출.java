import java.util.*;

/* 숫자만 추출 */

public class Main {
	public int solution(String str) {
		int answer = 0;

		str = str.replaceAll("[^0-9]", ""); //숫자만 추출
		answer = Integer.parseInt(str); //int형으로 변환
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
