public class Solution {
    public String solution(int age) {
        StringBuilder result = new StringBuilder();
        String ageStr = String.valueOf(age);

        for (char digit : ageStr.toCharArray()) {
            char alienChar = (char) ('a' + (digit - '0'));
            result.append(alienChar);
        }

        return result.toString();
    }
}