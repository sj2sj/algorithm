import java.util.*;

/* 보이는 학생 */

public class Main {
	public int solution(int n, int[] arr) {
		int answer = 1;
			
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (max < arr[i]) {
				answer++;
				max = arr[i];
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		//숫자 받기
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, arr));
		
	}
}
