class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n]; 
        int num = 1;
        int x = 0, y = 0;
        int[][] dir = { {0,1}, {1,0}, {0,-1}, {-1,0} }; // → ↓ ← ↑
        int d = 0;

        while (num <= n * n) {
            answer[x][y] = num;
            num++;

            int nx = x + dir[d][0];
            int ny = y + dir[d][1];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                d = (d + 1) % 4;
                nx = x + dir[d][0];
                ny = y + dir[d][1];
            }

            x = nx;
            y = ny;
        }

        return answer;
    }
}