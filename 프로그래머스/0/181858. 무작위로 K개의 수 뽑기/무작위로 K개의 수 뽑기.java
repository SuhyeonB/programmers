import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++) {
            if (answer.size() == k) break;
            
            if (answer.size() == 0) answer.add(arr[i]);
            
            if (answer.contains(arr[i])) continue;
            answer.add(arr[i]);
        }
        
        while (answer.size() < k) {
            answer.add(-1);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}