class Solution {
    public int solution(String dartResult) {
        int[] darts = new int[3];
        int answer = 0;
        
        int idx = -1;
        
        for (int i=0; i<dartResult.length(); i++) {
            if (Character.isDigit(dartResult.charAt(i))) {
                idx++;
                if (dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0') { // 10일 경우
                    darts[idx] = 10;
                    i++;
                } else {
                    darts[idx] = dartResult.charAt(i) - '0';
                }
            }
            
            if (dartResult.charAt(i) == 'D') {
                darts[idx] = darts[idx] * darts[idx];
            } 
            if (dartResult.charAt(i) == 'T') {
                darts[idx] = darts[idx] * darts[idx] * darts[idx];
            }
            
            if (dartResult.charAt(i) == '*') {
                if (idx == 0) {
                    darts[0] = darts[0] * 2;
                } else {
                    darts[idx-1] = darts[idx-1] * 2;
                    darts[idx] = darts[idx] * 2;
                }
            }
            if (dartResult.charAt(i) == '#') {
                darts[idx] = darts[idx] * (-1);
            }
        }
        for (int d : darts) {
            answer += d;
        }
        
        return answer;
    }
}