class Solution {
    public int solution(int[] num_list, int n) {
        boolean b = false;
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] == n) { b = true; break; }
        }
        
        if (b) return 1;
        return 0;
    }
}