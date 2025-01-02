class Solution {
    int [][] dp ;
    public int rob(int[] nums) {
        dp = new int[nums.length+1][2];
        if(nums.length==1){
            return nums[0];
        }
        for(int i =0 ;i<nums.length;i++)
            Arrays.fill(dp[i],-1);
        return Math.max(get(nums,0,nums.length-1),get(nums,1,nums.length)) ;
    }
    public int get(int []nums,int i , int n){
        if(i>=n){
            return 0 ;
        }
        if(dp[i][n==nums.length?0:1]!=-1){
            return dp[i][n==nums.length?0:1];
        }
        int one = nums[i] + get(nums,i+2,n);
        int two = get(nums,i+1,n);
        return dp[i][n==nums.length?0:1] =Math.max(one,two);

    }
}
