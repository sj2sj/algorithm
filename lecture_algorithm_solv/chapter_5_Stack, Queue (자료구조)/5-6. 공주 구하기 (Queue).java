import java.util.*;


/* 공주 구하기 */

public class Main {
	public int solution(int n, int k) {
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList<Integer>();
	
		//queue 처음에 세팅 1~n
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		while (queue.size() > 1) {
			for (int i = 1; i <= k; i++) {
				if (i == k) queue.poll();
				else queue.offer(queue.poll());
			}
		}
		
		answer = queue.peek();
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); //왕자 수
		int k = kb.nextInt(); //제외 될 왕자의 번호
	
		System.out.println(T.solution(n, k));
	}
}
