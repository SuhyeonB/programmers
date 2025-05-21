class Solution {
    public int solution(String number) {
        char[] arr = number.toCharArray();
        int num = 0;
        
        for (int i=0; i<arr.length; i++) {
            int temp = arr[i] - '0';
            num += temp;
        }
        
        return num%9;
    }
}