class Solution {
    public int solution(int n) {
        int pieces = 6;
        int answer = 1;
        while(pieces%n != 0) {
            pieces+=6;
            answer++;
        }
        return answer;
    }
}