/* 완주하지 못한 선수 */

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String x : completion) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for (int i = 0; i < participant.length; i++) {
            if (map.containsKey(participant[i])) { //완주 O
                if (map.get(participant[i]) > 1) {
                    map.put(participant[i], map.get(participant[i])-1);
                } else {
                    map.remove(participant[i]);
                }
            } else {
                return participant[i];
            }
        }


        return null;
    }
}