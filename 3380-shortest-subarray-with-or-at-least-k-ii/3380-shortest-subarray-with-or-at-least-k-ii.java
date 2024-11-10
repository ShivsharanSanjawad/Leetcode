class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int currentOR = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            currentOR |= nums[i];  // Expand the window

            // Shrink the window when OR is greater than or equal to k
            while (j <= i && currentOR >= k) {
                minLength = Math.min(minLength, i - j + 1);
                
                // Check if currentOR will be valid after removing nums[j]
                if ((currentOR & (~nums[j])) >= k) {
                    currentOR &= ~nums[j]; // Bit manipulation to remove effect
                } else {
                    currentOR = 0; // Reset and recalculate
                    for (int p = j + 1; p <= i; p++) {
                        currentOR |= nums[p];
                    }
                }
                j++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
    }
}
