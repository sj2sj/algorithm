/* 제일 작은 수 제거하기 */

class Solution {
   public int[] solution(int[] arr) {
		
       if (arr.length == 1) {
    	   arr[0] = -1;
    	   return arr;
       } else {
    	   int[] answer = new int[arr.length-1];
    	   int min = arr[0];
    	   for (int i = 1; i < arr.length; i++) {
    		   if (min > arr[i]) {
    			   min = arr[i];
    		   }
    	   }
    	   
    	   int idx = 0;
    	   for (int i = 0; i < arr.length; i++) {
    		   if (arr[i] == min) {
    			   continue;
    		   } else {
    			   answer[idx] = arr[i];
    			   idx++;
    		   }
    	   }
    	   return answer;
       }
    }
}