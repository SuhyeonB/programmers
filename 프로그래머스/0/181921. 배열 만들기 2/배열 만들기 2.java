import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i=5; i<=r; i+=5) {
            String temp = "" + i; 
            if(temp.contains("1") | temp.contains("2") | temp.contains("3") | temp.contains("4") | temp.contains("6") | temp.contains("7") | temp.contains("8") | temp.contains("9")) continue;
            if (i >= l) answer.add(i);
        }
        
        if (answer.isEmpty()) {
            return new int[]{-1};
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}