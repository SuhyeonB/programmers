import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        
        int sum = 0;
        for (int i=0; i<d.length; i++) {
            sum += d[i]; answer++;
            if (sum > budget) {
                sum -= d[i];
                answer--;
            }
            
        }
        return answer;
    }
}