import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] pow = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        boolean b = false;
        
        for (int i=0; i<pow.length; i++) {
            if (arr.length == pow[i]) { b = true; break; }
            if (len < pow[i]) { len = pow[i]; break; }
        }
        
        if (b) return arr;
        
        return Arrays.copyOf(arr, len);
    }
}