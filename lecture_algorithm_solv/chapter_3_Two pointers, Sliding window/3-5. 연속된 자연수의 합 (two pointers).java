import java.util.*;


/* 연속된 자연수의 합 */

public class Main {
	public int solution(int n) {
		int answer = 0;
		int sum = 0;
		int lt = 0; //왼쪽에서 부터 밈
		
		//예를 들어, n이 15일 때 n/2+1까지만 확인하면 된다.
		//ex, 7+8까지가 가질 수 있는 최대의 연속된 자연수의 합이다. 8+8만 되도 16이 되기 때문에 X
		int m = n/2+1;
		int[] arr = new int[m];
		
		//배열에 값 넣어주기
		for (int i = 0; i < m; i++) {
			arr[i] = i+1;
		}
		
		//연속된 자연수 합 구함
		for (int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			if (sum == n) {
				answer++;
			}
			while (sum >= n) {
				sum -= arr[lt++];
				if (sum == n) {
					answer++;
				}
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); //연속된 자연수
		
		System.out.println(T.solution(n));
	}
}
