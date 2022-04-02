import java.util.*;


/* 최대 길이 연속부분수열 */

public class Main {
	public int solution(int n, int k, int[] arr) {
		int answer = 0;
		int cnt = 0; //0을 1로 바꾼 횟수
		int lt = 0;
		
		for (int rt = 0; rt < n; rt++) {
			if (arr[rt] == 0) {
				cnt++;
			}
			while (cnt > k) { //바꾼 횟수 초과 시
				if (arr[lt] == 0) {
					cnt--;
				}
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
					
		}
		
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); //수열의 길이
		int k = kb.nextInt(); //0을 1로 변경할 수 있는 횟수
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, k, arr));
	}
}
