class Solution {
    public int solution(int n) {
        int answer = n / 7;
        answer += (n%7 == 0) ? 0 : 1;
        return answer;
    }
}