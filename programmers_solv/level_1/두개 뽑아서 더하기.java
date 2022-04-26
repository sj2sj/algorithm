/* 두개 뽑아서 더하기 */
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
		Set<Integer> set = new TreeSet<Integer>();
		
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
            	set.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = set.stream().sorted().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}