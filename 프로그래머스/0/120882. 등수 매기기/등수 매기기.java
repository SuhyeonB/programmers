class Solution {
    public int[] solution(int[][] score) {
        int[] list = new int[score.length];
        int[] answer = new int[score.length];
        
        for (int i=0; i<score.length; i++) {
            list[i] = score[i][0] + score[i][1];
        }
        
        for (int i=0; i<score.length; i++) {
            int rank = 1;
            for (int j=0; j<score.length; j++) {
                if (list[i] < list[j]) rank++;
            }
            answer[i] = rank;
        }
        return answer;
    }
}