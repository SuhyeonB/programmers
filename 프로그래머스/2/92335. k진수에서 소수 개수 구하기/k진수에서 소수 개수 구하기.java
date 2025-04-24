import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        long d = 1, num = 0;
        while(n!=0) {
            num += n%k * d;
            n /= k; d *= 10;
        }
        
        String str = num + "";
        String[] sarr = str.split("0");
        long[] arr = new long[sarr.length];
        
        for(int i=0; i<sarr.length; i++){
            if (sarr[i].equals(""))  { arr[i] = 0; continue; }
            arr[i] = Long.parseLong(sarr[i]);
        }
        
        for(int i=0; i<arr.length; i++) {
            boolean b = true;
            if (arr[i] == 1) continue;
            if (arr[i]!=2 && arr[i]%2 == 0) continue;
            if(arr[i]>4) {
                for(int j=3; j<=Math.sqrt(arr[i]); j++) {
                    if (arr[i]%j == 0) {
                        b = false; break;
                    }
                }
            }
            if (b) answer++;
        }
        return answer;
    }
}