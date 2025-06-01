import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("b", "a");
        myStr = myStr.replace("c", "a");
        String[] answer = Arrays.stream(myStr.split("a"))
            .filter(s -> !s.isEmpty())
            .toArray(String[]::new);
        
        if (answer.length == 0) return new String[] {"EMPTY"};
            
        return answer;
    }
}