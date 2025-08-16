import java.util.*;

class Solution {
    public int solution(String before, String after) {
        if (before.length() != after.length()) return 0;
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for (int i=0; i<before.length(); i++) {
            map1.put(before.charAt(i), map1.getOrDefault(before.charAt(i),0)+1);
        }
        for (int i=0; i<before.length(); i++) {
            map2.put(after.charAt(i), map2.getOrDefault(after.charAt(i),0)+1);
        }
        
        return map1.equals(map2) ? 1 : 0;
    }
}