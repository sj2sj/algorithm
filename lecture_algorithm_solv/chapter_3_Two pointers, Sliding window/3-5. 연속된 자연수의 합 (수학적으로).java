import java.util.*;


/* 연속된 자연수의 합 (수학) */
// 정말 신기한 방법이닷...
// 만약 n이 15라면
// 일단 연속된 자연수 칸을 배정해준다.
// ex. 1, 2 그럼 15-1-2 = 12
// 12를 나눈 칸(2) 만큼 나눠서 나머지가 0이면 연속된 자연수의 합이다.

public class Main {
	public int solution(int n) {
		int answer = 0;
		int cnt = 1; //연속된 자연수 칸 나눠준 변수 ex. 7+8 이면 cnt = 2
		
		n--;
		while (n > 0) {
			cnt++;
			n = n-cnt;
			if (n % cnt == 0) {
				answer++;
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
