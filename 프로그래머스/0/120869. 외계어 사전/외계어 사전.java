import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Set<String> spellSet = new HashSet<>(Arrays.asList(spell));

        for (String word : dic) {
            if (word.length() != spell.length) continue;

            Set<String> wordSet = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                wordSet.add(String.valueOf(word.charAt(i)));
            }

            if (wordSet.equals(spellSet)) return 1;
        }

        return 2;
    }
}