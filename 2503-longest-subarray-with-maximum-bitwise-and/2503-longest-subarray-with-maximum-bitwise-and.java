class Solution {
    public int longestSubarray(int[] nums) {
        int prev = nums[0]; 
        int max = 0; 
        int prevmax = prev; 
        int length = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > prev) {
                prev = nums[i];
                length = 1;
                max = 1;
            } else if (nums[i] == prev) {
                length++;
                max = Math.max(max, length);
            } else {
                length = 0;
            }
        }

        return max;
    }
}
