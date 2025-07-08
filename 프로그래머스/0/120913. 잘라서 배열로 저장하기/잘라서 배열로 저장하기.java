import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        int start = 0;
        
        while(start < my_str.length()) {
            if (start+n > my_str.length()) {
                answer.add(my_str.substring(start, my_str.length()));
            } else {
                answer.add(my_str.substring(start, start+n));
            }
            
            start += n;
        }
        
        return answer.stream().toArray(String[]::new);
    }
}