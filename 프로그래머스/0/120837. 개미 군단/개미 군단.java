class Solution {
    public int solution(int hp) {
        int answer = 0;
        if (hp >= 5) {
            answer += hp / 5;
            hp -= answer*5;
        }
        if (hp >= 3) {
            answer += hp / 3;
            int temp = hp / 3;
            hp -= temp*3;
        }
        answer += hp;
        
        return answer;
    }
}