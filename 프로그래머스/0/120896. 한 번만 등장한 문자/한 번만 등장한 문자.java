import java.util.*;
class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        
        List<Character> list = new ArrayList<>();
        
        for (Character k : map.keySet()) {
            if (map.get(k) == 1) list.add(k);
        }
        
        Collections.sort(list);
        
        String answer = "";
        
        for (Character c : list) answer += c;
        return answer;
    }
}