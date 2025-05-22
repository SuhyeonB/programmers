class Solution {
    public int solution(String my_string, String is_suffix) {
        int len1 = my_string.length();
        int len2 = is_suffix.length();
        
        if (len1 < len2) return 0;
        
        String sub = my_string.substring(len1-len2, len1);
        
        if(sub.equals(is_suffix)) return 1;
        else return 0;
    }
}