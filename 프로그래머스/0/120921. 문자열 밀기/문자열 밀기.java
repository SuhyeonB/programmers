class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) return 0;
        
        int len = A.length();
        
       for (int i = 1; i < len; i++) { 
            StringBuilder sb = new StringBuilder(len);
            for (int j = 0; j < len; j++) {
                int idx = (j - i + len) % len;
                sb.append(A.charAt(idx));
            }
            String temp = sb.toString();
            if (B.equals(temp)) return i;
        }
        return -1;
    }
}