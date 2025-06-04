import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> result = new ArrayList<>();

        for (String row : picture) {
            StringBuilder expandedRow = new StringBuilder();
            for (char ch : row.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    expandedRow.append(ch);
                }
            }

            for (int i = 0; i < k; i++) {
                result.add(expandedRow.toString());
            }
        }

        return result.toArray(new String[0]);
    }
}