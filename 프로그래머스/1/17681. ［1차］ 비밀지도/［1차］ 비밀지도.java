class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[] sum = new int[n];
        String[] answer = new String[n];
        
        for (int i=0; i<n; i++) {
            sum[i] = arr1[i] | arr2[i];
            String b = String.format("%" + n + "s", Integer.toBinaryString(sum[i]));
            answer[i] = b;
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }
        return answer;
    }
}