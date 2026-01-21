import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        int[] stuck = new int[N + 2];
        for (int s : stages) {
            stuck[s]++;
        }

        Map<Integer, Double> failure = new HashMap<>();

        int challengers = stages.length;
        for (int i = 1; i <= N; i++) {
            int notClear = stuck[i];

            double f = (challengers == 0) ? 0.0 : (double) notClear / challengers;
            failure.put(i, f);

            challengers -= notClear;
        }

        List<Map.Entry<Integer, Double>> list = new ArrayList<>(failure.entrySet());
        list.sort((a, b) -> {
            int cmp = Double.compare(b.getValue(), a.getValue());
            if (cmp != 0) return cmp;
            return Integer.compare(a.getKey(), b.getKey());
        });

        for (int idx = 0; idx < N; idx++) {
            answer[idx] = list.get(idx).getKey();
        }

        return answer;
    }
}
