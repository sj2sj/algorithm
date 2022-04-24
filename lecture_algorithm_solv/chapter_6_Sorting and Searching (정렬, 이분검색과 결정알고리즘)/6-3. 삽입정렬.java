import java.util.*;


/* 선택 정렬 */

public class Main {
	public int[] solution(int n, int[] arr) {
		
		for (int i = 1; i < n; i++) {
			int temp = arr[i];
			for (int j = i-1; j >= 0; j--) {
				if (arr[j] > temp) {
					arr[j+1] = arr[j];
					arr[j] = temp;
				} else {
					break;
				}
			}
		}
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); //배열 길이
		
		int[] arr = new int[n]; 
		
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		
		for (int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}

