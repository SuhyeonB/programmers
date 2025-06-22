class Solution {
    public int solution(String my_string) {
        char[] arr = my_string.toCharArray();
        int answer = 0;
        
        for (int i=0; i<arr.length; i++) {
            if ((int)arr[i] >= 48 & (int)arr[i] <= 57) {
                answer += (arr[i] - '0');
            }
        }
        return answer;
    }
}