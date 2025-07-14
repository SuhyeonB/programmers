class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] line = new int[201];

        for (int[] l : lines) {
            int start = l[0] + 100;
            int end = l[1] + 100;

            for (int i = start; i < end; i++) {
                line[i]++;
            }
        }
        
        for (int i=0; i<201; i++) {
            if (line[i] >= 2) answer++;
        }
        return answer;
    }
}