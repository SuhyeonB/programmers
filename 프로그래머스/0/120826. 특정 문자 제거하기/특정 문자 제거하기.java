class Solution {
    public String solution(String my_string, String letter) {
        char l = letter.charAt(0);
        char[] arr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(char a : arr) {
            if (a != l) sb.append(a);
        }
        return sb.toString();
    }
}