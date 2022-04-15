import java.util.*;


/* 크레인 인형뽑기 (카카오 문제) */

public class Main {
	public int solution(int[][] board, int[] moves) {
		int answer = 0; //터뜨린 인형 개수
		int bomb = 2; //터뜨려지는 인형의 개수
		
		Stack<Integer> stack = new Stack<>();
		
		
		for (int pos : moves) {
			for (int i = 0; i < board.length; i++) {
				if (board[i][pos-1] != 0) {
					int temp = board[i][pos-1];
					board[i][pos-1] = 0;
					
					if (!stack.isEmpty() && temp == stack.peek()) {
						answer += bomb;
						stack.pop();
					} else {
						stack.push(temp);
					}
					break; //if문 한번 돌고 for문 다시 돌리기 위한 break문
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt(); // N*N 배열을 생성하기 위함
		
		int[][] board = new int[n][n];
		
		//N*N 배열 생성
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		
		int m = kb.nextInt(); // moves 배열의 길이
		int[] moves = new int[m];
		
		for (int i = 0; i < m; i++) {
			moves[i] = kb.nextInt();
		}
	
		System.out.println(T.solution(board, moves));
	}
}
