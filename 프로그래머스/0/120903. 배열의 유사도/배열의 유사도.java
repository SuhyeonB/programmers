import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        
        for (String s : s1) list.add(s);
        
        for (int i=0; i<s2.length; i++) {
            if (list.contains(s2[i])) answer++;
        }

        return answer;
    }
}