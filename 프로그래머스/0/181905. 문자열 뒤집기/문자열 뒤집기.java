class Solution {
    public String solution(String my_string, int s, int e) {
        String left = my_string.substring(0, s);
        StringBuilder sb = new StringBuilder(my_string.substring(s, e+1));
        String middle = sb.reverse().toString();
        String right = my_string.substring(e+1, my_string.length());
        
        String answer = left+middle+right;
        return answer;
    }
}