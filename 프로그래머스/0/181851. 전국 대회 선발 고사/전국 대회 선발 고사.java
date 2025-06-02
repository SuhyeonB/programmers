import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> idx = new ArrayList<>();
        for(int i=0; i<rank.length; i++) idx.add(i);
        
        idx.sort(Comparator.comparingInt(i -> rank[i]));
        
        List<Integer> top = idx.stream()
            .filter(i -> attendance[i])
            .limit(3)
            .collect(Collectors.toList());
        
        int a = top.get(0), b = top.get(1), c = top.get(2);
        return 10000 * a + 100 * b + c;
    }
}