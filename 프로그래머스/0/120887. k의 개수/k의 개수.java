class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kk = "" + k;
        
        for (int l=i; l<=j; l++) {
            String temp = "" + l;
            if (temp.contains(kk)) {
                for (int m=0; m<temp.length(); m++) {
                    if (temp.charAt(m) == kk.charAt(0)) answer++;
                }
            }
        }
        return answer;
    }
}