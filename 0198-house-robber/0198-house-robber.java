class Solution {
    int dp[] ;
    public int rob(int[] nums) {
        dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return get(nums,0);
    }
    public int get(int []nums,int i){
        if(i>=nums.length){
            return 0 ;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int choose = nums[i] +  get(nums,i+2) ;
        int not = get(nums,i+1) ;
        return dp[i] =Math.max(choose,not);
    }
}
