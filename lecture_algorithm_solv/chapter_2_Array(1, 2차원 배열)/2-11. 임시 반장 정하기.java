import java.util.*;

/* 임시 반장 정하기 */

public class Main {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 1; i <= n; i++) { //학생 번호
			int cnt = 0;
			for (int j = 1; j <= n; j++) { //학생 번호(비교 학생)
				for (int k = 1; k <= 5; k++) {
					if (arr[i][k] == arr[j][k]) { 
						cnt++;
						break; //같은 학생과 다른 학년 때 같은 반 되어도 카운팅 X
					}
				}
			}
			if (cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+1][6]; //[n번학생][학년(5)] index 0번은 사용하지 않고 1번부터 사용하기 위해 +1씩 해줌
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution(n, arr));
	}
}
