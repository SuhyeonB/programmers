class Solution {
    public int solution(int[] common) {
        
        if (common[1]-common[0] == common[2]-common[1]) {
            int n = common[1] - common[0];
            return common[common.length-1] + n;
        } else {
            int n = common[1] / common[0];
            return common[common.length-1] * n;
        }
        
    }
}