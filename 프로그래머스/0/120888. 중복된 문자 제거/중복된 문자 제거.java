import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Boolean> map = new HashMap<>();
        
        for (int i=0; i<my_string.length(); i++) {
            if (!map.containsKey(my_string.charAt(i))) {
                map.put(my_string.charAt(i), true);
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}