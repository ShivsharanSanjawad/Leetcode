import java.util.*;

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        // Sort items by value first, then by beauty in descending order
        Arrays.sort(items, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];  // Compare by value
            } else {
                return b[1] - a[1];  // Compare by beauty (descending)
            }
        });

        // Create a map to store the maximum beauty for each value <= query
        HashMap<Integer, Integer> h = new HashMap<>();
        int maxBeauty = 0;

        // Traverse the sorted items and update the max beauty for each value
        for (int i = 0; i < items.length; i++) {
            maxBeauty = Math.max(maxBeauty, items[i][1]);
            h.put(items[i][0], maxBeauty);
        }

        // Prepare the result for each query
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            // Find the lower bound for each query
            int idx = lowerBound(items, queries[i]);
            if (idx == -1) {
                result[i] = 0;  // If no item has a value <= query, return 0
            } else {
                result[i] = h.get(items[idx][0]);
            }
        }

        return result;
    }

    // Helper method to perform lower bound search on sorted items array
    private int lowerBound(int[][] items, int query) {
        int left = 0, right = items.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (items[mid][0] <= query) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // If left is 0, it means no item is <= query, return -1
        return left == 0 ? -1 : left - 1;
    }
}
