class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int w1 = Math.abs(dots[0][0]-dots[1][0]);
        int w2 = Math.abs(dots[0][0]-dots[2][0]);
        int w = Math.max(w1, w2);
        
        int h1 = Math.abs(dots[0][1]-dots[1][1]);
        int h2 = Math.abs(dots[0][1]-dots[2][1]);
        int h = Math.max(h1, h2);
        
        return w*h;
    }
}