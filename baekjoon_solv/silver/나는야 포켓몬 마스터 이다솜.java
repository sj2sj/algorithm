import java.util.*;


/* 나는야 포켓몬 마스터 이다솜 */

public class Main {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(); // 도감 길이
		int m = kb.nextInt(); // 문제 개수
		
		Map<Integer, String> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		
		for (int i = 1; i <= n; i++) {
			String inputPoke = kb.next();
			map1.put(i, inputPoke);
			map2.put(inputPoke, i);
		}
		
		for (int i = 0; i < m; i++) {
			String s = kb.next();
			if (Character.isDigit(s.charAt(0))) {
				System.out.println(map1.get(Integer.parseInt(s)));
			} else {
				System.out.println(map2.get(s));
			}
		}
		
	}
}

