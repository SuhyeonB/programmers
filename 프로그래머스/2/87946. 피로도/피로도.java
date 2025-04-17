class Solution {
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        return dfs(k, 0, visited, dungeons);
    }
    
    public int dfs(int k, int cnt, boolean[] visited, int[][] dungeons) {
        int answer = cnt;
        for (int i=0; i<dungeons.length; i++) {
            if(k>=dungeons[i][0] && !visited[i]) { // 피로도가 충분하고 방문한 적 없다면
                visited[i] = true;  // 방문
                int a = dfs(k-dungeons[i][1], cnt+1, visited, dungeons);    // 다음 던전 방문
                answer = Math.max(answer, a);
                // 방문에 실패할 경우
                visited[i] = false; // backtracking
                
            }
        }
        return answer;
    }
}