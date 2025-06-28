import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int dif = Math.abs(n-array[0]);
        int answer = array[0];
        
        for (int i=1; i<array.length; i++) {
            if (Math.abs(n-array[i]) == dif) {
                answer = (answer < array[i]) ? answer : array[i];
            }
            if (Math.abs(n-array[i]) < dif) {
                answer = array[i];
                dif = Math.abs(n-array[i]);
            }
            
        }
        return answer;
    }
}