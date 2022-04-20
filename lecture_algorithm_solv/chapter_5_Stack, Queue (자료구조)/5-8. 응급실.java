import java.util.*;


/* 응급실 */

public class Main {
	public int solution(int n, int m, int[] arr) {
		int answer = 1; //진료 순서
		
		Queue<Person> queue = new LinkedList<>();
	
		for (int i = 0; i < n; i++) {
			queue.offer(new Person(i, arr[i]));
		}
		
		while (!queue.isEmpty()) {
			Person tempP = queue.poll();
			for (Person p : queue) {
				if (p.priority > tempP.priority) {
					queue.offer(tempP);
					tempP = null;
					break;
				}
			}
			if (tempP != null) {
				if (tempP.id != m) {
					answer++;
					continue;
				} else {
					break;
				}
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); //환자 수
		int m = kb.nextInt(); //m번째 환자
		
		int[] arr = new int[n]; 
		
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		
		System.out.println(T.solution(n, m, arr));
	}
}


class Person {
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}