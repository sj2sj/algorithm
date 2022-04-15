import java.util.*;


/* K번쨰 큰 수 */

public class Main {
	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		
		TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder()); //내림차순으로 정렬되도록
		
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int l = j+1; l < n; l++) {
					tSet.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		
		int cnt = 0;
		for (int x : tSet) {
			cnt++;
			if (cnt == k) {
				return x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); //n장의 카드 수
		int k = kb.nextInt(); //k번째로 큰 수

		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
	
		System.out.println(T.solution(n, k, arr));
	}
}
