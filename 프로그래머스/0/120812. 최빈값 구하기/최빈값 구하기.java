import java.util.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        
        int answer = 0;
        int freq = 0;
        
        for (int k : map.keySet()) {
            if (freq < map.get(k)) {
                freq = map.get(k);
                answer = k;
            }
        }
        
        int cnt = 0; 
        for (int k : map.keySet()) {
            if (freq == map.get(k)) cnt++;
        }
        
        if (cnt > 1) return -1;
        return answer;
    }
}