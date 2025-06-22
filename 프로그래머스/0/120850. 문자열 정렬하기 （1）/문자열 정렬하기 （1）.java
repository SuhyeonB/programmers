import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        char[] arr = my_string.toCharArray();
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++) {
            if ((int)arr[i] >= 48 & (int)arr[i] <= 57) {
                list.add(arr[i] - '0');
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}