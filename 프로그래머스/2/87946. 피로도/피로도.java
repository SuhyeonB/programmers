class Solution {
    int answer = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, 0, dungeons, visited);
        return answer;
    }

    public void dfs(int k, int count, int[][] dungeons, boolean[] visited) {
        answer = Math.max(answer, count);

        for (int i = 0; i < dungeons.length; i++) {
            int min = dungeons[i][0];
            int cost = dungeons[i][1];

            if (!visited[i] && k >= min) {
                visited[i] = true;
                dfs(k - cost, count + 1, dungeons, visited);
                visited[i] = false;
            }
        }
    }
}
