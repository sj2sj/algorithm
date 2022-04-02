import java.util.*;


/* 공통 원소 구하기 */

public class Main {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int p1 = 0; //a를 가리키는 포인터
		int p2 = 0; //b를 가리키는 포인터
		
		Arrays.sort(a);
		Arrays.sort(b);
		

		while (p1 < n && p2 < m) {
			if (a[p1] > b[p2]) {
				p2++;
			} else if (a[p1] < b[p2]) {
				p1++;
			} else {
				answer.add(a[p1]);
				p1++;
				p2++;
			}
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
