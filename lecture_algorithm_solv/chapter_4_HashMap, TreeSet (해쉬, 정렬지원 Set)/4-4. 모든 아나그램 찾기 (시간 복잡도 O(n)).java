import java.util.*;


/* 모든 아나그램 찾기 */

public class Main {
	public int solution(String s, String t) {
		int answer = 0;
		HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
		
		//문자열 t에 대한 hashmap 저장
		for (int i = 0; i < t.length(); i++) {
			tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0)+1);
		}
		
		
		//문자열 s에 대한 hashmap (two pointer 사용하면서 아나그램 찾기)
		for (int i = 0; i < t.length()-1; i++) {
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
		}
		
		int lt = 0;
		for (int rt = t.length()-1; rt < s.length(); rt++) {
			sMap.put(s.charAt(rt), sMap.getOrDefault(s.charAt(rt), 0)+1);
			if (tMap.equals(sMap)) {
				answer++;
			}
			sMap.put(s.charAt(lt), sMap.get(s.charAt(lt))-1);
			if (sMap.get(s.charAt(lt)) == 0) {
				sMap.remove(s.charAt(lt));
			}
			lt++;
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		String str2 = kb.next();
	
		System.out.println(T.solution(str, str2));
	}
}
