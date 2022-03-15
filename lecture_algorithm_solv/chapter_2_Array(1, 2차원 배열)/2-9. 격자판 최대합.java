import java.util.*;

/* 격자판 최대합 */

public class Main {

	
	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int lineSum = 0; //행의 합
		int rowSum = 0; //열의 합
		
		//행의 합, 열의 합을 구함
		for (int i = 0; i < n; i++) {
			lineSum = 0;
			rowSum = 0;
			for (int j = 0; j < n; j++) {
				lineSum += arr[i][j];
				rowSum += arr[j][i];
			}
			answer = Math.max(answer, lineSum);
			answer = Math.max(answer, rowSum);
		}
		
		lineSum = 0;
		rowSum = 0;
		
		//대각선 합 구함
		for (int i = 0; i < n; i++) {
			lineSum += arr[i][i];
			rowSum += arr[n-i-1][i];
		}
		answer = Math.max(answer, lineSum);
		answer = Math.max(answer, rowSum);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution(n, arr));
		
	}
}
