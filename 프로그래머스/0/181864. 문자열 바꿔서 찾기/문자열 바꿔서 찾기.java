class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "C");
        myString = myString.replace("B", "A");
        myString = myString.replace("C", "B");
        
        if (myString.contains(pat)) return 1;
        return 0;
    }
}