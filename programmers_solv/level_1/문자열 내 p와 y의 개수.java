/* 문자열 내 p와 y의 개수 */

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;

        char[] arr = s.toLowerCase().toCharArray();
        
        for (char x : arr) {
        	if (x == 'p') count++;
        	else if (x == 'y') count--;
        }
        
        if (count == 0) return true;

        return answer;
    }
}