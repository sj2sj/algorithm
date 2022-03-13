import java.util.*;

/* 가장 짧은 문자 거리 */

public class Main {
	public int[] solution(String str, char t) {
		int[] answer = new int[str.length()];

		int p = 1000; //기준값 최대치
		
		//왼쪽에서부터 문자거리 찾기
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		
		//오른쪽에서부터 문자거리 찾기
		p = 1000;
		
		for (int i = str.length()-1; i >= 0; i--) {
			if (str.charAt(i) == t) {
				p = 0;
			} else {
				p++;
				//왼쪽부터 넣은 값(거리)보다 작을 때 넣기
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		for (int x : T.solution(str, c)) {
			System.out.print(x +  " ");
		}
	}
}
