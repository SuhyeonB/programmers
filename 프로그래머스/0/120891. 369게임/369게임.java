class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while(order > 0) {
            int o = order % 10;
            
            if (o%3 == 0 & o!=0) answer++;
            
            order /= 10;
        }
        return answer;
    }
}