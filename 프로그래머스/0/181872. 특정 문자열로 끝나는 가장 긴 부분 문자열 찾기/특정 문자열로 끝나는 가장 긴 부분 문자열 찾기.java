class Solution {
    public String solution(String myString, String pat) {
        int x = myString.lastIndexOf(pat);
        
        x += pat.length();
        return myString.substring(0, x);
    }
}