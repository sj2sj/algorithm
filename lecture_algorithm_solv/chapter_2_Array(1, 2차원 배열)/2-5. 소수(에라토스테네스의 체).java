import java.util.*;

/* 소수(에라토스테네스의 체) */

public class Main {
	public int solution(int n) {
		int answer = 0;
		
		//ex. 20을 입력받았을 경우 인덱스 번호는 0~19까지 생성되기 때문에
		//계산 편하게 하기 위해 +1해서 인덱스 번호를 20까지 맞춰줌
		int[] arr = new int[n+1];
			
		for (int i = 2; i <= n; i++) {
			if (arr[i] == 0) {
				answer++;
				for (int j = i; j <= n; j=j+i) {
					arr[j] = 1;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
	
		System.out.println(T.solution(n));
	}
}
