class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        
        int pCnt = 0, yCnt = 0;
        
        for(char a : arr) {
            if (a == 'p') pCnt++;
            else if (a == 'y') yCnt++;
        }
        
        return (pCnt == yCnt);
    }
}