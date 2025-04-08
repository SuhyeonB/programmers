import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i=0; i<progresses.length; i++) {
            int temp = 100 - progresses[i];
            temp = (temp % speeds[i] == 0) ? temp/speeds[i] : temp/speeds[i] +1;
            queue.add(temp);
        }
        
        while (queue.size()>0) {
            int head = queue.poll();
            int temp = 1; 
            while (!queue.isEmpty() && queue.peek() <= head) {
                    queue.poll(); temp++;
            
            }
            list.add(temp);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}