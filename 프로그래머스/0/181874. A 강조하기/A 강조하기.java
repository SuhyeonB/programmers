class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        
        char[] arr = myString.toCharArray();
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i]=='a') arr[i] = 'A';
        }
        String answer = new String(arr);
        return answer;
    }
}