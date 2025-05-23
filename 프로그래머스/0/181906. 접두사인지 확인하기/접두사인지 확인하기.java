class Solution {
    public int solution(String my_string, String is_prefix) {
        int len1 = my_string.length();
        int len2 = is_prefix.length();
        
        if (len2 > len1) return 0;
        
        String comp = my_string.substring(0, len2);
        
        if (comp.equals(is_prefix)) return 1;
        else return 0;
    }
}