import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        int i=1;
        while(true) {
            String binary = Integer.toBinaryString(i);
            int num = Integer.parseInt(binary);
            num*=5;
            if (num>r) break;
            if(num>=l) answer.add(num);
            
            i++;
        }
        
        if (answer.isEmpty()) return new int[]{-1};
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}