import java.util.*;

class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } 
            return Integer.compare(a[0], b[0]);
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int[] interval : intervals) {
            if (!pq.isEmpty() && pq.peek() < interval[0]) {
                pq.poll(); 
            }
            pq.offer(interval[1]);
        }
        return pq.size();
    }
}
