/* 문자열 다루기 기본 */

class Solution {
    public boolean solution(String s) {
        if (isDigit(s) && s.length() == 4 || s.length() == 6) {
            return true;
        }
        
        return false;
    }
    
    public boolean isDigit(String s) {
        char[] arr = s.toCharArray();
        for (char x : arr) {
            if (!(x >= '0' && x <= '9')) return false;
        }
        return true;
    }
}