import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] current = Arrays.copyOf(arr, arr.length);

        while (true) {
            int[] next = Arrays.copyOf(current, current.length);

            for (int i = 0; i < next.length; i++) {
                if (next[i] >= 50 && next[i] % 2 == 0) {
                    next[i] /= 2;
                } else if (next[i] < 50 && next[i] % 2 == 1) {
                    next[i] = next[i] * 2 + 1;
                }
            }

            if (Arrays.equals(current, next)) break;

            current = next;
            answer++;
        }

        return answer;
    }
}