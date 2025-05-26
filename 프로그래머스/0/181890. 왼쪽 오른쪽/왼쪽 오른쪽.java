import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        int left = -1; int right = -1;
        
        for (int i=0; i<str_list.length; i++) {
            if (str_list[i].equals("l")) {
                left = i; break;
            }
            if(str_list[i].equals("r")) {
                right = i; break;
            }
        }
         if (left != -1) {
             for (int i=0; i<left; i++) answer.add(str_list[i]);
         }
        if (right != -1) {
            for (int i=right+1; i<str_list.length; i++) answer.add(str_list[i]);
        }
        
        return answer.stream().toArray(String[]::new);
    }
}