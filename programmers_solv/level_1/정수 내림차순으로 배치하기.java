/* 정수 내림차순으로 배치하기 */

class Solution {
    public long solution(Long n) {
        char[] arr = String.valueOf(n).toCharArray();
        
        for (int i = 0; i < arr.length-1; i++) {
        	int idx = i;
        	for (int j = i+1; j < arr.length; j++) {
        		if (arr[idx] < arr[j]) {
        			idx = j;
        		}	
        	}
        	char tmp = arr[i];
    		arr[i] = arr[idx];
    		arr[idx] = tmp;
        }
        
        
        long answer = Long.parseLong(String.valueOf(arr));
        
        return answer;
    }
}