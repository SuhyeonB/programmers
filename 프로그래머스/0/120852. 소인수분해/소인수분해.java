import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i=2; i<=n; i++) {
            if (n % i == 0) {
                if (!answer.contains(i)) answer.add(i);
                n /= i;
                i--;
            }
            
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}