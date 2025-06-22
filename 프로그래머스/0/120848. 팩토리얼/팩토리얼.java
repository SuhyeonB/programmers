class Solution {
    public int solution(int n) {
        int answer = 1;
        
        long factorial = 1;
        
        while(factorial < n) {
            answer++;
            factorial *= answer;
        }
        
        if (factorial > n) answer--;
        return answer;
    }
}