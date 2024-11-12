class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];  
            } else {
                return b[1] - a[1];  
            }
        });
        HashMap<Integer, Integer> h = new HashMap<>();
        int maxBeauty = 0;
        for (int i = 0; i < items.length; i++) {
            maxBeauty = Math.max(maxBeauty, items[i][1]);
            h.put(items[i][0], maxBeauty);
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int idx = lowerBound(items, queries[i]);
            if (idx == -1) {
                result[i] = 0;  
            } else {
                result[i] = h.get(items[idx][0]);
            }
        }

        return result;
    }
    public int lowerBound(int[][] items, int query) {
        int left = 0 ; 
        int right = items.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (items[mid][0] <= query) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left == 0 ? -1 : left - 1;
    }
}