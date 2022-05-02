/* 자연수 뒤집어 배열로 만들기 */

class Solution {
    public int[] solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();  
        int[] answer = new int[arr.length];
        
        for (int i = arr.length-1; i >= 0; i--) {
        	answer[answer.length-i-1] = arr[i]-48;
        }

        return answer;
    }
}