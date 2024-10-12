import java.util.*;

class Solution {
    public int minGroups(int[][] intervals) {
        // Sort intervals by start time, and by end time if start times are the same
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } 
            return Integer.compare(a[0], b[0]);
        });

        // Priority queue to track overlapping intervals
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int[] interval : intervals) {
            // If the earliest ending interval does not overlap with the current one
            if (!pq.isEmpty() && pq.peek() < interval[0]) {
                pq.poll(); // Remove the interval that has ended
            }
            // Add the end time of the current interval
            pq.offer(interval[1]);
        }
        
        // The size of the priority queue represents the number of groups needed
        return pq.size();
    }
}
