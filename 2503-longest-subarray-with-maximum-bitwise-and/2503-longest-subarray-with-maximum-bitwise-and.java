class Solution {
    public int longestSubarray(int[] nums) {
        int maxVal = nums[0];    // Track the maximum value
        int maxLength = 0;       // Length of the longest subarray
        int currentLength = 0;   // Current length of the subarray

        // Single loop for both max calculation and subarray length tracking
        for (int i = 0; i < nums.length; i++) {
            // Update max value if current number is larger
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                currentLength = 1; // Reset current subarray length
                maxLength = 1;     // Reset max length
            } else if (nums[i] == maxVal) {
                // Extend the current subarray if it's equal to max value
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                // Reset the current subarray length if we find a smaller value
                currentLength = 0;
            }
        }

        return maxLength;
    }
}
