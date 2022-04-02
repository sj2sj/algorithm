import java.util.*;


/* 연속 부분 수열 */

public class Main {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int sum = 0;
		
		for (int i = 0, p = 0; i < n; i++) {
			sum += arr[i];
			if (sum == m) {
				answer++;
			} 
			while (sum >= m) {
				sum -= arr[p++];
				if (sum == m) {
					answer++;
				}
			}
		}

		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); //수열 개수
		int m = kb.nextInt(); //수열 합
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
		

		

	
		
		
	}
}
