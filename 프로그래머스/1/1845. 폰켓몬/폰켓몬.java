import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int take = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        if (map.size() < take) return map.size();
        return take;
    }
}