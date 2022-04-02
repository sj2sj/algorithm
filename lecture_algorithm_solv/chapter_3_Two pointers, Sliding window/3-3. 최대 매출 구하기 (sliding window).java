import java.util.*;


/* 최대 매출 구하기 
 * (슬라이딩 윈도우) */

public class Main {
	public int solution(int n, int k, int[] arr) {
		int sum = 0;
		int answer = 0;
		
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		
		answer = sum;
		
		for (int i = k; i < n; i++) {
			sum += arr[i];
			sum -= arr[i-k];
			
			answer = Math.max(answer, sum);
		}

		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); //n일 간의 매출 기록
		int k = kb.nextInt(); //연속된 k일
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(n, k, arr));
		

		

	
		
		
	}
}
