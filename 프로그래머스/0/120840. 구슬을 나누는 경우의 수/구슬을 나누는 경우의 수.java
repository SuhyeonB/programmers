class Solution {
    public long solution(int balls, int share) {
        long result = 1L;

        // nCr = n*(n-1)*...*(n-r+1) / r!
        for (int i = 0; i < share; i++) {
            result *= (balls - i);
            result /= (i + 1);
        }

        return result;
    }
}