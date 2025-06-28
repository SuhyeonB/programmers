import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        String[] arr = my_string.split("");
        
        for (int i=0; i<arr.length; i++) {
            char c = arr[i].charAt(0);
            if ((int)c > 96) {
                sb.append(arr[i].toUpperCase());
            } else {
                sb.append(arr[i].toLowerCase());
            }
        }
        return sb.toString();
    }
}