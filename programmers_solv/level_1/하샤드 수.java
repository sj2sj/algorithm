/* 하샤드 수 */

class Solution {
    public boolean solution(int x) {
       String str = x + "";
       char[] arr = str.toCharArray();
       
       int sum = 0;
       for (int i = 0; i < arr.length; i++) {
    	   sum += arr[i] - '0';
       }
       if (x % sum == 0) {
    	   return true;
       } else {
    	   return false;
       }
    }
}