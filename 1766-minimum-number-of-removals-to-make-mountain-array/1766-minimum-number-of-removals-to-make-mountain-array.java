import java.util.Arrays;

class Solution {
    int[] left, right;
    
    // Helper function for the increasing subsequence from the start up to index i
    public int getIncreasing(int[] nums, int i) {
        if (left[i] != -1) return left[i];
        
        int max = 1;
        for (int j = 0; j < i; j++) {
            if (nums[j] < nums[i]) {
                max = Math.max(max, getIncreasing(nums, j) + 1);
            }
        }
        left[i] = max;
        return left[i];
    }

    // Helper function for the decreasing subsequence from the end down to index i
    public int getDecreasing(int[] nums, int i) {
        if (right[i] != -1) return right[i];
        
        int max = 1;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] < nums[i]) {
                max = Math.max(max, getDecreasing(nums, j) + 1);
            }
        }
        right[i] = max;
        return right[i];
    }

    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        left = new int[n];
        right = new int[n];
        Arrays.fill(left, -1);
        Arrays.fill(right, -1);
        
        int maxMountain = 0;
        
        for (int i = 1; i < n - 1; i++) {
            int leftLIS = getIncreasing(nums, i);
            int rightLIS = getDecreasing(nums, i);

            if (leftLIS > 1 && rightLIS > 1) {
                maxMountain = Math.max(maxMountain, leftLIS + rightLIS - 1);
            }
        }
        
        return n - maxMountain;
    }
}
