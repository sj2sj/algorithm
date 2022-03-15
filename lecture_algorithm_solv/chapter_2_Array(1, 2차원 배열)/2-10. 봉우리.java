import java.util.*;

/* 봉우리 구하기
 * 격자판의 숫자 중, 자신의 상하좌우 숫자보다 크면 봉우리 지역이 됨 */

public class Main {
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	
	public int solution(int n, int[][] arr) {
		int answer = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean flag = true; //봉우리인지 아닌지 판별해주는 변수
				for (int k = 0; k < 4; k++) { //dx, dy(상하좌우 돌기 위한 for)
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if (flag) answer++;
			}
		}
		
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
