class Solution {
    public int solution(String[] babbling) {
        String[] possible = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (String word : babbling) {
            boolean isValid = true;
            
            for (String sound : possible) {
                if (word.contains(sound + sound)) {
                    isValid = false;
                    break;
                }
            }
            
            if (!isValid) continue;
            
            for (String sound : possible) {
                word = word.replace(sound, " ");
            }
            
            if (word.replace(" ", "").isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}