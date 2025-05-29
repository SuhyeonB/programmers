class Solution {
    public String solution(String my_string, String alp) {
        char[] arr = my_string.toCharArray();
        char a = alp.charAt(0);
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == a) arr[i] = Character.toUpperCase(arr[i]);
        }
        String answer = new String(arr);
        return answer;
    }
}