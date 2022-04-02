import java.util.*;

/* 두 배열 힙치기 */

public class Main {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int p1 = 0; //a를 가리키는 포인터
		int p2 = 0; //b를 가리키는 포인터
		
		while (p1 < n && p2 < m) { // 비교 대상이 배열 길이보다 커지면 반복문 중단
			if (a[p1] < b[p2]) {
				answer.add(a[p1++]); //p1이 가리키는 값을 넣은 후에 p1 값이 증가
			} else {
				answer.add(b[p2++]);
			}
		}
		
		while (p1 < n) {
			answer.add(a[p1++]);
		}
		while (p2 < m) {
			answer.add(b[p2++]);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); 
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = kb.nextInt();
		}
		
		int m = kb.nextInt(); 
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = kb.nextInt();
		}
		
	
		for (int x : T.solution(n, m, a, b)) {
			System.out.print(x+ " ");
		}
		
	
		
		
	}
}
