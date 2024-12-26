class Solution {
    int [] [] dp ;
    public int findTargetSumWays(int[] nums, int target) {
        dp = new int[nums.length][3000] ; 
        for(int i = 0 ; i<dp.length;i++)
        Arrays.fill(dp[i],-1);
        return get(nums,target,0,0) ;
    }
    public int get(int []nums , int target , int i,int sum){ 
        if(i==nums.length){
            return sum==target?1:0 ;
        }
        if(dp[i][sum+1000]!=-1){
            return dp[i][sum+1000];
        }
        int x =  get(nums,target,i+1,sum+nums[i])+get(nums,target,i+1,sum-nums[i]) ;
        dp[i][sum+1000] =x ; 
        return x;
    }
}