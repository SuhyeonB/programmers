class Solution {
    public int solution(int num, int k) {
        String number = num + "";
        String kStr = k + "";
        
        int answer = number.indexOf(kStr);
        if (answer != -1) return answer+1;
        return answer;
    }
}