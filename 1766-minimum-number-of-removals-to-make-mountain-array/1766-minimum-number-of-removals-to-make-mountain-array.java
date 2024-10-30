import java.util.Arrays;

class Solution {
    int[] dp;
    int []dp2 ; 
    public int get(int[] nums, int i) {
        if (dp[i] != -1) {
            return dp[i];
        }
        int max = 1;
        for (int j = i-1; j >=0; j--) {
            if (nums[i] > nums[j]) {
                max = Math.max(max, get(nums, j) + 1);
            }
        }
        dp[i] = max;
        return dp[i];
    }

    public int get2(int[] nums, int i) {
        if (dp2[i] != -1) {
            return dp2[i];
        }
        int max = 1;
        for (int j =i; j <nums.length; j++) {
            if (nums[i] > nums[j]) {
                max = Math.max(max, get2(nums, j) + 1);
            }
        }
        dp2[i] = max;
        return dp2[i];
    }

    public int minimumMountainRemovals(int[] nums) {
        int max = 0;
        dp = new int[nums.length];
        dp2 = new int[nums.length];
        Arrays.fill(dp,-1);
        Arrays.fill(dp2,-1);

        for (int i = 1; i < nums.length - 1; i++) {
            int left = get(nums,i); 
            int right = get2(nums, i); 

            if (left > 1 && right > 1) { 
                max= Math.max(max, left + right - 1);
            }
        }
        return nums.length - max;
    }
}
