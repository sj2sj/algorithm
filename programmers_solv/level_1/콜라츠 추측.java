/* 콜라츠 추측 */

class Solution {
    public int solution(int num) {
        int answer = 0;
        long lNum = (long)num; //int로 계산할 경우 오버플로우 발생 
        
        while (answer < 500) {
        	if (lNum == 0 || lNum == 1) return answer;
        	
        	if (lNum % 2 == 0) { //짝수
        		lNum /= 2;
            } else { //홀수
            	lNum *= 3;
            	lNum++;
            	
            }
        	answer++;
        } 
        
        return -1;
    }
}