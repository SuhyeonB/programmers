class Solution {
    public int solution(int[] arr1, int[] arr2) {
        // 길이 비교
        if (arr1.length > arr2.length) return 1;
        if (arr1.length < arr2.length) return -1;
        
        int sum1 = 0, sum2 = 0;
        
        for(int a1 : arr1) sum1 += a1;
        for(int a2 : arr2) sum2 += a2;
        
        // 합 비교
        if (sum1 > sum2) return 1;
        if (sum1 < sum2) return -1;
        return 0;
    }
}