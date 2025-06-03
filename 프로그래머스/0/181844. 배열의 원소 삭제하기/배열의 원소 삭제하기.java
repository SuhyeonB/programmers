import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for (int a : arr) answer.add(a);
        
        for (int i=0; i<delete_list.length; i++) {
            if (answer.contains(delete_list[i])) answer.remove(Integer.valueOf(delete_list[i]));
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}