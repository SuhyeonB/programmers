class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int having = chicken;
        while(having >= 10) {
            answer += having/10;
            int rest = having % 10;
            having = having / 10 + rest;
        }
        return answer;
    }
}